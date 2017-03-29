package module;

import bean.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

/**
 * Created by Administrator on 2017/3/5.
 */
public class Test {


    public static String uuid (){
        String s = UUID.randomUUID().toString();
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
    public static void main(String args[]){
        Login login = new Login();
        System.out.println(login.login("123","123456"));
    }
}
