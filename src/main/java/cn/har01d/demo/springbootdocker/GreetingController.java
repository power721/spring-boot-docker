package cn.har01d.demo.springbootdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Value("${server.name:Spring}")
    private String serverName;

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/server")
    public String server() {
        return serverName;
    }
}
