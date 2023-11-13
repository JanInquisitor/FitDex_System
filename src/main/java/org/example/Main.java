package org.example;

import io.javalin.Javalin;
import org.example.data.DataSource;

public class Main {

    static Configuration appConfig = new Configuration();

    public static void main(String[] args) {


        DataSource dataSource = new DataSource();

        var app = Javalin.create(config -> {
                    config.jsonMapper(appConfig.mapper);
                })
                .get("/", ctx -> ctx.result(dataSource.toString()))
                .start(7070);


        Response response = new Response("This is a JSON Object", 12);

        app.get("/testing", ctx -> ctx.json(response));
        app.get("/hello/{name}", ctx -> {
                    Response local_response = new Response("Hello " + ctx.pathParam("name"), 735);
                    ctx.json(local_response);
                }
        );
    }
}