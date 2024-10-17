package org.example.model;

/**
 * The mapping contract & Staff
 */
public class ContractStaff {
    /**
    * IDENTITY(1,1)
    */
    private Long id;

    /**
    * Id HĐ
    */
    private Long contractid;

    /**
    * Id Nhân viên
    */
    private Integer staffid;

    /**
    * link HIS-Master..MasterData - Type enum: StaffTitle=11 (Vai trò người ký)
    */
    private Short stafftitle;

    /**
    * MasterDataType=8 (Vị trí chức danh người kí)
    */
    private Short staffposition;

    /**
    * Tiêu đề chữ ký
    */
    private String signtitle;

    /**
    * Thứ tự hiển thị chữ ký
    */
    private Byte signindex;

    private Short status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContractid() {
        return contractid;
    }

    public void setContractid(Long contractid) {
        this.contractid = contractid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Short getStafftitle() {
        return stafftitle;
    }

    public void setStafftitle(Short stafftitle) {
        this.stafftitle = stafftitle;
    }

    public Short getStaffposition() {
        return staffposition;
    }

    public void setStaffposition(Short staffposition) {
        this.staffposition = staffposition;
    }

    public String getSigntitle() {
        return signtitle;
    }

    public void setSigntitle(String signtitle) {
        this.signtitle = signtitle;
    }

    public Byte getSignindex() {
        return signindex;
    }

    public void setSignindex(Byte signindex) {
        this.signindex = signindex;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}