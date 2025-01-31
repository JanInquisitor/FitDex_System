package org.FitDex.Persistence;

import org.FitDex.Food.Food;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DatabaseSetup {

    private SessionFactory sessionFactory = null;

    protected void setUp() {

        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();
        try {
            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Food.class)
                    .buildMetadata()
                    .buildSessionFactory();

            sessionFactory.inTransaction(session -> {
                session.createSelectionQuery("from Event", Food.class)
                        .getResultList()
                        .forEach(food -> System.out.println("Food (" + food.getName() + ") : " + food.getName()));
            });

        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }


    public void databaseStart() {
        setUp();
    }
}
