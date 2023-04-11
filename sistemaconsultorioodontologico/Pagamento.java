/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Pagamento {
    
    //VINCULAR PACIENTE...
    
    private Double valor;
    private Date dataPagamento;
    private Boolean statusPagamento;

//Construtor vazio
    public Pagamento() {
    }

    public Pagamento(Double valor, Date dataPagamento, Boolean statusPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.statusPagamento = statusPagamento;
    }

//Encapsulamentos
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Boolean getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(Boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    
       
//Metodos  
    public void StatusPagamento() {
    }
 
    
}
