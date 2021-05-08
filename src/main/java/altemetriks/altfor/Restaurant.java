package altemetriks.altfor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

abstract class Cuisine {
    public abstract Cuisine serveFood(String dish);
    public abstract String getDish();
}

class Chinese extends Cuisine {

    private String dish;

    @Override
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    @Override
    public String getDish() {
        return this.dish;
    }
}

class Italian extends Cuisine {

    private String dish;

    @Override
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    @Override
    public String getDish() {
        return this.dish;
    }
}

class Japanese extends Cuisine {

    private String dish;

    @Override
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    @Override
    public String getDish() {
        return this.dish;
    }
}

class Mexican extends Cuisine {

    private String dish;

    @Override
    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }

    @Override
    public String getDish() {
        return this.dish;
    }
}

class UnservableCuisineRequestException extends Exception {
    public UnservableCuisineRequestException(String message) {
        super(message);
    }
}


/*
 * Create the FoodFactory class and other required classes here.
 */

class FoodFactory {

    private static FoodFactory instance;
    private Map<String, Cuisine> map = new HashMap<>();
    public static FoodFactory getFactory() {
        if(instance == null) {
            instance = new FoodFactory();
        }
        return instance;
    }

    public void registerCuisine(String cuisineKey, Cuisine cuisine) {
        map.put(cuisineKey, cuisine);
    }

    public Cuisine serveCuisine(String cuisineKey, String dish ) throws UnservableCuisineRequestException {
        if(map.containsKey(cuisineKey)) {
            return map.get(cuisineKey).serveFood(dish);
        } else throw new UnservableCuisineRequestException(String.format("Unservable cuisine %s for dish %s",cuisineKey, dish));
    }
}

public class Restaurant {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();

    static {
        FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
        FoodFactory.getFactory().registerCuisine("Italian", new Italian());
        FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
        FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
    }

    public static void main(String[] args) {
        int totalNumberOfOrders = Integer.parseInt(INPUT_READER.nextLine());
        while (totalNumberOfOrders-- > 0) {
            String[] food = INPUT_READER.nextLine().split(" ");
            String cuisine = food[0];
            String dish = food[1];

            try {
                if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
                    Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);

                    switch (cuisine) {
                        case "Chinese":
                            Chinese chineseDish = (Chinese) servedFood;
                            System.out.println("Serving " + chineseDish.getDish() + "(Chinese)");
                            break;
                        case "Italian":
                            Italian italianDish = (Italian) servedFood;
                            System.out.println("Serving " + italianDish.getDish() + "(Italian)");
                            break;
                        case "Japanese":
                            Japanese japaneseDish = (Japanese) servedFood;
                            System.out.println("Serving " + japaneseDish.getDish() + "(Japanese)");
                            break;
                        case "Mexican":
                            Mexican mexicanDish = (Mexican) servedFood;
                            System.out.println("Serving " + mexicanDish.getDish() + "(Mexican)");
                            break;
                        default:
                            break;
                    }
                }
            } catch (UnservableCuisineRequestException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}