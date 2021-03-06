package ua.inf.sviat.springsecurityapp.controller;


import org.springframework.web.bind.annotation.*;
import ua.inf.sviat.springsecurityapp.model.ProducerGpu;
import ua.inf.sviat.springsecurityapp.model.User;
import ua.inf.sviat.springsecurityapp.service.ProducerGpuService;
import ua.inf.sviat.springsecurityapp.service.SecurityService;
import ua.inf.sviat.springsecurityapp.service.UserService;
import ua.inf.sviat.springsecurityapp.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 * Created by Sviatoslav on 25.03.2017.
 */
@Controller
@RequestMapping("/")
public class UserConroller {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private ProducerGpuService producerGpuService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out successfully.");
        }

        return "login";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/")
    public String index (){
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }

//    @ModelAttribute("producerGpu")
//    public ProducerGpu getForm(){
//        return new ProducerGpu();
//    }

    @GetMapping
    public String show(Model model){
        model.addAttribute("producerGpus", producerGpuService.findAll());
        return "index";
    }
}
