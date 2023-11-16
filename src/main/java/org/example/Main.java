package org.example;

import io.javalin.Javalin;
import org.example.data.DataSource;
import org.example.product.ProductController;
import org.example.user.UserController;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Main {
    static Configuration appConfig = new Configuration();

    public static void main(String[] args) {

        // Testing variables
        DataSource dataSource = new DataSource();


        // App init
        var app = Javalin.create(config -> {
                    config.jsonMapper(appConfig.mapper);
                })
                .get("/", ctx -> ctx.result(dataSource.toString()))
                .start(7070);


        // Routers
        app.routes(() -> {

            //User routes
            path("users", () -> {
                get(UserController::getAllUsers);
                post(UserController::createUser);
                path("{id}", () -> {
                    get(UserController::getUser);
                    patch(UserController::updateUser);
                    delete(UserController::deleteUser);
                });
                ws("events", UserController::webSocketEvents);
            });


            path("products", () -> {
                get(ProductController::getAllProducts);
                post(ProductController::createProducts);
                path("{id}", () -> {
                    get(ProductController::getProducts);
                    patch(ProductController::updateProducts);
                    delete(ProductController::deleteProducts);
                });
                ws("events", UserController::webSocketEvents);
            });

            // Testing routes
            path("testing", () -> {
                Response response = new Response("This is a JSON Object", 12);
                get(ctx -> ctx.json(response));
            });
        });


        app.get("/hello/{name}", ctx -> {
                    Response local_response = new Response("Hello " + ctx.pathParam("name"), 735);
                    ctx.json(local_response);
                }
        );
    }
}