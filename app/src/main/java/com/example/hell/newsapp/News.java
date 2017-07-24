package com.example.hell.newsapp;

public class News {

    private String title;
    private String author;
    private String webUrl;
    private String Section;

    public News(String title, String author, String webUrl, String Section) {
        this.title = title;
        this.author = author;
        this.webUrl = webUrl;
        this.Section = Section;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getWebUrl() {
        return webUrl;
    }

    public String getSection() {
        return Section;
    }


    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", section='" + Section + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }
}