package org.example.user;

import io.javalin.http.Context;
import io.javalin.websocket.WsConfig;
import org.example.Response;

public class UserController {
    public static Context getAllUsers(Context context) {
        Response response = new Response("This is a JSON Object", 12);
        return context.json(response);
    }

    public static void createUser(Context context) {
    }

    public static void getUser(Context context) {
    }

    public static void updateUser(Context context) {
    }

    public static void deleteUser(Context context) {
    }

    public static void webSocketEvents(WsConfig wsConfig) {
    }
}
