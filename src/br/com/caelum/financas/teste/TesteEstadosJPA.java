package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;

/**
 * Created by rpimenta on 7/19/16.
 */
public class TesteEstadosJPA {
    public static void main(String args[]) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();

            Conta conta = entityManager.find(Conta.class, 1);
            conta.setTitular("Rafael");
            System.out.println(conta);

            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }



    }
}
