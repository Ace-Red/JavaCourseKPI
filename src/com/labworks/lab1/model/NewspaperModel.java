package com.labworks.lab1.model;

public class NewspaperModel {
    private String name;
    private String type;
    private float price;
    private int periodicity;
    private String company;
    private String fullNameDirector;

    public NewspaperModel(String name, String type, float price, int periodicity, String company, String fullNameDirector) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.periodicity = periodicity;
        this.company = company;
        this.fullNameDirector = fullNameDirector;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFullNameDirector(String fullNameDirector) {
        this.fullNameDirector = fullNameDirector;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public String getCompany() {
        return company;
    }

    public String getFullNameDirector() {
        return fullNameDirector;
    }

    @Override
    public String toString() {
        return "Newspapers{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", periodicity=" + periodicity +
                ", company='" + company + '\'' +
                ", fullNameDirector='" + fullNameDirector + '\'' +
                '}';
    }




}
