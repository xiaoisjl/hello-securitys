package example.hellosecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login() {
        return "6666士大夫6";
    }

    @RequestMapping(value = "/user/unLogin")
    public String unLogin() {
        return "用户未登陆";
    }
}
