package module;

import bean.BlogEntity;
import bean.PraiseEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
/*
* This is a module class.
* That provide the method about blog
* We aim to achieve four method which is SendBlog ,praise,comtent and check. */
public class blog {
    /*This is the SendBlog method
    * Use Hibernate to save data to database
    * param : BlofEntity
    * return : a bool which shows the save behavior whether achieved*/
    public boolean SendBlog (BlogEntity blogEntity){
        boolean flag = false;
        Session session = null;
        try {
           session = HibernateInit.getSession();
           session.beginTransaction();
           session.save(blogEntity);
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
    /*param :PraiseEntity
    * return : bool
    * Excetion :There are two achieved in one trans*/
    public boolean praise (PraiseEntity praiseEntity){
        boolean flag = false;
        Session session = null;
        // the hql sentence to get the blog which be praised
        String hql = "from BlogEntity blog where blog.blogid = :blogid";
        try {
            session = HibernateInit.getSession();
            session.beginTransaction();
            session.save(praiseEntity);
            Query query = session.createQuery(hql).setParameter("blogid",praiseEntity.getBlogid());
            List<BlogEntity> list = query.list();
            BlogEntity temp =(BlogEntity) list.get(0);
            temp.setPraisenumber(Integer.valueOf(temp.getPraisenumber().intValue()+1));
            session.update(temp);
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
            HibernateInit.rollback(session);
            flag = false;
        } finally {
            HibernateInit.close(session);
        }

        return  flag;
    }
}
