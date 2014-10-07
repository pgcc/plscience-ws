package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idNotes;
    private String description;
    private String subfeatures;
    private int idRationale;

    public Notes() {
    }

    public Notes(String description, int idRationale) {
        this.description = description;
        this.idRationale = idRationale;
    }

    public Notes(String description, String subfeatures, int idRationale) {
        this.description = description;
        this.subfeatures = subfeatures;
        this.idRationale = idRationale;
    }

    public Integer getIdNotes() {
        return this.idNotes;
    }

    public void setIdNotes(Integer idNotes) {
        this.idNotes = idNotes;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubfeatures() {
        return this.subfeatures;
    }

    public void setSubfeatures(String subfeatures) {
        this.subfeatures = subfeatures;
    }

    public int getIdRationale() {
        return this.idRationale;
    }

    public void setIdRationale(int idRationale) {
        this.idRationale = idRationale;
    }

}
