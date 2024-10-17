package org.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    /**
    * IDENTITY(1,1)
    */
    private Long id;

    /**
    * Mã HĐ
    */
    private String code;

    /**
    * Tên hợp đồng
    */
    private String name;

    /**
    * Id khách hàng
    */
    private Long medproviderid;

    /**
    * Ngày lập HĐ
    */
    private Date createon;

    /**
    * Người lập HĐ
    */
    private Integer createdbyid;

    /**
    * Địa điểm lập HĐ
    */
    private String createat;

    /**
    * Ngày HĐ có hiệu lực
    */
    private Date frdate;

    /**
    * Ngày HĐ hết hiệu lực
    */
    private Date todate;

    /**
    * Ngày ký HĐ
    */
    private Date signon;

    private Short qtytest;

    /**
    * Thanh toán sau ... ngày
    */
    private Date dayaffterpay;

    /**
    * Ref bảng giá nào
    */
    private Long stmid;

    /**
    * % Chiết khấu
    */
    private BigDecimal discountratio;

    /**
    * Người phụ trách kế toán bên CRM
    */
    private Integer accountingfollowbyid;

    /**
    * Ngày lấy mẫu
    */
    private Date getteston;

    /**
    * Người lấy mẫu
    */
    private Integer gettestbyid;

    /**
    * Địa điểm lấy mẫu
    */
    private String gettestat;

    /**
    * Sale phụ trách HĐ
    */
    private Integer salebyid;

    private String pdfurl;

    private Integer attribute;

    private Short status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMedproviderid() {
        return medproviderid;
    }

    public void setMedproviderid(Long medproviderid) {
        this.medproviderid = medproviderid;
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Integer getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(Integer createdbyid) {
        this.createdbyid = createdbyid;
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public Date getFrdate() {
        return frdate;
    }

    public void setFrdate(Date frdate) {
        this.frdate = frdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Date getSignon() {
        return signon;
    }

    public void setSignon(Date signon) {
        this.signon = signon;
    }

    public Short getQtytest() {
        return qtytest;
    }

    public void setQtytest(Short qtytest) {
        this.qtytest = qtytest;
    }

    public Date getDayaffterpay() {
        return dayaffterpay;
    }

    public void setDayaffterpay(Date dayaffterpay) {
        this.dayaffterpay = dayaffterpay;
    }

    public Long getStmid() {
        return stmid;
    }

    public void setStmid(Long stmid) {
        this.stmid = stmid;
    }

    public BigDecimal getDiscountratio() {
        return discountratio;
    }

    public void setDiscountratio(BigDecimal discountratio) {
        this.discountratio = discountratio;
    }

    public Integer getAccountingfollowbyid() {
        return accountingfollowbyid;
    }

    public void setAccountingfollowbyid(Integer accountingfollowbyid) {
        this.accountingfollowbyid = accountingfollowbyid;
    }

    public Date getGetteston() {
        return getteston;
    }

    public void setGetteston(Date getteston) {
        this.getteston = getteston;
    }

    public Integer getGettestbyid() {
        return gettestbyid;
    }

    public void setGettestbyid(Integer gettestbyid) {
        this.gettestbyid = gettestbyid;
    }

    public String getGettestat() {
        return gettestat;
    }

    public void setGettestat(String gettestat) {
        this.gettestat = gettestat;
    }

    public Integer getSalebyid() {
        return salebyid;
    }

    public void setSalebyid(Integer salebyid) {
        this.salebyid = salebyid;
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl;
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