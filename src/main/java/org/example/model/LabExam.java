package org.example.model;

import java.util.Date;

/**
 * Lab examination
 */
public class LabExam {
    /**
    * Auto
    */
    private Long labexid;

    /**
    * FK to LabExamType table in Master database
    */
    private Short type;

    /**
    * Code assigned by user
    */
    private String refno;

    private String idtofiller;

    /**
    * FK to Patient table in PMS database
    */
    private Long patientid;

    /**
    * FK to MedRecord table
    */
    private Long frwardadmid;

    /**
    * If  LabExAttribute is OutPatient the value is VisitEntryId. If InPatient the value is WardAdmission Id
    */
    private Long frvisitentryid;

    /**
    * FK to table TxVisit(đợt y lệnh, phục vụ cho nội trú)
    */
    private Long frtxvisitid;

    private String dxinitial;

    private String dxicd;

    private String dxtext;

    private Long contractid;

    private Short qtytest;

    private Integer createbyid;

    /**
    * Ngay tao
    */
    private Date createon;

    private Short labreqwardunitid;

    /**
    * Some note
    */
    private String labreqnotes;

    /**
    * Physician who request the lab exam. FK to User table of Admin database.
    */
    private Integer labreqbyid;

    /**
    * Date/Time of the lab request/ Ngay Chi định
    */
    private Date ondate;

    private Integer labdonebyid;

    /**
    * Ngay ket qua
    */
    private Date labdxon;

    private Integer labdxapprovebyid;

    /**
    * Ngay duyet ket qua
    */
    private Date labdxapproveon;

    /**
    * Kếtt quả
    */
    private String labdxconclusion;

    private Integer cancelbyid;

    private Date cancelon;

    private String cancelreason;

    private Long ordgrpid;

    private Long ordresultgrpid;

    /**
    * Fk to Id column of [HIS-QMS].Ticket
    */
    private Long ticketid;

    private String qmsno;

    /**
    * Link Pdf
    */
    private String pdfurl;

    /**
    * See LabExAttribute enum
    */
    private Integer attribute;

    /**
    * See LabExamStatus  enum
    */
    private Short status;

    public Long getLabexid() {
        return labexid;
    }

    public void setLabexid(Long labexid) {
        this.labexid = labexid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    public String getIdtofiller() {
        return idtofiller;
    }

    public void setIdtofiller(String idtofiller) {
        this.idtofiller = idtofiller;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    public Long getFrwardadmid() {
        return frwardadmid;
    }

    public void setFrwardadmid(Long frwardadmid) {
        this.frwardadmid = frwardadmid;
    }

    public Long getFrvisitentryid() {
        return frvisitentryid;
    }

    public void setFrvisitentryid(Long frvisitentryid) {
        this.frvisitentryid = frvisitentryid;
    }

    public Long getFrtxvisitid() {
        return frtxvisitid;
    }

    public void setFrtxvisitid(Long frtxvisitid) {
        this.frtxvisitid = frtxvisitid;
    }

    public String getDxinitial() {
        return dxinitial;
    }

    public void setDxinitial(String dxinitial) {
        this.dxinitial = dxinitial;
    }

    public String getDxicd() {
        return dxicd;
    }

    public void setDxicd(String dxicd) {
        this.dxicd = dxicd;
    }

    public String getDxtext() {
        return dxtext;
    }

    public void setDxtext(String dxtext) {
        this.dxtext = dxtext;
    }

    public Long getContractid() {
        return contractid;
    }

    public void setContractid(Long contractid) {
        this.contractid = contractid;
    }

    public Short getQtytest() {
        return qtytest;
    }

    public void setQtytest(Short qtytest) {
        this.qtytest = qtytest;
    }

    public Integer getCreatebyid() {
        return createbyid;
    }

    public void setCreatebyid(Integer createbyid) {
        this.createbyid = createbyid;
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Short getLabreqwardunitid() {
        return labreqwardunitid;
    }

    public void setLabreqwardunitid(Short labreqwardunitid) {
        this.labreqwardunitid = labreqwardunitid;
    }

    public String getLabreqnotes() {
        return labreqnotes;
    }

    public void setLabreqnotes(String labreqnotes) {
        this.labreqnotes = labreqnotes;
    }

    public Integer getLabreqbyid() {
        return labreqbyid;
    }

    public void setLabreqbyid(Integer labreqbyid) {
        this.labreqbyid = labreqbyid;
    }

    public Date getOndate() {
        return ondate;
    }

    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }

    public Integer getLabdonebyid() {
        return labdonebyid;
    }

    public void setLabdonebyid(Integer labdonebyid) {
        this.labdonebyid = labdonebyid;
    }

    public Date getLabdxon() {
        return labdxon;
    }

    public void setLabdxon(Date labdxon) {
        this.labdxon = labdxon;
    }

    public Integer getLabdxapprovebyid() {
        return labdxapprovebyid;
    }

    public void setLabdxapprovebyid(Integer labdxapprovebyid) {
        this.labdxapprovebyid = labdxapprovebyid;
    }

    public Date getLabdxapproveon() {
        return labdxapproveon;
    }

    public void setLabdxapproveon(Date labdxapproveon) {
        this.labdxapproveon = labdxapproveon;
    }

    public String getLabdxconclusion() {
        return labdxconclusion;
    }

    public void setLabdxconclusion(String labdxconclusion) {
        this.labdxconclusion = labdxconclusion;
    }

    public Integer getCancelbyid() {
        return cancelbyid;
    }

    public void setCancelbyid(Integer cancelbyid) {
        this.cancelbyid = cancelbyid;
    }

    public Date getCancelon() {
        return cancelon;
    }

    public void setCancelon(Date cancelon) {
        this.cancelon = cancelon;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason;
    }

    public Long getOrdgrpid() {
        return ordgrpid;
    }

    public void setOrdgrpid(Long ordgrpid) {
        this.ordgrpid = ordgrpid;
    }

    public Long getOrdresultgrpid() {
        return ordresultgrpid;
    }

    public void setOrdresultgrpid(Long ordresultgrpid) {
        this.ordresultgrpid = ordresultgrpid;
    }

    public Long getTicketid() {
        return ticketid;
    }

    public void setTicketid(Long ticketid) {
        this.ticketid = ticketid;
    }

    public String getQmsno() {
        return qmsno;
    }

    public void setQmsno(String qmsno) {
        this.qmsno = qmsno;
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