package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by rpimenta on 7/19/16.
 */
public class JPAUtil {
    private static String persistenceUnitName = "financas";
    private static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory(persistenceUnitName);
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManager == null)
            entityManager = entityManagerFactory.createEntityManager();


         return entityManager;
    }

    public static void close(){
        entityManagerFactory.close();
    }
}
