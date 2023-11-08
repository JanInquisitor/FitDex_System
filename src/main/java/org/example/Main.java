package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.javalin.Javalin;
import io.javalin.json.JsonMapper;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;


public class Main {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().create();

        JsonMapper gsonMapper = new JsonMapper() {
            @Override
            public String toJsonString(@NotNull Object obj, @NotNull Type type) {
                return gson.toJson(obj, type);
            }

            @Override
            public <T> T fromJsonString(@NotNull String json, @NotNull Type targetType) {
                return gson.fromJson(json, targetType);
            }
        };
        var app = Javalin.create(config -> {
                    config.jsonMapper(gsonMapper);
                })
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);


        Response response = new Response("This is a JSON Object", 12);

        app.get("/testing", ctx -> ctx.json(response));
        app.get("/hello/{name}", ctx -> ctx.result("Hello " + ctx.pathParam("name")));
    }
}