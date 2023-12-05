package org.example.product;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import jakarta.servlet.http.HttpServletRequest;
import org.example.data.DataSource;
import org.jetbrains.annotations.NotNull;

public class ProductController implements CrudHandler {
    @Override
    public void create(@NotNull Context context) {
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {

    }

    @Override
    public void getAll(@NotNull Context context) {
        DataSource dataSource = new DataSource();
        HttpServletRequest req = context.req();
        String body = context.body();
        context.result(body);
    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {

    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {

    }
}
