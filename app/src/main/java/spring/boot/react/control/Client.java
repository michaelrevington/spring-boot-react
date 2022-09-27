package spring.boot.react.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Client {

    @GetMapping(value = { "/client", "/client/**" })
    public String getClient() {
        return "index";
    }

}
