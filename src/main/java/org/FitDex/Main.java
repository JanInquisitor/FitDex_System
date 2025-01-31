package org.FitDex;

import org.FitDex.Food.Food;
import org.FitDex.Persistence.FoodDataAccess;
import org.FitDex.WebAPI.Server;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Now the next step is, to work on the data layer without Hibernate with pure JDBC and SQL code.
        // I'll start to pull food from the database with high concentrations of omega-6 and a warning system that will
        // let users know the risks of this food.
        // Also have different versions of this food in different countries, I guess I'll have to make my own database
        // entries to work and test my functionalities.. I could've done that from the beginning now that I think about it.


        // A class that analyzes the nutritional facts and ingredients of the product/food
        // A class that is a warning and maybe another one that makes warning.

        // Right now the structure is messy but right now I'm just working on functionality, when I finish prototyping
        // the main functionalities then I'll refactor the code, I'm thinking of making the Food/Product object smaller using composition.
        FoodDataAccess dataSource = new FoodDataAccess();

        try {
//            dataSource.getAllProducts();
            Food food = dataSource.getProductsById(111048403);

            System.out.println(food.getName());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        Server server = new Server();
//        server.start();
    }
}
