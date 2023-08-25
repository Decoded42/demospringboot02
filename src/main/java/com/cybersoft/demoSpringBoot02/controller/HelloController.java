package com.cybersoft.demoSpringBoot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation định nghĩa đường dẫn
 *  @Controller: định nghĩa đường dẫn nhưng phải trả ra nội dung HTML.
 *  @ResponseBody: Giúp trả nội dung kiểu String.
 *  @RestController: định nghĩa đường dẫn, nội dung trả về String chuyên dùng
 *                  để viết API.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Hello Sping Boot";

    }

    @GetMapping("/cybersoft")
    public String helloCybersoft() {
        return "Hello Cybersoft";
    }
}
