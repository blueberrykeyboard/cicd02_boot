package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
            return "GitHub Actions 빌드 실패 시 배포 중단  CI/CD TEST";
    }
}
