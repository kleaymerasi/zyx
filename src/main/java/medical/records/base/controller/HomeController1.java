package medical.records.base.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {
    @RequestMapping("/")
    public String display()
    {
        return "Home";
    }

}
