package org.example.model;

import java.util.Date;

public class UserGroup {
    private Integer userid;

    private Short groupid;

    private Long usergrpid;

    private Date ondate;

    private Short status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Long getUsergrpid() {
        return usergrpid;
    }

    public void setUsergrpid(Long usergrpid) {
        this.usergrpid = usergrpid;
    }

    public Date getOndate() {
        return ondate;
    }

    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}