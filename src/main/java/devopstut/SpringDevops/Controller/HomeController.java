package devopstut.SpringDevops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String getDetails(){
        return "Welcome to the devops tut";
    }

}
