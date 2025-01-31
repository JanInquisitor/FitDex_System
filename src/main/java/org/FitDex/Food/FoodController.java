package org.FitDex.Food;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import jakarta.servlet.http.HttpServletRequest;
import org.FitDex.Persistence.FoodDataAccess;
import org.jetbrains.annotations.NotNull;

public class FoodController implements CrudHandler {
    @Override
    public void create(@NotNull Context context) {
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {

    }

    @Override
    public void getAll(@NotNull Context context) {
        FoodDataAccess dataSource = new FoodDataAccess();
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
