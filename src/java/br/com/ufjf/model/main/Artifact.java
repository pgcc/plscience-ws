package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Artifact implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idArtifact;
    private String name;
    private String purpose;
    private String local;
    private String status;
    private String type;
    private char artifactType;

    public Artifact() {
    }

    public Artifact(String name, String local, String status, String type, char artifactType) {
        this.name = name;
        this.local = local;
        this.status = status;
        this.type = type;
        this.artifactType = artifactType;
    }

    public Artifact(String name, String purpose, String local, String status, String type, char artifactType) {
        this.name = name;
        this.purpose = purpose;
        this.local = local;
        this.status = status;
        this.type = type;
        this.artifactType = artifactType;
    }

    public Integer getIdArtifact() {
        return this.idArtifact;
    }

    public void setIdArtifact(Integer idArtifact) {
        this.idArtifact = idArtifact;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getArtifactType() {
        return this.artifactType;
    }

    public void setArtifactType(char artifactType) {
        this.artifactType = artifactType;
    }

}
