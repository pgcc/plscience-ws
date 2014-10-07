package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WhereTable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idWhere;

    public WhereTable() {
    }

    public Integer getIdWhere() {
        return this.idWhere;
    }

    public void setIdWhere(Integer idWhere) {
        this.idWhere = idWhere;
    }

}
