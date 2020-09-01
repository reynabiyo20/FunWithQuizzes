package restaurant;

import java.util.Date;

public class menuItem {

    private String category;
    private String name;
    private String description;
    private int price;
    private Date whenAdded;
    public boolean isNew;


    public menuItem(String category, String name, String description, int price) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price =price;
    }


    public String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getWhenAdded() {
        return whenAdded;
    }

    public void setWhenAdded() {
        this.whenAdded = whenAdded;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew() {
        this.isNew = isNew;
    }
















}
