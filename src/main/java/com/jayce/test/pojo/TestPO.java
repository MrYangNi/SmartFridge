package com.jayce.test.pojo;

/**
 * Created by Jaycejia on 2016/12/3.
 */
public class TestPO {
    private String title;
    private String content;

    @Override
    public String toString() {
        return "TestPO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
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
}
