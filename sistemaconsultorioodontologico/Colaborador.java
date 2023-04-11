/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

/**
 *
 * @author Daniel
 */
public class Colaborador {
    private String nomeColaborador;
    private String funcao;
    private String CPF;
    private String telefone;
    private String email;
    private String cidade;
    private String UF;
    private String CEP;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String referencia;
    
//Construtor vazio
    public Colaborador() {
    }
    
    public Colaborador(String nomeColaborador, String funcao, String CPF, String telefone, String email, String cidade, String UF, String CEP, String rua, String numero, String complemento, String bairro, String referencia){        
        this.nomeColaborador = nomeColaborador;
        this.funcao = funcao; 
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }

//Encapsulamentos
    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
 
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
}