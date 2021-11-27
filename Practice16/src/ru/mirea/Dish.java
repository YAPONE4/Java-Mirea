package ru.mirea;

final class Dish implements Item {

    private float price;
    private String name;
    private String desc;

    public Dish(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Dish(float price, String name, String desc) {
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }
}