package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "picture", schema = "picture", catalog = "")
public class PictureEntity {
    private String pictureid;
    private String userid;
    private String url;

    @Id
    @Column(name = "pictureid", nullable = false, length = 32)
    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid;
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
    @Column(name = "url", nullable = true, length = 45)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PictureEntity that = (PictureEntity) o;

        if (pictureid != null ? !pictureid.equals(that.pictureid) : that.pictureid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureid != null ? pictureid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
