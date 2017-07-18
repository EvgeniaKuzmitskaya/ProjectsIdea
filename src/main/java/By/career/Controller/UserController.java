package By.career.Controller;

import By.career.Model.User;
import By.career.Service.EmployeeService;
import By.career.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Evgenia on 16.04.2017.
 */
@Controller
@RequestMapping("/userForm")
public class UserController {

    @Autowired
    public UserService userService;

    @Qualifier(value = "userService")
    public void setUserService(UserService userService) {

        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(ModelMap model, User user) {
        model.addAttribute("userForm", user);
        return "userForm";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("us") User user, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "userForm";
        }

        boolean userExists = userService.checkLogin(user.getLogin(), user.getPassword());
        System.out.println("login="+user.getLogin());
        System.out.println("password="+user.getPassword());
        System.out.println("userExists="+userExists);
        if(userExists){
            model.addAttribute("userForm", user);
            return "redirect:/index";
        }else{
            result.rejectValue("login","invaliduser");
            return "userFormError";
        }
    }
}
