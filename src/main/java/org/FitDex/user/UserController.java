package org.FitDex.user;

import io.javalin.http.Context;
import io.javalin.websocket.WsConfig;
import org.FitDex.WebAPI.Response;

public class UserController {
    public static Context getAllUsers(Context context) {
        Response response = new Response("This is a JSON Object", 12, context.statusCode());
        return context.json(response);
    }

    public static void createUser(Context context) {
    }

    public static void getUser(Context context) {
        // If this parse a number longer than an int this shit blows up (as expected)
        Response response = new Response("This is a JSON Object", Integer.parseInt(context.pathParam("id")), context.statusCode());
        context.json(response);
    }

    public static void updateUser(Context context) {
    }

    public static void deleteUser(Context context) {
    }

    public static void webSocketEvents(WsConfig wsConfig) {
    }
}
