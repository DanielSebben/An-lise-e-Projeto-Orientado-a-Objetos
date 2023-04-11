/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;


/**
 *
 * @author Daniel
 */
public class Paciente {
    private String nome;
    //private int CPF;
    private String CPF;
    //private int telefone;
    private String telefone;
    private String email;
    //private Date dataNascimento;
    private String dataNascimento;
    private String cidade;
    private String UF;
    //private int CEP;
    private String CEP;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String referencia;
    private String tipoSanguineo;
    private String comorbidade;
    private String medicacao;
    
    
    
//Construtor vazio
    public Paciente() {
    }

//Construtor passando os atributos
    //public Paciente(String nome, int CPF, int telefone, String email, Date dataNascimento, String cidade, String UF, int CEP, String rua, String numero, String complemento, String bairro, String referencia, String tipoSanguineo, String comorbidade, String medicacao) {
    public Paciente(String nome, String CPF, String telefone, String email, String dataNascimento, String cidade, String UF, String CEP, String rua, String numero, String complemento, String bairro, String referencia, String tipoSanguineo, String comorbidade, String medicacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
        this.tipoSanguineo = tipoSanguineo;
        this.comorbidade = comorbidade;
        this.medicacao = medicacao;        
    }

//Encapsulamentos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }
    
    
//metodo para exibir os dados do cadastro do usuario
    public void exibirCadastroPaciente() {
        System.out.println("Nome: " + this.nome + "\n" + "CPF: " + this.CPF + "\n" + "Telefone: " + this.telefone + "\n" + "Email: " + this.email + "\n" + "Data de Nascimento: " + this.dataNascimento + "\n" + "Cidade: "
            + this.cidade + "\n" + "UF: " + this.UF + "\n" + "CEP: " + this.CEP + "\n" + "Rua: " + this.rua + "\n" + "\n" + "Número: " + this.numero + "\n" + "Complemento: " + this.complemento + "\n" 
            + "Bairro: " + this.bairro + "\n" + "Referência: " + this.referencia + "Tipo Sanguíneo: " + this.tipoSanguineo + "\n" + "Comorbidade: " + this.comorbidade + "\n" + "Medicação: " + this.medicacao + "\n");
    }
    
    
//Sobrescrevendo a lista
    @Override
    public String toString() {
        return "nome = " + nome + ", CPF = " + CPF + ", Telefone = " + telefone + ", Email = " + email + ", Data de Nascimento = " + dataNascimento 
            + ", cidade = " + cidade + ", UF = " + UF + ", CEP = " + CEP + ", Rua = " + rua + ", Número = " + numero + ", Complemento = " + complemento
            + ", Bairro = " + bairro + ", Referência = " + referencia + ", Tipo Sanguíneo = " + tipoSanguineo + ", Comorbidade = " + comorbidade 
            + ", Medicação = " + medicacao;
    }
    
//Metodos
    /*public void CadastrarPaciente() {
    }
    
    public void AgendarConsulta() {
    }
     
    public void ReceberConsulta() {
    }
    
*/

           
}
