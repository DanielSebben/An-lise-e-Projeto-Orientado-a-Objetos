/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

/**
 *
 * @author Daniel
 */
public class Agendar {
    
//VINCULAR PACIENTE...
    
    private String dataAtendimento;
    private String horarioAtendimento;
    DAOAgendar da;
    
//Construtor vazio
    public Agendar() {
    }

    public Agendar(String dataAtendimento, String horarioAtendimento) {
        this.dataAtendimento = dataAtendimento;
        this.horarioAtendimento = horarioAtendimento;
    }

//Encapsulamentos
    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }
    
    
//Metodos
    public void AgendarAtendimento() {
        System.out.println("Agendar Consulta "+ this.getHorarioAtendimento() + this.getDataAtendimento());
        da = new DAOAgendar();
        da.agendarAtendimento(this);
   
    } 
     
    
    public void CancelarAtendimento() {
    }
    
    
}
