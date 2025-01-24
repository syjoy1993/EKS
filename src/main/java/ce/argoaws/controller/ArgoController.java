package ce.argoaws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ArgoController {

    @GetMapping("/")
    public String text() {
        return "Hello~!" +
                "ArgoCD" +
                "EKS" +
                "그라파나" +
                "프로메테우스" +
                "EBS" +
                "EFS";
    }

}
