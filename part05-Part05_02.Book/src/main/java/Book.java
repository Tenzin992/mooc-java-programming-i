/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tenzi
 */
public class Book {
    private String name;
    private String title;
    private int page;
    
    public Book(String author, String name, int pages){
        this.name = author;
        this.title = name;
        this.page = pages;
    }
    
    public String getAuthor(){
        return this.name;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.page;
    }
    
    public String toString(){
        return this.name + ", " + this.title + ", " + this.page + " pages";
    }
}
