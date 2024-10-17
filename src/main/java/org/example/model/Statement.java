package org.example.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Bảng giá
 */
public class Statement {
    /**
    * Statement Id (auto)
    */
    private Long stmid;

    /**
    * Mã bảng giá
    */
    private String stmno;

    /**
    * See FmsStatementType enum
    */
    private Byte type;

    /**
    * Statement description
    */
    private String description;

    /**
    * Creation time
    */
    private Date createon;

    /**
    * Who create the statement
    */
    private Integer createbyid;

    /**
    * Statement date
    */
    private Date ondate;

    private Date activeon;

    private Date lastactivedon;

    private BigDecimal discountratio;

    /**
    * See CommonStatus enum
    */
    private Short status;

    public Long getStmid() {
        return stmid;
    }

    public void setStmid(Long stmid) {
        this.stmid = stmid;
    }

    public String getStmno() {
        return stmno;
    }

    public void setStmno(String stmno) {
        this.stmno = stmno;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Integer getCreatebyid() {
        return createbyid;
    }

    public void setCreatebyid(Integer createbyid) {
        this.createbyid = createbyid;
    }

    public Date getOndate() {
        return ondate;
    }

    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }

    public Date getActiveon() {
        return activeon;
    }

    public void setActiveon(Date activeon) {
        this.activeon = activeon;
    }

    public Date getLastactivedon() {
        return lastactivedon;
    }

    public void setLastactivedon(Date lastactivedon) {
        this.lastactivedon = lastactivedon;
    }

    public BigDecimal getDiscountratio() {
        return discountratio;
    }

    public void setDiscountratio(BigDecimal discountratio) {
        this.discountratio = discountratio;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}