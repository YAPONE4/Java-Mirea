package ru.mirea;

import java.util.ArrayList;
import java.util.LinkedList;

public class Order {
    private int size;
    private LinkedList<Item> dishes;

    public Order() {
        this.dishes = new LinkedList<Item>();
        this.size = 0;
    }

    public boolean add(Item item) {
        if (item != null) {
            this.dishes.add(item);
            return true;
        } else return false;
    }

    public boolean remove(String name) {
        for (int i = 0; i < this.size; i++) {
            if (dishes.get(i).getName() == name) {
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }

    public int removeAll(String name) {
        dishes = new LinkedList<Item>();
        size = 0;
        return 0;
    }

    public int dishQuantity() {
        return size;
    }

    public int dishQuantity(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (dishes.get(i).getName() == name) {
                count++;
            }
        }
        return count;
    }

    public LinkedList<Item> getDishes() {
        return dishes;
    }

    public float costTotal() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            count += dishes.get(i).getPrice();
        }
        return count;
    }

    public String dishesNames() {
        String order = "Ordered Dishes: ";
        for (int i = 0; i < size; i++) {
            order += dishes.get(i).getName() + " ";
        }
        return order;
    }

    public LinkedList<Item> sortedDishesByPrice() {
        LinkedList<Item> newdishes = dishes;
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            for (int i = right; i > left; i++)
                if (newdishes.get(i - 1).getPrice() > newdishes.get(i).getPrice()) {
                    Item temp = newdishes.get(i);
                    newdishes.remove(i);
                    newdishes.add(i - 1, temp);
                }
            ++left;
            for (int i = left; i < right; ++i) {
                if (newdishes.get(i).getPrice() > newdishes.get(i + 1).getPrice()) {
                    Item temp = newdishes.get(i + 1);
                    newdishes.remove(i + 1);
                    newdishes.add(i, temp);
                }
            }
            --right;
        }
        return newdishes;
    }
}
