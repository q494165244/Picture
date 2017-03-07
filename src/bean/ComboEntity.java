package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "combo", schema = "picture", catalog = "")
public class ComboEntity {
    private String cameramanid;
    private String content;
    private Integer prize;
    private String unit;
    private String comboid;

    @Basic
    @Column(name = "cameramanid", nullable = true, length = 32)
    public String getCameramanid() {
        return cameramanid;
    }

    public void setCameramanid(String cameramanid) {
        this.cameramanid = cameramanid;
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
    @Column(name = "prize", nullable = true)
    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    @Basic
    @Column(name = "unit", nullable = true, length = 5)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Id
    @Column(name = "comboid", nullable = false, length = 32)
    public String getComboid() {
        return comboid;
    }

    public void setComboid(String comboid) {
        this.comboid = comboid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComboEntity that = (ComboEntity) o;

        if (cameramanid != null ? !cameramanid.equals(that.cameramanid) : that.cameramanid != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (prize != null ? !prize.equals(that.prize) : that.prize != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (comboid != null ? !comboid.equals(that.comboid) : that.comboid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cameramanid != null ? cameramanid.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (prize != null ? prize.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (comboid != null ? comboid.hashCode() : 0);
        return result;
    }
}
