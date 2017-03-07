package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "issue", schema = "picture", catalog = "")
public class IssueEntity {
    private String usrid;
    private String content;
    private String kind;
    private String issueid;

    @Basic
    @Column(name = "usrid", nullable = true, length = 32)
    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid;
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
    @Column(name = "kind", nullable = true, length = 45)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Id
    @Column(name = "issueid", nullable = false, length = 32)
    public String getIssueid() {
        return issueid;
    }

    public void setIssueid(String issueid) {
        this.issueid = issueid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IssueEntity that = (IssueEntity) o;

        if (usrid != null ? !usrid.equals(that.usrid) : that.usrid != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (issueid != null ? !issueid.equals(that.issueid) : that.issueid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrid != null ? usrid.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (issueid != null ? issueid.hashCode() : 0);
        return result;
    }
}
