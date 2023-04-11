/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

/**
 *
 * @author Daniel
 */
public class Secretaria extends Colaborador{
    
    public Secretaria(String nomeColaborador, String funcao, String CPF, String telefone, String email, String cidade, String UF, String CEP, String rua, String numero, String complemento, String bairro, String referencia){        
        super(nomeColaborador, funcao, CPF, telefone, email, cidade, UF, CEP, rua, numero, complemento, bairro, referencia);//construtor de Secretaria que busca os dados na classe pai (Funcionario)
    }
        
//Construtor vazio
    public Secretaria() {
    }
    
//Metodos
    public void AgendarAtendimento() {
    }
    
    public void ReceberPagamento() {
    }
    
  
}


