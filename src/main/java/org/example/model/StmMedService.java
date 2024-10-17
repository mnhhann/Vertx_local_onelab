package org.example.model;

import java.math.BigDecimal;

public class StmMedService {
    private Integer stmmedid;

    private Long stmid;

    private Integer serviceid;

    private String servicename;

    private BigDecimal price;

    private BigDecimal discountratio;

    private Integer attribute;

    private Short status;

    public Integer getStmmedid() {
        return stmmedid;
    }

    public void setStmmedid(Integer stmmedid) {
        this.stmmedid = stmmedid;
    }

    public Long getStmid() {
        return stmid;
    }

    public void setStmid(Long stmid) {
        this.stmid = stmid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountratio() {
        return discountratio;
    }

    public void setDiscountratio(BigDecimal discountratio) {
        this.discountratio = discountratio;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}