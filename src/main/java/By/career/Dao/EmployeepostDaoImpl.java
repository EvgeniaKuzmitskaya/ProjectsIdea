package By.career.Dao;


import By.career.Model.Employeepost;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Evgenia on 18.04.2017.
 */
@Repository("employeepostDao")
public class EmployeepostDaoImpl implements EmployeepostDao{

    private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<String> getListWork(){

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();


        String sql = "SELECT post.name_post,COUNT(employeepost.id_employeePost)" +
         "FROM employeepost, post WHERE employeepost.id_post=post.id_post " +
         "AND '2017-04-17'<=employeepost.date_End GROUP BY post.name_post";

    SQLQuery query = session.createSQLQuery(sql);
    query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
    List results = query.list();
    return results;

    }

    @Override
    public List<String> getListFired() {

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        String sql = "SELECT surname, name, patronicname, date_begin, date_end, year('2017-04-17')- YEAR (date_Begin) " +
                "as experience from employee,employeepost where employee.id_employee=employeepost.id_employee " +
                "and '2017-04-17'> employeepost.date_End";
        SQLQuery query = session.createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List results = query.list();
        return results;

    }


}
