package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/5.
 */
@Entity
@Table(name = "user", schema = "picture", catalog = "")
public class UserEntity {
    private int user_id;
    private String user_name;
    private String user_pwd;
    private int user_sex;
    private String user_sign;
    private String user_overview;
    private String user_mobile;
    private String user_img;
    private int user_role;
    private String user_time;
    private String user_ip;

    @Id
    @Column(name = "user_id", nullable = false, length = 32)
    public int getuser_id() {
        return user_id;
    }

    public void setuser_id(int user_id) {
        this.user_id = user_id;
    }

    @Basic
    @Column(name = "user_mobile", nullable = false, length = 20)
    public String getuser_mobile() {
        return user_mobile;
    }

    public void setuser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }

    @Basic
    @Column(name = "user_pwd", nullable = false, length = 50)
    public String getuser_pwd() {
        return user_pwd;
    }

    public void setuser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }
    
    @Basic
    @Column(name = "user_sex", nullable = false, length = 11)
    public int getuser_sex() {
        return user_sex;
    }

    public void setuser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    @Basic
    @Column(name = "user_role", nullable = false, length = 11)
    public int getuser_role() {
        return user_role;
    }

    public void setuser_role(int user_role) {
        this.user_role = user_role;
    }

}
