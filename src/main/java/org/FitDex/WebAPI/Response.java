package org.FitDex.WebAPI;

public class  Response {

    String message;

    int data;

    int statusCode;

    public Response(String message, int data, int statusCode) {
        this.message = message;
        this.data = data;
        this.statusCode = statusCode;
    }
}
