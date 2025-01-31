package org.FitDex.WebAPI;

import io.javalin.Javalin;
import org.FitDex.Persistence.FoodDataAccess;


public class Server {
    static Configuration appConfig = new Configuration();

    public static void start() {

        // Testing variables
        FoodDataAccess dataSource = new FoodDataAccess();

        // App init
        var app = Javalin.create(config -> {
            config.jsonMapper(appConfig.mapper);
        });

        app.get("/", ctx -> ctx.result("Hello"));

        app.get("/hello", ctx -> {
            ctx.result("Hello World!");
        });

        // Sends Json back
        app.get("/hello/{name}", ctx -> {
            Response local_response = new Response("Hello " + ctx.pathParam("name"), 735, ctx.statusCode());
            ctx.json(local_response); // ctx.json() sends a json response
        });

        app.start(7070);
    }
}
