package model;

import static model.constants.Colour.RED_APPLE_COLOR;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    public Apple(int amount, double price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        this.isVegetarian = true;
    }

    private String color;

    @Override
    public double getDiscount() {
        switch (color) {
            case RED_APPLE_COLOR:
                return RED_APPLE_DISCOUNT;
            default:
                return super.getDiscount();
        }
    }
}