package org.example;

import io.javalin.Javalin;
import org.example.data.DataSource;
import org.example.product.ProductController;
import org.example.user.UserController;

import java.io.IOException;
import java.net.URISyntaxException;

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
            // This is the "Products" routes that will use the CRUD interface, as a reference, for now at least until I
            // get more comfortable with javalin.
            crud("products/{product-id}", new ProductController());

            //User routes
            // The "Users" routes use UserController class without employing the CRUD interface, as a reference.
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

            // Testing routes
            path("testing", () -> {
//                Response response = new Response("This is a JSON Object", 12);
                String response;
                try {
                    response = dataSource.httpCallTest();
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                get(ctx -> ctx.result(response));
            });


//            path("/hello/{name}", () -> { // This doesn't work for some reason @TODO: Check why.
//                get(ctx -> {
//                    Response local_response = new Response("Hello " + ctx.pathParam("name"), 735);
//                    ctx.json(local_response);
//                });
//            });
        });


        app.get("/hello/{name}", ctx -> {
                    Response local_response = new Response("Hello " + ctx.pathParam("name"), 735);
                    ctx.json(local_response);
                }
        );
    }
}