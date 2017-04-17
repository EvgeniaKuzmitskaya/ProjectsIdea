package By.career.Controller;

import By.career.Model.Employee;
import By.career.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Controller
public class EmployeeController {

    @Autowired(required = true)
    private EmployeeService employeeService;

    @Qualifier(value = "employeeService")
    public void setEmployeeService(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employeeAdd", method = RequestMethod.POST)
    public String add(@ModelAttribute("empl") Employee employee){
        if(employee.getIdEmployee()==0){
            this.employeeService.addEmployee(employee);
        } else {this.employeeService.updateEmployee(employee);}
        return "employeeView";
    }

    @RequestMapping(value = "/employeeAdd", method = RequestMethod.GET)
    public String addEmployees(@ModelAttribute ("empl") Employee employee){
        return "employeeAdd";
    }

    @RequestMapping(value = "/employeeView", method = RequestMethod.GET)
    public ModelAndView listEmployees(){
        List<Employee> list = new ArrayList<Employee>(employeeService.listEmployee());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("listEmployees", list);
        return modelAndView;
    }

    @RequestMapping(value = "/employeeList", method = RequestMethod.GET)
    public String addAll(Model model){
        List<Employee> list = new ArrayList<Employee>(employeeService.listEmployee());
        model.addAttribute("listEmployees",list);
        return "employeeList";
    }


    @RequestMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){
        model.addAttribute("employee", this.employeeService.getEmployeeById(id));
        model.addAttribute("listEmployee", this.employeeService.listEmployee());
        return "employeeEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String edit(Employee employee){
        this.employeeService.updateEmployee(employee);
        return "redirect:/employeeList";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable ("id") int id){
        this.employeeService.removeEmployee(id);
        return "redirect: /employeeList";
    }



    @RequestMapping("/employeeData/{id}")
    public String employeeData(@PathVariable ("id") int id, Model model){
        model.addAttribute("employee", this.employeeService.getEmployeeById(id));
        return "employeeView";
    }







}
