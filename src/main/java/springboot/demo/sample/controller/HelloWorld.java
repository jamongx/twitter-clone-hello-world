package springboot.demo.sample.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class HelloWorld {
    @GetMapping
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello World!!");
    }
}
