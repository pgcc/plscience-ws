package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ArtifactsUsed implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idArtifactUsed;
    private int idWhere;
    private int idArtifact;
    private int idRationale;

    public ArtifactsUsed() {
    }

    public ArtifactsUsed(int idWhere, int idArtifact, int idRationale) {
        this.idWhere = idWhere;
        this.idArtifact = idArtifact;
        this.idRationale = idRationale;
    }

    public Integer getIdArtifactUsed() {
        return this.idArtifactUsed;
    }

    public void setIdArtifactUsed(Integer idArtifactUsed) {
        this.idArtifactUsed = idArtifactUsed;
    }

    public int getIdWhere() {
        return this.idWhere;
    }

    public void setIdWhere(int idWhere) {
        this.idWhere = idWhere;
    }

    public int getIdArtifact() {
        return this.idArtifact;
    }

    public void setIdArtifact(int idArtifact) {
        this.idArtifact = idArtifact;
    }

    public int getIdRationale() {
        return this.idRationale;
    }

    public void setIdRationale(int idRationale) {
        this.idRationale = idRationale;
    }

}
