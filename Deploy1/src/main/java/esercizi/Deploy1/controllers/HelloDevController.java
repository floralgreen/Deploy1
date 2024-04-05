package esercizi.Deploy1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellodev")
public class HelloDevController {

    @Value("${devName}")
    private String devName;

    @GetMapping("/wave")
    public ResponseEntity<String> waveDev(){
        return ResponseEntity.ok("Hi " + devName);
    }

}
