package com.myMinistry.bean;

import com.myMinistry.provider.MinistryDatabase;
import com.myMinistry.provider.MinistryService;

public class Publisher {
    private long id = MinistryDatabase.CREATE_ID;
    private String name = "";
    private int isActive = MinistryService.ACTIVE;
    private String gender = "male";
    private int isDefault = MinistryService.INACTIVE;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive != 0;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = (isActive) ? 1 : 0;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isDefault() {
        return isDefault != 0;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = (isDefault) ? 1 : 0;
    }
}