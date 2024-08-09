package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public String get(){
        try {
            jdbcTemplate.execute("select 1");
            return "Data Base is connected";

        } catch (Exception e){
            return "Data Base is not connected" + e.getMessage();
        }
    }
}
