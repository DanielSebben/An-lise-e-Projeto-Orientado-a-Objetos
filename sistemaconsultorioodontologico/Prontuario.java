/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

/**
 *
 * @author Daniel
 */
public class Prontuario {
    
    //VINCULAR PACIENTE...
    
    private String descricao;
    private String nomeMedicamento;
    private String doseMedicamento;
    private String tempoMedicamento;
    
//Construtor vazio
    public Prontuario() {
    }

    public Prontuario(String descricao, String nomeMedicamento, String doseMedicamento, String tempoMedicamento){        
        this.descricao = descricao;
        this.doseMedicamento = nomeMedicamento;
        this.tempoMedicamento = doseMedicamento;
        this.tempoMedicamento = tempoMedicamento; 
    }
    
//Encapsulamentos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public String getDoseMedicamento() {
        return doseMedicamento;
    }

    public void setDoseMedicamento(String doseMedicamento) {
        this.doseMedicamento = doseMedicamento;
    }

    public String getTempoMedicamento() {
        return tempoMedicamento;
    }

    public void setTempoMedicamento(String tempoMedicamento) {
        this.tempoMedicamento = tempoMedicamento;
    }
    
    
//Metodos
    public void RegistrarProntuario() {
    }
    
    
}
