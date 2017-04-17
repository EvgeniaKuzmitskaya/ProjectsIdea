package By.career.Dao;


import By.career.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Evgenia on 14.04.2017.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(employee);
        logger.info("Employee succesfully saved. Details: " + employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(employee);
        logger.info("Employee succesfully updated. Details: " + employee);
    }

    @Override
    public void removeEmployee(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.load(Employee.class, new Integer(id));
        if (employee != null) {
            session.delete(employee);
        }
        logger.info("Employee succesfully deleted. Details: " + employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.load(Employee.class, new Integer(id));
        logger.info("Employee succesfully loaded. Details: " + employee);
        return employee;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> listEmployee() {
        List<Employee> employeeList = sessionFactory.getCurrentSession().createCriteria(Employee.class).addOrder(Order.asc("id")).list();
        for (Employee employee : employeeList) {
            logger.info("Employee list" + employeeList);
        }
        return employeeList;
    }
}
