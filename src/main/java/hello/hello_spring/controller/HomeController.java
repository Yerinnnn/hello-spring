package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    // 요청이 오면 스프링 컨테이너를 먼저 찾아본 후 static 폴더를 찾아봄
    // home처럼 매핑된 게 있으면, static의 index는 무시됨
    public String home() {
        return "home";
    }
}
