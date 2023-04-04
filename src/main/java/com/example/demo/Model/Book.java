package com.example.demo.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Books")
public class Book {
    private String name;

    private String authorName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
