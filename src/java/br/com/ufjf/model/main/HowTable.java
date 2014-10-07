package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HowTable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idHow;
    private String description;

    public HowTable() {
    }

    public HowTable(String description) {
        this.description = description;
    }

    public Integer getIdHow() {
        return this.idHow;
    }

    public void setIdHow(Integer idHow) {
        this.idHow = idHow;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
