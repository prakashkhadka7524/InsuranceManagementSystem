package com.projects.ims.model;

public class SubCategory {
    private int subCategoryId;
    private String name;
    private String subCategoryType;

    public SubCategory(int subCategoryId, String name, String subCategoryType) {
		super();
		this.subCategoryId = subCategoryId;
		this.name = name;
		this.subCategoryType = subCategoryType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryType() {
        return subCategoryType;
    }

    public void setSubCategoryType(String subCategoryType) {
        this.subCategoryType = subCategoryType;
    }

    public SubCategory() {
    }

  

}
