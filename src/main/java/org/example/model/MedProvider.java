package org.example.model;

/**
 * CSYT (Khách hàng)
 */
public class MedProvider {
    /**
    * IDENTITY(1,1)
    */
    private Long medproviderid;

    /**
    * Mã CSYT
    */
    private String code;

    /**
    * Mã CSYT Theo BHYT
    */
    private String inscode;

    /**
    * Tên CSYT
    */
    private String name;

    /**
    * Địa chỉ KH
    */
    private String address;

    /**
    * Mã AuCity
    */
    private String aucity;

    /**
    * Mã AuDistrict
    */
    private String audistrict;

    /**
    * Mã AuWard
    */
    private String auward;

    /**
    * Zip code / Postal code. See https://en.wikipedia.org/wiki/Postal_codes_in_Vietnam
    */
    private String zipcode;

    /**
    * Code of the upper provider
    */
    private String parentcode;

    /**
    * See MedProviderRank enum
    */
    private Byte rank;

    /**
    * FK to MedProviderRoute table
    */
    private Byte routelevel;

    /**
    * Email
    */
    private String email;

    /**
    * PhoneNo
    */
    private String phoneno;

    /**
    * MobileNo
    */
    private String mobileno;

    /**
    * FaxNo
    */
    private String faxno;

    private String contactby;

    private String accountingfollowby;

    /**
    * See Attribute enum
    */
    private Integer attribute;

    /**
    * Trạng thái
    */
    private Short status;

    public Long getMedproviderid() {
        return medproviderid;
    }

    public void setMedproviderid(Long medproviderid) {
        this.medproviderid = medproviderid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInscode() {
        return inscode;
    }

    public void setInscode(String inscode) {
        this.inscode = inscode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAucity() {
        return aucity;
    }

    public void setAucity(String aucity) {
        this.aucity = aucity;
    }

    public String getAudistrict() {
        return audistrict;
    }

    public void setAudistrict(String audistrict) {
        this.audistrict = audistrict;
    }

    public String getAuward() {
        return auward;
    }

    public void setAuward(String auward) {
        this.auward = auward;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public Byte getRank() {
        return rank;
    }

    public void setRank(Byte rank) {
        this.rank = rank;
    }

    public Byte getRoutelevel() {
        return routelevel;
    }

    public void setRoutelevel(Byte routelevel) {
        this.routelevel = routelevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getFaxno() {
        return faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }

    public String getContactby() {
        return contactby;
    }

    public void setContactby(String contactby) {
        this.contactby = contactby;
    }

    public String getAccountingfollowby() {
        return accountingfollowby;
    }

    public void setAccountingfollowby(String accountingfollowby) {
        this.accountingfollowby = accountingfollowby;
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