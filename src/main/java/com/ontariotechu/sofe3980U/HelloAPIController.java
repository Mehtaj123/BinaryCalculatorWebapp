package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAPIController {

    @GetMapping("/helloAPI")
    public String helloAPI(
            @RequestParam(value = "name", defaultValue = "World") String name) {

        return "Hello " + name + "!";
    }

    @GetMapping("/emailAPI")
    public APIResult emailAPI(
            @RequestParam(value = "fname", defaultValue = "") String fname,
            @RequestParam(value = "lname", defaultValue = "") String lname) {

        // Assign default values when parameters are missing
        if (fname.equals("")) {
            fname = "John";
        }

        if (lname.equals("")) {
            lname = "Doe";
        }

        String email = fname
                + "."
                + lname
                + "@OntarioTechU.net";

        return new APIResult(fname + " " + lname, email);
    }

}