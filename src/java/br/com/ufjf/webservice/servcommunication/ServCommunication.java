package br.com.ufjf.webservice.servcommunication;

import br.com.ufjf.base.MetodoAuxiliar;
import br.com.ufjf.model.main.Communication;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author magnus
 */
@WebService(serviceName = "ServCommunication")
public class ServCommunication {

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

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     *
     * @param idRationale
     * @param idEmissor
     * @param idReceptor
     * @param mensagem
     * @return
     */
    @WebMethod(operationName = "fullCommunicationXML")
    public String fullCommunicationXML(@WebParam(name = "idRationale") int idRationale, @WebParam(name = "idEmissor") int idEmissor, @WebParam(name = "idReceptor") int idReceptor, @WebParam(name = "mensagem") String mensagem) {
        Communication com = new Communication();
        com.setIdRationale(idRationale);
        com.setIdScientistEmissor(idEmissor);
        com.setIdScientistReceptor(idReceptor);
        com.setMessage(mensagem);
        Date hoje = new Date();
        String data;
        data = MetodoAuxiliar.getHojeFormat();
        com.setData(data);
        String hora = MetodoAuxiliar.getHora();
        com.setHora(hora);
        com.setLidaSn(1);
        String local = "/PL-Science/communication.xml";
        String xml = marshalToFile(com, local);
        return local;

    }

}
