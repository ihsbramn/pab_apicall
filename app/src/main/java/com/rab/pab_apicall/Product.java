package com.rab.pab_apicall;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("brand")
    private String brand;

    @SerializedName("name")
    private String name;

    @SerializedName("image_link")
    private String imageUrl;

    public Product(String brand, String name, String imageUrl) {
        this.brand = brand;
        this.name = name;
        this.imageUrl = imageUrl;
    }


    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
