package thymeleafday1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String admin() {
        return "/home";
    }

    @GetMapping("template/forms")
    public String getForms() {
        return "/pages/forms";
    }

    @GetMapping("template/jumbotron")
    public String getJumbotron() {
        return "/pages/jumbotron";
    }

    @GetMapping("layout/sample-1")
    public String getSample1() {
        return "/pages/sample1";
    }

    @GetMapping("layout/sample-2")
    public String getSample2() {
        return "/pages/sample2";
    }

    @GetMapping("layout/sample-3")
    public String getSample3() {
        return "/pages/sample3";
    }

    @GetMapping("layout/sample-4")
    public String getSample4() {
        return "/pages/sample4";
    }

}
