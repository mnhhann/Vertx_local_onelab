package org.example.model;

public class Permission {
    private Integer permissionid;

    private Short moduleid;

    private Short functionid;

    private Short groupid;

    private Short role;

    private Short status;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Short getModuleid() {
        return moduleid;
    }

    public void setModuleid(Short moduleid) {
        this.moduleid = moduleid;
    }

    public Short getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Short functionid) {
        this.functionid = functionid;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}