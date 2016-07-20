package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by rpimenta on 7/19/16.
 */
public class TesteJPARelacionamento {

    public static void main(String args[]) {
        double inicio = System.currentTimeMillis();

        EntityManager entityManager = JPAUtil.getEntityManager();

        Conta conta = new Conta();

        conta.setTitular("Henrique");
        conta.setBanco("Itau");
        conta.setNumero("123456-7");
        conta.setAgencia("1234");

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setDate(Calendar.getInstance());
        movimentacao.setDescricao("conta de luz");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao.setValor(new BigDecimal("124.9"));
        movimentacao.setConta(conta);


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(conta);
            entityManager.persist(movimentacao);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }

        double fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao:" + (fim - inicio)/1000 + "s");
    }

}
