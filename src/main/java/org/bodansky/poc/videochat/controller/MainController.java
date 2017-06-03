package org.bodansky.poc.videochat.controller;

/*
 * Created by Adam Bodansky on 2017.06.02..
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videochat")
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/index")
    public String index() {
        log.info("index() - open index.html");
        return "index";
    }
}
