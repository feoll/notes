package com.example.notestrpo.model;

public class Note {
    private int id;
    private String title;
    private String description;
    private int color;
    private String created_at;

    public Note() { }

    public Note(String title, String description, int color, String created_at) {
        this.title = title;
        this.description = description;
        this.color = color;
        this.created_at = created_at;
    }

    public Note(int id, String title, String description, int color, String created_at) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.color = color;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
