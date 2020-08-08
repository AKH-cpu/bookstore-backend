package com.akhadam.kitabi.responses;

import com.akhadam.kitabi.entity.CategoryEntity;

public class SubCategoryResponse {

    String name;

    CategoryEntity category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}