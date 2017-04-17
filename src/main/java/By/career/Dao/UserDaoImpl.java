package By.career.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Evgenia on 16.04.2017.
 */

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

//    @Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public boolean checkLogin(String login, String password) {
        Session session = this.sessionFactory.getCurrentSession();
        boolean userFound = false;
        String sql = "from User as o where o.login=? and o.password=?";
        Query query = session.createQuery(sql);
        query.setParameter(0,login);
        query.setParameter(1,password);
        List list = query.list();

        if ((list != null) && (list.size() > 0)) {
            userFound= true;
        }

        session.close();
        logger.info("User authorized. Details: " + userFound);
        return userFound;
    }


}
