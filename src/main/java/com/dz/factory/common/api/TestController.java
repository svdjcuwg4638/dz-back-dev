package com.dz.factory.common.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Value("${JAWSDB_MARIA_URL}")
    private String jawsDbMariaUrl;

    @Value("${JawsDB_PASSWORD}")
    private String jawsDbPassword;

    @Value("${JawsDB_URL}")
    private String jawsDbUrl;

    @Value("${JawsDB_USER}")
    private String jawsDbUser;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("jawsDbMariaUrl", jawsDbMariaUrl);
        model.addAttribute("jawsDbPassword", jawsDbPassword);
        model.addAttribute("jawsDbUrl", jawsDbUrl);
        model.addAttribute("jawsDbUser", jawsDbUser);
        return "index";
    }
	
}
