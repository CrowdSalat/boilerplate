package de.weyrich.mtls_rest_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String get() {
        return "Hello mTLS auth worked!";
    }
}
