package org.example.model;

public class WardUnit {
    private Short unitid;

    private Short wardid;

    private String code;

    private String name;

    private Byte index;

    private Short tmlid;

    private Short queueid;

    private Short type;

    private Integer attribute;

    private Short status;

    public Short getUnitid() {
        return unitid;
    }

    public void setUnitid(Short unitid) {
        this.unitid = unitid;
    }

    public Short getWardid() {
        return wardid;
    }

    public void setWardid(Short wardid) {
        this.wardid = wardid;
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

    public Byte getIndex() {
        return index;
    }

    public void setIndex(Byte index) {
        this.index = index;
    }

    public Short getTmlid() {
        return tmlid;
    }

    public void setTmlid(Short tmlid) {
        this.tmlid = tmlid;
    }

    public Short getQueueid() {
        return queueid;
    }

    public void setQueueid(Short queueid) {
        this.queueid = queueid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
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