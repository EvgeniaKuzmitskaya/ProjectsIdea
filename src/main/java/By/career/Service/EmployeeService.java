package By.career.Service;


import By.career.Model.Employee;

import java.util.List;

/**
 * Created by Evgenia on 09.04.2017.
 */
public interface EmployeeService {

    public void addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void removeEmployee(int id);
    public Employee getEmployeeById(int id);
    public List<Employee> getEmployeeBySurname(String surname);
    public List<Employee> listEmployee();

}
