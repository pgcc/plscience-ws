package br.com.ufjf.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SPARQLReturn1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SPARQLReturn1",
        propOrder = {"retorno"},
        namespace = "http://mballem.wordpress.com/"
)
public class SPARQLReturn1 {

    @XmlElementWrapper(name = "Retornos")
    @XmlElement(name = "Retorno")
    private Collection<SPARQLReturn> retorno;

    public Collection<SPARQLReturn> getRetorno() {
        return retorno;
    }

    public void setRetorno(Collection<SPARQLReturn> retorno) {
        this.retorno = retorno;
    }

}
