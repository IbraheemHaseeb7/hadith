package summer.hadith.Controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import summer.hadith.Services.SignupService;

@RestController
public class SignupController {

    private final SignupService signupService;

    @Autowired
    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping(value = "/signup", consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<Void> signup(@RequestParam String username,
            @RequestParam String password) {

        signupService.signup(username, password);

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("http://127.0.0.1:8080/protected")).build();
    }
}
