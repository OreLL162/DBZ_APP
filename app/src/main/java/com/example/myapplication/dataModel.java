package com.example.myapplication;

public class dataModel {

    private String name ;
    private String version ;

    private int id ;
    private int image ;

    public dataModel(String name, String version, int id, int image) {
        this.name = name;
        this.version = version;
        this.id = id;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
