package net.ycot.ora2pg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @PostMapping("/")
    @ResponseBody
    public String Convert(@RequestParam("type") String type, @RequestParam("sql") String sql) {

        return "Request Sql:" + sql;
    }
}
