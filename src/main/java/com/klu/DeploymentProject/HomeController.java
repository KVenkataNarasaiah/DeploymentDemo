package com.klu.DeploymentProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HomeController {

    // Root/status/home endpoint returning current date
    @GetMapping({"/", "/home", "/status"})
    public String getCurrentDate() {
        return "Current Date: " + LocalDate.now().toString();
    }

    // Separate endpoint for date & time
    @GetMapping("/datetime")
    public String getCurrentDateTime() {
        return "Current Date & Time: " + LocalDateTime.now().toString();
    }
}
