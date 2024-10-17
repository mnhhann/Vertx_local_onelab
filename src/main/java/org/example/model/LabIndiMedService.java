package org.example.model;

public class LabIndiMedService {
    private Long indmedid;

    private Integer medserviceid;

    private Integer indid;

    private Short status;

    public Long getIndmedid() {
        return indmedid;
    }

    public void setIndmedid(Long indmedid) {
        this.indmedid = indmedid;
    }

    public Integer getMedserviceid() {
        return medserviceid;
    }

    public void setMedserviceid(Integer medserviceid) {
        this.medserviceid = medserviceid;
    }

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}