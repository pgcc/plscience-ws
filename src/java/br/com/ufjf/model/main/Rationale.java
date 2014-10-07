package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rationale implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idRationale;
    private int idWho;
    private int idWhen;
    private int idWhere;
    private int idWhat;
    private int idHow;
    private Integer idNewRationale;

    public Rationale() {
    }

    public Rationale(int idWho, int idWhen, int idWhere, int idWhat, int idHow) {
        this.idWho = idWho;
        this.idWhen = idWhen;
        this.idWhere = idWhere;
        this.idWhat = idWhat;
        this.idHow = idHow;
    }

    public Rationale(int idWho, int idWhen, int idWhere, int idWhat, int idHow, Integer idNewRationale) {
        this.idWho = idWho;
        this.idWhen = idWhen;
        this.idWhere = idWhere;
        this.idWhat = idWhat;
        this.idHow = idHow;
        this.idNewRationale = idNewRationale;
    }

    public Integer getIdRationale() {
        return this.idRationale;
    }

    public void setIdRationale(Integer idRationale) {
        this.idRationale = idRationale;
    }

    public int getIdWho() {
        return this.idWho;
    }

    public void setIdWho(int idWho) {
        this.idWho = idWho;
    }

    public int getIdWhen() {
        return this.idWhen;
    }

    public void setIdWhen(int idWhen) {
        this.idWhen = idWhen;
    }

    public int getIdWhere() {
        return this.idWhere;
    }

    public void setIdWhere(int idWhere) {
        this.idWhere = idWhere;
    }

    public int getIdWhat() {
        return this.idWhat;
    }

    public void setIdWhat(int idWhat) {
        this.idWhat = idWhat;
    }

    public int getIdHow() {
        return this.idHow;
    }

    public void setIdHow(int idHow) {
        this.idHow = idHow;
    }

    public Integer getIdNewRationale() {
        return this.idNewRationale;
    }

    public void setIdNewRationale(Integer idNewRationale) {
        this.idNewRationale = idNewRationale;
    }

}
