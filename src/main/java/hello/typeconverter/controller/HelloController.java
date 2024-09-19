package hello.typeconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    // http://localhost:8080/hello-v1?data=10
    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); // 문자 타입 조회
        Integer intValue = Integer.valueOf(data); // 숫자 타입으로 변경
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    
    // http://localhost:8080/hello-v2?data=10
    // 스프링부트가 제공하는 @RequestParam 사용
    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

    
}
