package By.career.Controller;

import By.career.Model.User;
import By.career.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Evgenia on 16.04.2017.
 */
//@Controller
//@RequestMapping("/userForm")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(Map model, User user) {
        model.put("userForm", user);
        return "userform";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@Valid User user, BindingResult result, Map model) {

        if (result.hasErrors()) {
            return "userform";
        }

		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginform";
		}
		*/
        boolean userExists = userService.checkLogin(user.getLogin(), user.getPassword());
        if(userExists){
            model.put("userForm", user);
            return "loginsuccess";
        }else{
            result.rejectValue("login","invaliduser");
            return "userForm";
        }

    }

}
