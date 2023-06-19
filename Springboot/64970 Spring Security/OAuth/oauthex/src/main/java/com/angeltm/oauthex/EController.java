package com.angeltm.oauthex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EController {
    

    @GetMapping("/{variable}")
    public String pathParam(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/")
    public String queryParam(@RequestParam String bird, @RequestParam String dog) {
        return ""+bird+" "+dog;
    }

    @PostMapping("/insert")
    public void requestBody(@RequestBody String name ) {
        
    }

    @PostMapping("/inserth")
    public void requestHeader(@RequestHeader String name ) {
        
    }
}
