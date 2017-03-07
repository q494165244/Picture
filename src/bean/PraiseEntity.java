package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/7.
 */
@Entity
@Table(name = "praise", schema = "picture", catalog = "")
public class PraiseEntity {
    private String blogid;
    private String userid;
    private String time;
    private String praiseid;

    @Basic
    @Column(name = "blogid", nullable = true, length = 32)
    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
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
    @Column(name = "time", nullable = true, length = 45)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Id
    @Column(name = "praiseid", nullable = false, length = 32)
    public String getPraiseid() {
        return praiseid;
    }

    public void setPraiseid(String praiseid) {
        this.praiseid = praiseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PraiseEntity that = (PraiseEntity) o;

        if (blogid != null ? !blogid.equals(that.blogid) : that.blogid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (praiseid != null ? !praiseid.equals(that.praiseid) : that.praiseid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blogid != null ? blogid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (praiseid != null ? praiseid.hashCode() : 0);
        return result;
    }
}
