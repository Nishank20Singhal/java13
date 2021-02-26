package io.github.aravindvasudev.springformdemo;

import io.github.aravindvasudev.springformdemo.model.User;
import io.github.aravindvasudev.springformdemo.model.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class BaseController {
    private static final Logger LOGGER = Logger.getLogger(BaseController.class.getName());

    @Autowired
    private UserDAO userDAO;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        LOGGER.log(Level.INFO, user.toString());

        if (bindingResult.hasErrors()) {
            return "index";
        }

        userDAO.addUser(user);
        return "submit";
    }

    @RequestMapping("/submissions")
    public String submissions(Model model) {
        model.addAttribute("users", userDAO.getUsers());
        return "submissions";
    }
}
