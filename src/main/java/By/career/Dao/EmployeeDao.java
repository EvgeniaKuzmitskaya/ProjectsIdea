package By.career.Dao;


import By.career.Model.Employee;
import java.util.List;

/**
 * Created by Evgenia on 14.04.2017.
 */
public interface EmployeeDao {

    public void addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void removeEmployee(int id);
    public Employee getEmployeeById(int id);
    public List<Employee> listEmployee();

}
