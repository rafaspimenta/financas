package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;

/**
 * Created by rpimenta on 7/19/16.
 */
public class TesteJPA {

    public static void main(String args[]) {
        double inicio = System.currentTimeMillis();

        EntityManager entityManager = JPAUtil.getEntityManager();

        Conta conta = new Conta();
        conta.setId(1);
        conta.setTitular("Henrique");
        conta.setBanco("Itau");
        conta.setNumero("123456-7");
        conta.setAgencia("1234");

        try {
            entityManager.getTransaction().begin();

            entityManager.remove(conta);
            System.out.println(conta);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }

        double fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao:" + (fim - inicio)/1000 + "s");
    }

}
