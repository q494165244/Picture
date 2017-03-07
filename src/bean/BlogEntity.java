package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "blog", schema = "picture", catalog = "")
public class BlogEntity {
    private String blogid;
    private String userid;
    private String name;
    private String content;
    private String picture;
    private Integer praisenumber;
    private Integer commentnumber;
    private String time;
    private String site;

    @Id
    @Column(name = "blogid", nullable = false, length = 32)
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
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "picture", nullable = true, length = 300)
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "praisenumber", nullable = true)
    public Integer getPraisenumber() {
        return praisenumber;
    }

    public void setPraisenumber(Integer praisenumber) {
        this.praisenumber = praisenumber;
    }

    @Basic
    @Column(name = "commentnumber", nullable = true)
    public Integer getCommentnumber() {
        return commentnumber;
    }

    public void setCommentnumber(Integer commentnumber) {
        this.commentnumber = commentnumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogEntity that = (BlogEntity) o;

        if (blogid != null ? !blogid.equals(that.blogid) : that.blogid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (picture != null ? !picture.equals(that.picture) : that.picture != null) return false;
        if (praisenumber != null ? !praisenumber.equals(that.praisenumber) : that.praisenumber != null) return false;
        if (commentnumber != null ? !commentnumber.equals(that.commentnumber) : that.commentnumber != null)
            return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (site != null ? !site.equals(that.site) : that.site != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blogid != null ? blogid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (praisenumber != null ? praisenumber.hashCode() : 0);
        result = 31 * result + (commentnumber != null ? commentnumber.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (site != null ? site.hashCode() : 0);
        return result;
    }
}
