package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteGerenciamentoJPA {
    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();

        entityManager.getTransaction().begin();

        Conta conta = entityManager.find(Conta.class, 1);
        entityManager.getTransaction().commit();
        conta.setTitular("Lucas");

        entityManager.getTransaction().begin();
        entityManager.merge(conta);
        entityManager.getTransaction().commit();

        JPAUtil.close();
    }
}
