package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")    // /hello를 요청하면 이 메소드가 실행됨
    public String hello(Model model){
        model.addAttribute("data", "Hello!");
        return "hello";     // viewResolver가 "resources:templates/" + "{ViewName}" + ".html"을 찾음
    }

    @GetMapping("hello-mvc")    // /hello-mvc를 요청하면 이 메소드가 실행됨
    // RequestParam의 required 옵션의 기본값이 true이기 때문에, /hello-mvc?name={name}으로 값을 꼭 넘겨줘야 함!
    // required = false라고 옵션을 준 후에, name값을 주지 않으면, html의 "name" 부분이 null로 출력됨
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody   // http의 응답 body부에 "hello" + name을 직접 넣어줄 때 사용
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
