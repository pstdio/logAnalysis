package eu.pstdio.LogThrower.presentation.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@RestController
@Log
public class TestController {

    @GetMapping("/")
    public String test(){
        log.info("test no 1");
        System.out.println("test no 2");
        log.log(Level.SEVERE, "test no 3");
        throw new UnsupportedOperationException();
    }

}
