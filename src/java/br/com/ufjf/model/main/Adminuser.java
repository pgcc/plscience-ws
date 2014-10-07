package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Adminuser implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idAdminuser;
    private String nameScientist;
    private String login;
    private String password;
    private String cpf;
    private String EMail;
    private String institution;

    public Adminuser() {
    }

    public Adminuser(String nameScientist, String login, String password, String cpf, String EMail, String institution) {
        this.nameScientist = nameScientist;
        this.login = login;
        this.password = password;
        this.cpf = cpf;
        this.EMail = EMail;
        this.institution = institution;
    }

    public Integer getIdAdminuser() {
        return this.idAdminuser;
    }

    public void setIdAdminuser(Integer idAdminuser) {
        this.idAdminuser = idAdminuser;
    }

    public String getNameScientist() {
        return this.nameScientist;
    }

    public void setNameScientist(String nameScientist) {
        this.nameScientist = nameScientist;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEMail() {
        return this.EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getInstitution() {
        return this.institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

}
