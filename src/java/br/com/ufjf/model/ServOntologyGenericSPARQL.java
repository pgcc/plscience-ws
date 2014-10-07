package br.com.ufjf.model;

import br.com.ufjf.webservice.servcommunication.ServCommunication;
import static br.com.ufjf.webservice.servcommunication.ServCommunication.marshalToFile;
import java.util.ArrayList;
import com.hp.hpl.jena.ontology.OntDocumentManager;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author magnus
 */
public class ServOntologyGenericSPARQL {

    
      /**
     * Converte o objeto em uma estrutura XML. grava em arquivo
     *
     * @param object objeto a ser convertido em XML.
     * @param fileName nome do arquivo XML a ser gerado.
     * @return uma string com o conteudo do XML gerado.
     */
    @SuppressWarnings("finally")
    public static String marshalToFile(Object object, String fileName) {
        final StringWriter out = new StringWriter();
        Writer writer = null;
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(
                    javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            marshaller.marshal(object, new StreamResult(out));

            writer = new FileWriter(fileName);
            marshaller.marshal(object, writer);
        } catch (PropertyException e) {
            // e.printStackTrace();
        } catch (JAXBException e) {
            // e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(ServCommunication.class.getSimpleName()).log(Level.SEVERE, null,
                    ex);

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return out.toString();
    }
    
    
    
    public static  ArrayList<SPARQLReturn> returnGenericSparql(String urlOntologia, String SPARQL) throws Exception {

        OntDocumentManager mgr = new OntDocumentManager();

        OntModelSpec s = new OntModelSpec(OntModelSpec.OWL_MEM);

        s.setDocumentManager(mgr);

        OntModel m = ModelFactory.createOntologyModel(s, null);

        m.read(urlOntologia);
       

        String queryString = SPARQL;

        com.hp.hpl.jena.query.Query query = QueryFactory.create(queryString);

        // Execute the query and obtain results
        QueryExecution qe = QueryExecutionFactory.create(query, m);

        try {
            ResultSet rs = qe.execSelect();

            // Armazena o resultado da Query SparQL
            ArrayList<QuerySolution> qs = new ArrayList<QuerySolution>();

            ArrayList<String> stringLine = new ArrayList<String>();
            ArrayList<SPARQLReturn> stringRetorno = new ArrayList<SPARQLReturn>();
            SPARQLReturn1  regina = new SPARQLReturn1();
            while (rs.hasNext()) {
                QuerySolution sq = null;
                sq = rs.nextSolution();
                qs.add(sq);
                stringLine.add( sq.toString());
                int intObject = sq.toString().indexOf("( ?object = ");
                System.out.println("intObject "+intObject);
                int intPredicate = sq.toString().indexOf("( ?predicate = ");
                 System.out.println("intPredicate "+intPredicate);
                int intSubject = sq.toString().indexOf("( ?subject = ");               
                System.out.println("intSubject "+intSubject);
               
                if ((intObject != -1) && (intPredicate != -1) && (intSubject != -1)) {//object nao existe
                    SPARQLReturn  retorno = new SPARQLReturn();
                    String objectZX = sq.toString().substring(intObject, intPredicate);
                    retorno.setObjectZX(objectZX);
                    System.out.println("Object-Object " + objectZX);
                    String Predicate = sq.toString().substring(intPredicate, intSubject);
                    retorno.setPredicate(Predicate);
                    System.out.println("Predicate-Predicate " + Predicate);
                    String Subject = sq.toString().substring(intSubject);
                    retorno.setSubject(Subject);
                    System.out.println("Subject-Subject " + Subject);
                    stringRetorno.add(retorno);
                }    
            }
            
            regina.setRetorno(stringRetorno);
            
             String local = "/PL-Science/SPARQL.xml";
             String xml = marshalToFile(regina, local);
            return stringRetorno;

        } finally {
            qe.close();
        }
    }

    
    
    public static void main(String[] args){
        try {
               ArrayList<SPARQLReturn> stringRetorno = new ArrayList<SPARQLReturn>();
        stringRetorno =  returnGenericSparql("http://plscience.superdignus.com/CollaborativePL-ScienceOntologyv1.owl",  "SELECT  ?object ?predicate ?subject WHERE { ?subject  ?predicate  ?object}");
        
            for (SPARQLReturn a : stringRetorno) {
                System.out.println("OBJECT: "+a.getObjectZX());
                System.out.println("PREDICATE: "+a.getPredicate());
                System.out.println("SUBJECT: "+a.getSubject());
            }
        
     
        
        } catch (Exception ex) {
            Logger.getLogger(ServOntologyGenericSPARQL.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    
    
    
}//ULTIMO
