package database_001.connect_db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("addUser")
    public String user(){
        return "index";
    }

}
