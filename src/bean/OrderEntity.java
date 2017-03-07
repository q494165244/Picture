package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "order", schema = "picture", catalog = "")
public class OrderEntity {
    private String orderid;
    private String cameramanid;
    private String userid;
    private String content;
    private String phonenumber;
    private String time;
    private String site;
    private String orderstate;

    @Id
    @Column(name = "orderid", nullable = false, length = 32)
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "cameramanid", nullable = true, length = 32)
    public String getCameramanid() {
        return cameramanid;
    }

    public void setCameramanid(String cameramanid) {
        this.cameramanid = cameramanid;
    }

    @Basic
    @Column(name = "userid", nullable = true, length = 32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 45)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "phonenumber", nullable = true, length = 12)
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "time", nullable = true, length = 45)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "site", nullable = true, length = 45)
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Basic
    @Column(name = "orderstate", nullable = true, length = 45)
    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderid != null ? !orderid.equals(that.orderid) : that.orderid != null) return false;
        if (cameramanid != null ? !cameramanid.equals(that.cameramanid) : that.cameramanid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (phonenumber != null ? !phonenumber.equals(that.phonenumber) : that.phonenumber != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (site != null ? !site.equals(that.site) : that.site != null) return false;
        if (orderstate != null ? !orderstate.equals(that.orderstate) : that.orderstate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (cameramanid != null ? cameramanid.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (site != null ? site.hashCode() : 0);
        result = 31 * result + (orderstate != null ? orderstate.hashCode() : 0);
        return result;
    }
}
