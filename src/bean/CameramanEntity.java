package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "cameraman", schema = "picture", catalog = "")
public class CameramanEntity {
    private String cameramanid;
    private String name;
    private String sex;
    private String idcard;
    private String job;
    private String phonenumber;
    private String equipment;
    private String type;
    private String style;
    private String intro;
    private String production;
    private String website;
    private String idcardpic;

    @Id
    @Column(name = "cameramanid", nullable = false, length = 32)
    public String getCameramanid() {
        return cameramanid;
    }

    public void setCameramanid(String cameramanid) {
        this.cameramanid = cameramanid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "idcard", nullable = true, length = 20)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "job", nullable = true, length = 10)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
    @Column(name = "equipment", nullable = true, length = 20)
    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "style", nullable = true, length = 45)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Basic
    @Column(name = "intro", nullable = true, length = 45)
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "production", nullable = true, length = 45)
    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Basic
    @Column(name = "website", nullable = true, length = 45)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "idcardpic", nullable = true, length = 45)
    public String getIdcardpic() {
        return idcardpic;
    }

    public void setIdcardpic(String idcardpic) {
        this.idcardpic = idcardpic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CameramanEntity that = (CameramanEntity) o;

        if (cameramanid != null ? !cameramanid.equals(that.cameramanid) : that.cameramanid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (idcard != null ? !idcard.equals(that.idcard) : that.idcard != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (phonenumber != null ? !phonenumber.equals(that.phonenumber) : that.phonenumber != null) return false;
        if (equipment != null ? !equipment.equals(that.equipment) : that.equipment != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (production != null ? !production.equals(that.production) : that.production != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (idcardpic != null ? !idcardpic.equals(that.idcardpic) : that.idcardpic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cameramanid != null ? cameramanid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (equipment != null ? equipment.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (production != null ? production.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (idcardpic != null ? idcardpic.hashCode() : 0);
        return result;
    }
}
