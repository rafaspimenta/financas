package br.com.caelum.financas.util;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Calendar;

public class PopulaMovimentacao {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();

        manager.getTransaction().begin();

        Conta conta1 = manager.find(Conta.class,1);
        Conta conta2 = manager.find(Conta.class,2);
        Conta conta3 = manager.find(Conta.class,3);
        Conta conta4 = manager.find(Conta.class,4);
        Conta conta5 = manager.find(Conta.class,5);


        // Movimentacoes da conta1
        Movimentacao movimentacao1 = new Movimentacao();
        Movimentacao movimentacao2 = new Movimentacao();
        Movimentacao movimentacao3 = new Movimentacao();
        Movimentacao movimentacao4 = new Movimentacao();

        movimentacao1.setDate(Calendar.getInstance());
        movimentacao1.setDescricao("Conta de luz - ABRIL/2012");
        movimentacao1.setValor(new BigDecimal("135"));
        movimentacao1.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao1.setConta(conta1);

        manager.persist(movimentacao1);

        movimentacao2.setDate(Calendar.getInstance());
        movimentacao2.setDescricao("Almoco no Restaurante - AGOSTO/2012");
        movimentacao2.setValor(new BigDecimal("175.80"));
        movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao2.setConta(conta1);

        manager.persist(movimentacao2);

        movimentacao3.setDate(Calendar.getInstance());
        movimentacao3.setDescricao("Aluguel - MAIO/2012");
        movimentacao3.setValor(new BigDecimal("680.00"));
        movimentacao3.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao3.setConta(conta1);

        manager.persist(movimentacao3);

        movimentacao4.setDate(Calendar.getInstance());
        movimentacao4.setDescricao("Salario - FEVEREIRO/2012");
        movimentacao4.setValor(new BigDecimal("3830.68"));
        movimentacao4.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao4.setConta(conta1);

        manager.persist(movimentacao4);

        // Movimentacoes da conta2
        Movimentacao movimentacao5 = new Movimentacao();
        Movimentacao movimentacao6 = new Movimentacao();

        movimentacao5.setDate(Calendar.getInstance());
        movimentacao5.setDescricao("Conta de telefone - SETEMBRO/2011");
        movimentacao5.setValor(new BigDecimal("168.27"));
        movimentacao5.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao5.setConta(conta2);

        manager.persist(movimentacao5);

        movimentacao6.setDate(Calendar.getInstance());
        movimentacao6.setDescricao("Aniversario - MAIO/2011");
        movimentacao6.setValor(new BigDecimal("200"));
        movimentacao6.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao6.setConta(conta2);

        manager.persist(movimentacao6);

        // Movimentacoes da conta3
        Movimentacao movimentacao7 = new Movimentacao();
        Movimentacao movimentacao8 = new Movimentacao();
        Movimentacao movimentacao9 = new Movimentacao();

        movimentacao7.setDate(Calendar.getInstance());
        movimentacao7.setDescricao("Lanche - JULHO/2011");
        movimentacao7.setValor(new BigDecimal("28.50"));
        movimentacao7.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao7.setConta(conta3);

        manager.persist(movimentacao7);

        movimentacao8.setDate(Calendar.getInstance());
        movimentacao8.setDescricao("Presente - DEZEMBRO/2011");
        movimentacao8.setValor(new BigDecimal("49.99"));
        movimentacao8.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao8.setConta(conta3);

        manager.persist(movimentacao8);

        movimentacao9.setDate(Calendar.getInstance());
        movimentacao9.setDescricao("Bonus - JANEIRO/2012");
        movimentacao9.setValor(new BigDecimal("2000"));
        movimentacao9.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao9.setConta(conta3);

        manager.persist(movimentacao9);

        // Movimentacoes da conta4
        Movimentacao movimentacao10 = new Movimentacao();

        movimentacao10.setDate(Calendar.getInstance());
        movimentacao10.setDescricao("Carnaval - MARCO/2012");
        movimentacao10.setValor(new BigDecimal("765.20"));
        movimentacao10.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao10.setConta(conta4);

        manager.persist(movimentacao10);

        // Movimentacoes da conta5
        Movimentacao movimentacao11 = new Movimentacao();
        Movimentacao movimentacao12 = new Movimentacao();

        movimentacao11.setDate(Calendar.getInstance());
        movimentacao11.setDescricao("Salario - ABRIL/2012");
        movimentacao11.setValor(new BigDecimal("2651.90"));
        movimentacao11.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao11.setConta(conta5);

        manager.persist(movimentacao11);

        movimentacao12.setDate(Calendar.getInstance());
        movimentacao12.setDescricao("Bonus - JANEIRO/2012");
        movimentacao12.setValor(new BigDecimal("1000"));
        movimentacao12.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao12.setConta(conta5);

        manager.persist(movimentacao12);

        manager.getTransaction().commit();

        JPAUtil.close();

    }

}