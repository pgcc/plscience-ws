package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WhoTable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idWho;
    private int idScientist;

    public WhoTable() {
    }

    public WhoTable(int idScientist) {
        this.idScientist = idScientist;
    }

    public Integer getIdWho() {
        return this.idWho;
    }

    public void setIdWho(Integer idWho) {
        this.idWho = idWho;
    }

    public int getIdScientist() {
        return this.idScientist;
    }

    public void setIdScientist(int idScientist) {
        this.idScientist = idScientist;
    }

}
