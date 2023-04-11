/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

/**
 *
 * @author Daniel
 */
public class Dentista extends Colaborador{
    private String CRO;
    
    public Dentista(String CRO, String nomeColaborador, String funcao, String CPF, String telefone, String email, String cidade, String UF, String CEP, String rua, String numero, String complemento, String bairro, String referencia){        
        super(nomeColaborador, funcao, CPF, telefone, email, cidade, UF, CEP, rua, numero, complemento, bairro, referencia);//construtor de Dentista que busca os dados na classe pai (Funcionario)
        this.CRO = CRO;
    }
    
//Construtor vazio
    public Dentista(){
    }
    
//Encapsulamento
    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

   // public Dentista(int CRO) {
        //this.CRO = CRO;
    
    
//Metodos
    public void RealizarAtendimento() {
    }
   
    public void SolicitarExame() {
    }
    
    public void EmitirProntuario() {
    }

}
