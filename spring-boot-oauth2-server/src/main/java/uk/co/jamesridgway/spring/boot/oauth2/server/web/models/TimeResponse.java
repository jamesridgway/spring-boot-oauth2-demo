package uk.co.jamesridgway.spring.boot.oauth2.server.web.models;

import java.time.LocalDateTime;

public class TimeResponse {

    private final LocalDateTime time;

    public TimeResponse(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
