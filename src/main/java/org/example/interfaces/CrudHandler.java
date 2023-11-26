package org.example.interfaces;


import javax.naming.Context;

interface CrudHandler {
    Context getAll(Context ctx);

    Context getOne(Context ctx, int resourceId);

    Context create(Context ctx);

    Context update(Context ctx, int resourceId);

    Context delete(Context ctx, int resourceId);
}