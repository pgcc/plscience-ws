package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WhenTable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idWhen;
    private Integer day;
    private Integer month;
    private Integer year;
    private Integer time;
    private Integer minute;

    public WhenTable() {
    }

    public WhenTable(Integer day, Integer month, Integer year, Integer time, Integer minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.minute = minute;
    }

    public Integer getIdWhen() {
        return this.idWhen;
    }

    public void setIdWhen(Integer idWhen) {
        this.idWhen = idWhen;
    }

    public Integer getDay() {
        return this.day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return this.month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

}
