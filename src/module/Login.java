package module;

import bean.CameramanEntity;
import bean.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.print.DocFlavor;
import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Login {
    public boolean login(String username,String password ){
        boolean flag = false;
        String hql = "from UserEntity user where user.name = :username";
        Session session = null;
        try {
            session =  HibernateInit.getSession();
            Query query = session.createQuery(hql).setParameter("username",username);
            List<UserEntity> list = query.list();
            if (list.get(0).getPassword().equals(password)){
                flag = true;
            }
        } catch (HibernateException e) {
            e.printStackTrace();
            HibernateInit.rollback(session);
            flag = false;
        } finally {
            HibernateInit.close(session);
        }
        return  flag;
    }
    public boolean register (UserEntity userEntity){
        boolean flag = false;
        Session session = null;
        try {
            session = HibernateInit.getSession();
            session.beginTransaction();
            session.save(userEntity);
            session.getTransaction().commit();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
            HibernateInit.rollback(session);
            flag  = false;
        } finally {
            HibernateInit.close(session);
        }
        return  flag;
    }
    public boolean CameramanRegister(CameramanEntity cameramanEntity){
        boolean flag = false;
        Session session = null;
        try {
            session = HibernateInit.getSession();
            session.save(cameramanEntity);
            session.getTransaction().commit();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
            HibernateInit.rollback(session);
            flag = false;
        } finally {
            HibernateInit.close(session);
        }
        return flag;
    }
}
