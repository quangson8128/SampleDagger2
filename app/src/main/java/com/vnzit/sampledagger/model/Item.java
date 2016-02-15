package com.vnzit.sampledagger.model;

/**
 * Created by quangson8128 on 2/15/16.
 */
public class Item {
    private String title;
    private String content;

    public Item(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
