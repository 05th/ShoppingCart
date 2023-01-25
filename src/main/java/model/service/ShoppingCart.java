package model.service;

import model.Food;

public class ShoppingCart {

    private Food[] purchases;

    public ShoppingCart(Food[] purchases) {
        this.purchases = purchases;
    }

    public double GetFoodPriceWithoutDiscount() {
        double result = 0;
        for (Food purchase : purchases) {
            result += purchase.getAmount() * purchase.getPrice();
        }
        return result;
    }

    public double GetFoodPriceWithDiscount() {
        double result = 0;
        for (Food purchase : purchases) {
            double price = purchase.getPrice();
            double discount = purchase.getDiscount();
            if (discount > 0) {
                price *= (100 - discount) / 100;
            }
            result += purchase.getAmount() * price;
        }
        return result;
    }

    public double GetVegetarianFoodPriceWithoutDiscount() {
        double result = 0;
        for (Food purchase : purchases) {
            if (purchase.isVegetarian()) {
                result += purchase.getAmount() * purchase.getPrice();
            }
        }
        return result;
    }
}