package restaurant;

public class menuItem {

    private String category;
    private String name;
    private String description;
    private int price;

    public menuItem(String category, String name, String description, int price) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price =price;
    }


    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
