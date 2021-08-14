package com.karate.model;

import java.io.Serializable;

public class GolpesEntity implements Serializable {

    private String nameHit;
    private String descriptionHit;
    private int image;

    public GolpesEntity(String nameHit, String descriptionHit, int image) {
        this.nameHit = nameHit;
        this.descriptionHit = descriptionHit;
        this.image = image;
    }

    public String getNameHit() {
        return nameHit;
    }

    public void setNameHit(String nameHit) {
        this.nameHit = nameHit;
    }

    public String getDescriptionHit() {
        return descriptionHit;
    }

    public void setDescriptionHit(String descriptionHit) {
        this.descriptionHit = descriptionHit;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "golpesEntity{"
                + "nameHit='" + nameHit
                + ", descriptionHit='" + descriptionHit
                + ", image=" + image
                +'}';
    }
}
