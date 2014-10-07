package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idScientist;
    private String login;
    private String password;
    private String nameScientist;
    private String cpfscientist;
    private String emailScientist;
    private String institutionScientist;
    private String status;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String nameScientist, String cpfscientist, String emailScientist, String institutionScientist, String status) {
        this.login = login;
        this.password = password;
        this.nameScientist = nameScientist;
        this.cpfscientist = cpfscientist;
        this.emailScientist = emailScientist;
        this.institutionScientist = institutionScientist;
        this.status = status;
    }

    public Integer getIdScientist() {
        return this.idScientist;
    }

    public void setIdScientist(Integer idScientist) {
        this.idScientist = idScientist;
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

    public String getNameScientist() {
        return this.nameScientist;
    }

    public void setNameScientist(String nameScientist) {
        this.nameScientist = nameScientist;
    }

    public String getCpfscientist() {
        return this.cpfscientist;
    }

    public void setCpfscientist(String cpfscientist) {
        this.cpfscientist = cpfscientist;
    }

    public String getEmailScientist() {
        return this.emailScientist;
    }

    public void setEmailScientist(String emailScientist) {
        this.emailScientist = emailScientist;
    }

    public String getInstitutionScientist() {
        return this.institutionScientist;
    }

    public void setInstitutionScientist(String institutionScientist) {
        this.institutionScientist = institutionScientist;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
