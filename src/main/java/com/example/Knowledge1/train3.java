package com.example.Knowledge1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train3 {
    @GetMapping("/train3")
    public String getData() {return  "Please book your hotel ticket for New Delhi 50% discount" ; }
}
