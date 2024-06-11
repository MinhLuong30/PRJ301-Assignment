/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author minhl
 */
public class Product {
    private String comicid;
    private String name;
    private String description;
     private String artist;
    private int price;
    private int quantity;
    private String image;
    private String report;

    public Product() {
    }

    public Product(String comicid, String name, String description, String artist, int price, int quantity, String image, String report) {
        this.comicid = comicid;
        this.name = name;
        this.description = description;
        this.artist = artist;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.report = report;
    }

    public Product(String comicid, String name, String description, String artist, int price, String image) {
        this.comicid = comicid;
        this.name = name;
        this.description = description;
        this.artist = artist;
        this.price = price;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "comicid=" + comicid + ", name=" + name + ", description=" + description + ", artist=" + artist + ", price=" + price + ", quantity=" + quantity + ", image=" + image + ", report=" + report + '}';
    }

    

    public String getComicid() {
        return comicid;
    }

    public void setComicid(String comicid) {
        this.comicid = comicid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    
}
