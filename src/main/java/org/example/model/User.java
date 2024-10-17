package org.example.model;

/**
 * Login
 */
public class User {
    /**
    * IDENTITY(1,1) 
    */
    private Integer userid;

    /**
    * Khóa nại của bảng Staff
    */
    private Integer staffid;

    /**
    * Khóa nại của bảng Customer
    */
    private Long customerid;

    /**
    * Loại user
    */
    private Byte type;

    /**
    * Tên Login
    */
    private String account;

    /**
    * Mật khẩu
    */
    private String password;

    /**
    * Tên
    */
    private String firstname;

    /**
    * Họ vs Tên đệm
    */
    private String lastname;

    /**
    * Cấp cha
    */
    private Integer parentuserid;

    /**
    * zalo
    */
    private String zaloid;

    /**
    * Trạng thái
    */
    private Short status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getParentuserid() {
        return parentuserid;
    }

    public void setParentuserid(Integer parentuserid) {
        this.parentuserid = parentuserid;
    }

    public String getZaloid() {
        return zaloid;
    }

    public void setZaloid(String zaloid) {
        this.zaloid = zaloid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}