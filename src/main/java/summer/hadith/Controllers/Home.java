package summer.hadith.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/home")
    public String home() {
        return "This is home";
    }

    @GetMapping("/protected")
    public String protectedRoute() {
        return "This is protected";
    }
}
