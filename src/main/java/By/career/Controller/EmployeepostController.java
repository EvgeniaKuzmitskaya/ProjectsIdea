package By.career.Controller;

import By.career.Model.Employeepost;
import By.career.Service.EmployeepostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Evgenia on 19.04.2017.
 */
@Controller
public class EmployeepostController {

    @Autowired(required = true)
    private EmployeepostService employeepostService;

    @Qualifier(value = "employeepostService")
    public void setEmployeepostService(EmployeepostService employeepostService) {
        this.employeepostService = employeepostService;
    }


    @RequestMapping(value = "/employeepostWork", method = RequestMethod.GET)
    public String getEmployeepostWork(Model model){
        model.addAttribute("listWork", this.employeepostService.getListWork());
        return "employeepostWork";
    }

    @RequestMapping(value = "/employeepostFired", method = RequestMethod.GET)
    public String getEmployeepostFired(Model model){
        model.addAttribute("listFired", this.employeepostService.getListFired());
        return "employeepostFired";
    }


}
