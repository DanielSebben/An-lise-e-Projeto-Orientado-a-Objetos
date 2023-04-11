/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Exame {
    
    //VINCULAR PACIENTE
    
    private Integer codigoExame;
    private String nomeExame;
    private Date dataExame;
    private Time horaExame;

//Construtor vazio
    public Exame() {
    }

    public Exame(Integer codigoExame, String nomeExame, Date dataExame, Time horaExame) {
        this.codigoExame = codigoExame;
        this.nomeExame = nomeExame;
        this.dataExame = dataExame;
        this.horaExame = horaExame;
    }

//Encapsulamentos
    public Integer getCodigoExame() {
        return codigoExame;
    }

    public void setCodigoExame(Integer codigoExame) {
        this.codigoExame = codigoExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public Date getDataExame() {
        return dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }

    public Time getHoraExame() {
        return horaExame;
    }

    public void setHoraExame(Time horaExame) {
        this.horaExame = horaExame;
    }
    
       
//Metodos
    public void RegistrarExame() {
    }
    
}
