package br.com.ufjf.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SPARQLReturn")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://mballem.wordpress.com/")
public class SPARQLReturn {

    @XmlElement(name = "subject", required = true)
    private String subject;
    @XmlElement(name = "predicate", required = true)
    private String predicate;
    @XmlElement(name = "objectZX", required = true)
    private String objectZX;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public String getObjectZX() {
        return objectZX;
    }

    public void setObjectZX(String objectZX) {
        this.objectZX = objectZX;
    }

}
