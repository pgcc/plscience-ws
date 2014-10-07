package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Communication implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idComunication;
    private String message;
    private int idRationale;
    private String subfeature;
    private int idScientistReceptor;
    private int idScientistEmissor;
    private String data;
    private String hora;
    private int lidaSn;

    public Communication() {
    }

    public Communication(int idRationale, int idScientistReceptor, int idScientistEmissor, String data, String hora, int lidaSn) {
        this.idRationale = idRationale;
        this.idScientistReceptor = idScientistReceptor;
        this.idScientistEmissor = idScientistEmissor;
        this.data = data;
        this.hora = hora;
        this.lidaSn = lidaSn;
    }

    public Communication(String message, int idRationale, String subfeature, int idScientistReceptor, int idScientistEmissor, String data, String hora, int lidaSn) {
        this.message = message;
        this.idRationale = idRationale;
        this.subfeature = subfeature;
        this.idScientistReceptor = idScientistReceptor;
        this.idScientistEmissor = idScientistEmissor;
        this.data = data;
        this.hora = hora;
        this.lidaSn = lidaSn;
    }

    public Integer getIdComunication() {
        return this.idComunication;
    }

    public void setIdComunication(Integer idComunication) {
        this.idComunication = idComunication;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIdRationale() {
        return this.idRationale;
    }

    public void setIdRationale(int idRationale) {
        this.idRationale = idRationale;
    }

    public String getSubfeature() {
        return this.subfeature;
    }

    public void setSubfeature(String subfeature) {
        this.subfeature = subfeature;
    }

    public int getIdScientistReceptor() {
        return this.idScientistReceptor;
    }

    public void setIdScientistReceptor(int idScientistReceptor) {
        this.idScientistReceptor = idScientistReceptor;
    }

    public int getIdScientistEmissor() {
        return this.idScientistEmissor;
    }

    public void setIdScientistEmissor(int idScientistEmissor) {
        this.idScientistEmissor = idScientistEmissor;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getLidaSn() {
        return this.lidaSn;
    }

    public void setLidaSn(int lidaSn) {
        this.lidaSn = lidaSn;
    }

}
