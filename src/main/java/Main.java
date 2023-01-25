import model.*;
import model.service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {

    public static void main(String[] args) {
        Food[] purchases = new Food[]{
                new Meat(5, 100),
                new Apple(10, 50, RED_APPLE_COLOR),
                new Apple(8, 60, GREEN_APPLE_COLOR)
        };
        ShoppingCart shoppingCart = new ShoppingCart(purchases);
        System.out.print("Сумма всех товаров без скидки: ");
        System.out.println(shoppingCart.GetFoodPriceWithoutDiscount());
        System.out.print("Сумма всех товаров со скидкой: ");
        System.out.println(shoppingCart.GetFoodPriceWithDiscount());
        System.out.print("Сумма всех вегетарианских продуктов без скидки: ");
        System.out.println(shoppingCart.GetVegetarianFoodPriceWithoutDiscount());
    }
}