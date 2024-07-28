package com.example.demo.jsonplaceholder;

import lombok.Data;

@Data
public class Posts {

    private final Long userId;
    private final Long Id;
    private final String name;
    private final String body;


}
