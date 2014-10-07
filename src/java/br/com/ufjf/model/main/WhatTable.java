package br.com.ufjf.model.main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WhatTable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idWhat;
    private String description;
    private String productName;
    private String purposeProduct;
    private String urlProduct;

    public WhatTable() {
    }

    public WhatTable(String description) {
        this.description = description;
    }

    public WhatTable(String description, String productName, String purposeProduct, String urlProduct) {
        this.description = description;
        this.productName = productName;
        this.purposeProduct = purposeProduct;
        this.urlProduct = urlProduct;
    }

    public Integer getIdWhat() {
        return this.idWhat;
    }

    public void setIdWhat(Integer idWhat) {
        this.idWhat = idWhat;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPurposeProduct() {
        return this.purposeProduct;
    }

    public void setPurposeProduct(String purposeProduct) {
        this.purposeProduct = purposeProduct;
    }

    public String getUrlProduct() {
        return this.urlProduct;
    }

    public void setUrlProduct(String urlProduct) {
        this.urlProduct = urlProduct;
    }

}
