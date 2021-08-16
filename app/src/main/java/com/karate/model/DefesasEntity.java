package com.karate.model;

import java.io.Serializable;

public class DefesasEntity implements Serializable {

    private String nameHit;
    private String descriptionHit;
    private int imageCoup;
    private String technicasDetails;
    private int executionCoup;

    public DefesasEntity(String nameHit, String descriptionHit, int imageCoup, String technicasDetails, int executionCoup) {
        this.nameHit = nameHit;
        this.descriptionHit = descriptionHit;
        this.imageCoup = imageCoup;
        this.technicasDetails = technicasDetails;
        this.executionCoup = executionCoup;
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

    public int getImageCoup() {
        return imageCoup;
    }

    public void setImageCoup(int imageCoup) {
        this.imageCoup = imageCoup;
    }

    public String getTechnicasDetails() {
        return technicasDetails;
    }

    public void setTechnicasDetails(String technicasDetails) {
        this.technicasDetails = technicasDetails;
    }

    public int getExecutionCoup() {
        return executionCoup;
    }

    public void setExecutionCoup(int executionCoup) {
        this.executionCoup = executionCoup;
    }

    @Override
    public String toString() {
        return "DefesasEntity{" +
                "nameHit='" + nameHit + '\'' +
                ", descriptionHit='" + descriptionHit + '\'' +
                ", imageCoup=" + imageCoup +
                ", technicasDetails='" + technicasDetails + '\'' +
                ", executionCoup=" + executionCoup +
                '}';
    }
}
