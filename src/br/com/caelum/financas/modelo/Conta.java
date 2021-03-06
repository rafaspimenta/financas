package br.com.caelum.financas.modelo;

import javax.persistence.*;

/**
 * Created by rpimenta on 7/19/16.
 */
@Entity
@SequenceGenerator(name = "seq_contas", sequenceName = "seq_contas", initialValue = 1, allocationSize = 1)
public class Conta {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_contas")
    private Integer id;
    private String titular;
    private String numero;
    private String banco;
    private String agencia;

    public Integer getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", banco='" + banco + '\'' +
                ", numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}
