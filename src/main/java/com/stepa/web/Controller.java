package com.stepa.web;

import com.stepa.model.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private List<News> inf = new ArrayList<>();

    @PostConstruct
    private void init() {
        for (int i = 0; i < 5; i++) {
            inf.add(News.builder()
                    .title("My title" + i)
                    .description("My description" + i)
                    .build());
        }
    }

    @GetMapping("/news")
    public List<News> getLists() {
        return inf;
    }

}
