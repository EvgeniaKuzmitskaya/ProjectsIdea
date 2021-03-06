package By.career.Service;

import By.career.Dao.EmployeeDao;
import By.career.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Evgenia on 09.04.2017.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {

        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        this.employeeDao.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {

        this.employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void removeEmployee(int id) {

        this.employeeDao.removeEmployee(id);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {

        return this.employeeDao.getEmployeeById(id);
    }

    @Override
    @Transactional
    public List<Employee> getEmployeeBySurname(String surname) {

        return this.employeeDao.getEmployeeBySurname(surname);
    }

    @Override
    @Transactional
    public List<Employee> listEmployee() {
        return this.employeeDao.listEmployee();
    }
}
