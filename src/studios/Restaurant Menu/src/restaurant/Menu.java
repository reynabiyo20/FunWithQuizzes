package restaurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {



    ArrayList<menuItem> dishes = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Menu(ArrayList<menuItem> dishes, Date lastUpdated) {
        this.dishes = dishes;
        this.lastUpdated = lastUpdated;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    private static void main (String[] args) {

    }

    private ArrayList<menuItem> addItems(menuItem toAdd) {
        if(!dishes.contains(toAdd)) {
            this.dishes.add(toAdd);
        }
            return dishes;
    }

    private ArrayList<menuItem> removeItem(menuItem toRemove) {
        if(dishes.contains(toRemove)) {
            this.dishes.remove(toRemove);
        }
        return dishes;
    }

    public ArrayList<menuItem> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<menuItem> dishes) {
        this.dishes = dishes;
    }

    public void PrintMenuItem(MenuItem itemToPrint) {
        System.out.println(itemToPrint);
    }

    public static void PrintMenu(Menu TheMenuToPrint) {
        System.out.println(TheMenuToPrint);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

//    public boolean IsItemEqual(MenuItem item) {
//
//
//    }

}
