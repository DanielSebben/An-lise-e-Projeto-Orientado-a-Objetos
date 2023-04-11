/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;


/**
 *
 * @author Daniel
 */
public class Atendimento {
    
    //VINCULAR PACIENTE
    
    private Integer codigoAtendimento;
    private String dataAtendimento;
    private String horaAtendimento;
    
//Construtor vazio
    public Atendimento() {
    }

    public Atendimento(Integer codigoAtendimento, String dataAtendimento, String horaAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
        this.dataAtendimento = dataAtendimento;
        this.horaAtendimento = horaAtendimento;
    }

//Encapsulamentos
    public Integer getCodigoAtendimento() {
        return codigoAtendimento;
    }

    public void setCodigoAtendimento(Integer codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getHoraAtendimento() {
        return horaAtendimento;
    }

    public void setHoraAtendimento(String horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }
    
//Metodos
    public void RegistrarAtendimento() {
    }
    
}
