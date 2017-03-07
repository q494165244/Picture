package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "comment", schema = "picture", catalog = "")
public class CommentEntity {
    private String blogid;
    private String content;
    private String userid;
    private String time;
    private String commentid;

    @Basic
    @Column(name = "blogid", nullable = true, length = 32)
    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
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
    @Column(name = "commentid", nullable = false, length = 32)
    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (blogid != null ? !blogid.equals(that.blogid) : that.blogid != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (commentid != null ? !commentid.equals(that.commentid) : that.commentid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blogid != null ? blogid.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (commentid != null ? commentid.hashCode() : 0);
        return result;
    }
}
