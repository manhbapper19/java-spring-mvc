// package vn.hoidanit.laptopshop.controller;

// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.ui.Model;
// import vn.hoidanit.laptopshop.service.UserService;
// import org.springframework.web.bind.annotation.RequestMethod;

// @Controller
// public class UserController {
//     private UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     @RequestMapping("/")
//     public String getHomePage(Model model) {
//         String test = this.userService.handHello();
//         model.addAttribute("eric", test);
//         model.addAttribute("hoidanit", "from controller with model");
//         return "hello";
//     }

//     @RequestMapping("/admin/user")
//     public String getUserPage(Model model) {
//         model.addAttribute("newUser", new User());
//         return "admin/user/create";
//     }

//     @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
//     public String createUserPage(Model model) {
//         System.out.println("run here");
//         return "hello";
//     }
// }

package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handHello();
        model.addAttribute("eric", test);
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
        System.out.println(" run here " + hoidanit);
        return "hello";
    }
}
