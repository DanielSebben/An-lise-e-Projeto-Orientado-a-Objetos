/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaconsultorioodontologico;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class DAOAgendar {
    
    public void agendarAtendimento(Agendar atendimento){  
      System.out.println("Chegou no DAO o atendimento " + atendimento.getDataAtendimento() + atendimento.getHorarioAtendimento());
     
    }
    
}
