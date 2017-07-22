package uk.co.jamesridgway.spring.boot.oauth2.server.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.jamesridgway.spring.boot.oauth2.server.models.TimeResponse;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @RequestMapping("/time")
    public TimeResponse time() {
        return new TimeResponse(LocalDateTime.now());
    }
}
