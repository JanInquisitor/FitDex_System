package org.FitDex;

import org.FitDex.Food.Food;
import org.FitDex.Persistence.FoodDataAccess;
import org.FitDex.WebAPI.Server;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Also have different versions of this food in different countries; I guess I'll have to make my own database.

        // So for the comparison,
        // the app will receive the location and search all the rules and laws and food restrictions
        // of that locality
        // and then look for the product desired in the same locality
        // and compare it to the food information retrieved by the system.

        // What about a graph map for ingredients? That sounds like a good idea. But for ingredients and not nutrients.
        // Using an adjacency list for nutrients can be a bad idea seeing the number of meals and ingredients there is.


        FoodDataAccess dataSource = new FoodDataAccess();

        //App loop -- for testing
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run) {

            LocationRules rules = new LocationRules("USA");

            System.out.print("Search product: ");

            String command = scanner.nextLine();

            Food food = dataSource.getProductSingleByName(command);

//            List<Food> foodList = dataSource.getProductsByName(command);

            if (food != null) food.analyse(rules);

//            if (!foodList.isEmpty()) {
//                for (Food f : foodList) {
//                    System.out.println(f.getName());
//                }
//            }

            if (Objects.equals(command, "quit")) {
                run = false;
            }
        }

        for (Food food : dataSource.getAllProducts()) {
            System.out.println(food.getName());
        }

        Server server = new Server();
    }
}
