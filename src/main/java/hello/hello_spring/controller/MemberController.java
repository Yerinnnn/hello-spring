package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired  // 생성자에 붙여놓으면, MemberController가 생성이 될 때, 스프링 빈에 등록되어 있는 MemberService 객체를 가져다가 넣어줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
