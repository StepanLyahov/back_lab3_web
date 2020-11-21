package com.stepa.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/lists")
    public String getLists() {
        return "\"lists\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Продажи\",\n" +
                "      \"colorId\": 5\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"Фронтенд\",\n" +
                "      \"colorId\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"name\": \"Фильмы и сериалы\",\n" +
                "      \"colorId\": 3\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"Книги\",\n" +
                "      \"colorId\": 2\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 5,\n" +
                "      \"name\": \"Личное\",\n" +
                "      \"colorId\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Спорт\",\n" +
                "      \"colorId\": 3,\n" +
                "      \"id\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Курс по ReactJS ToDo\",\n" +
                "      \"colorId\": 7,\n" +
                "      \"id\": 7\n" +
                "    }\n" +
                "  ]";
    }


    @GetMapping("/colors")
    public String getColors() {
        return "\"colors\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"hex\": \"#C9D1D3\",\n" +
                "      \"name\": \"grey\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"hex\": \"#42B883\",\n" +
                "      \"name\": \"green\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"hex\": \"#64C4ED\",\n" +
                "      \"name\": \"blue\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"hex\": \"#FFBBCC\",\n" +
                "      \"name\": \"pink\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 5,\n" +
                "      \"hex\": \"#B6E6BD\",\n" +
                "      \"name\": \"lime\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 6,\n" +
                "      \"hex\": \"#C355F5\",\n" +
                "      \"name\": \"purple\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 7,\n" +
                "      \"hex\": \"#110133\",\n" +
                "      \"name\": \"black\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 8,\n" +
                "      \"hex\": \"#FF6464\",\n" +
                "      \"name\": \"red\"\n" +
                "    }\n" +
                "  ]";
    }

}
