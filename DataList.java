package com.example.tmlab;

public class DataList {
    private String Dotalist ;
    private int Stock ;

    public String getDotalist() {
        return Dotalist;
    }

    public void setDotalist(String dotalist) {
        Dotalist = dotalist;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public DataList(String dotalist, int stock) {
        Dotalist = dotalist;
        Stock = stock;
    }
}
