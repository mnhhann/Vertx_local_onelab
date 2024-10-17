package org.example.model;

/**
 * Nhóm nhân viên
 */
public class StaffGroup {
    /**
    * Auto
    */
    private Integer staffgrpid;

    /**
    * Tên nhóm
    */
    private String name;

    /**
    * Loại nhóm
    */
    private Short type;

    /**
    * Mô tả
    */
    private String description;

    /**
    * Is hệ thống
    */
    private Boolean issystem;

    /**
    * Trạng thái
    */
    private Short status;

    public Integer getStaffgrpid() {
        return staffgrpid;
    }

    public void setStaffgrpid(Integer staffgrpid) {
        this.staffgrpid = staffgrpid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}