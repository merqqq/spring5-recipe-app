package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {

        return "index";
    }
}
