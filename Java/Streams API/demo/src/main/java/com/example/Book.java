package com.example;

public class Book {

    private int id;
    private String tittle;
    private String author;
    private String category;
    private Double price;
    
    public Book(int id, String tittle, String author, String category, Double price) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    




}
