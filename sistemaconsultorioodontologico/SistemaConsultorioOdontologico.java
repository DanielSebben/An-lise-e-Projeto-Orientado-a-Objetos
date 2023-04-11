/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaconsultorioodontologico;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection; //mostra caixas de texto para insercao de dados
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class SistemaConsultorioOdontologico {

//Lista de Pacientes
    private static ArrayList <Paciente> pacientes = new ArrayList<Paciente>();

    public static void main(String[] args) {
    //Implementacao da GUI
        System.out.println("Inicializando o Sistema...");
        GUITelaLogin tela = new GUITelaLogin();
        
    //Implementacao do menu (CRUD)
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;
        do{
            //System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("---------- Digite a opcao que voce deseja ---------- \t");
            System.out.println("Digite 1 - Cadastrar Paciente");      
            System.out.println("Digite 2 - Listar Pacientes");
            System.out.println("Digite 3 - Atualizar Paciente");
            System.out.println("Digite 4 - Excluir Paciente");
            System.out.println("Digite 5 - Sair");
            
            System.out.print("Opcao desejada: ");
            
            //Realiza a leitura da opcao selecionada
            int opcao = entrada.nextInt();
       
            switch(opcao){
                case 1 -> CadastrarPaciente(entrada);
                case 2 -> ListarPacientes(entrada);
                case 3 -> AtualizarPaciente(entrada);
                case 4 -> ExcluirPaciente(entrada);
                case 5 -> sair = true;
                default -> System.out.println("Opcao Invalida!");
            }    
        }while(!sair);
        System.out.print("Menu de opções encerrado!");
        entrada.close();
    }
    
    
    //Cadastra um paciente
    private static void CadastrarPaciente(Scanner entrada){
        System.out.print("Digite o nome do paciente: ");
        String nome = entrada.next();
        System.out.print("Digite o CPF do paciente: ");
        String CPF = entrada.next();
        System.out.print("Digite o número do telefone do paciente: ");
        String telefone = entrada.next();
        System.out.print("Digite o Email do paciente: ");
        String email = entrada.next();
        System.out.print("Digite a Data de Nascimento do paciente: ");
        String dataNascimento = entrada.next();
        System.out.print("Digite a Cidade do paciente: ");
        String cidade = entrada.next();
        System.out.print("Digite o Estado (Unidade Federativa - UF) do paciente: ");
        String UF = entrada.next();
        System.out.print("Digite o CEP do paciente: ");
        String CEP = entrada.next();
        System.out.print("Digite a Rua do paciente: ");
        String rua = entrada.next();
        System.out.print("Digite o Número da Rua do paciente: ");
        String numero = entrada.next();
        System.out.print("Digite o Complemento do Endereço do paciente: ");
        String complemento = entrada.next();
        System.out.print("Digite o Bairro do paciente: ");
        String bairro = entrada.next();
        System.out.print("Digite uma Referência do Endereço do paciente: ");
        String referencia = entrada.next();
        System.out.print("Digite o Tipo Sanguíneo do paciente: ");
        String tipoSanguineo = entrada.next();
        System.out.print("Digite a/as comorbidades do paciente: ");
        String comorbidade = entrada.next();
        System.out.print("Digite a/as medicações do paciente: ");
        String medicacao = entrada.next();
        
        Paciente paciente = new Paciente(nome, CPF, telefone, email, dataNascimento, cidade, UF, CEP, rua, numero, complemento, bairro, referencia, tipoSanguineo, comorbidade, medicacao);
        pacientes.add(paciente);
        System.out.println("Paciente cadstrado com suscesso!");
    }
   

//Listar todos os pacientes cadastrados no sistema
    private static void ListarPacientes(Scanner entrada){
        System.out.println("Lista completa de pacientes: ");
        for(Paciente paciente : pacientes){
            System.out.println(paciente); 
        }
    }
    
//Atualiza cadastro de pacientes no sistema
    private static void AtualizarPaciente(Scanner entrada){
        System.out.println("Digite o nome do paciente: ");
        String nome = entrada.next();
        for(Paciente paciente : pacientes){
            if (paciente.getNome().equals(nome)){
                System.out.print("Digite o CPF do paciente: ");
                String CPF = entrada.next();
                System.out.println("Digite o número do telefone do paciente: ");
                String telefone = entrada.next();
                System.out.print("Digite o Email do paciente: ");
                String email = entrada.next();
                System.out.print("Digite a Data de Nascimento do paciente: ");
                String dataNascimento = entrada.next();
                System.out.print("Digite a Cidade do paciente: ");
                String cidade = entrada.next();
                System.out.print("Digite o Estado (Unidade Federativa - UF) do paciente: ");
                String UF = entrada.next();
                System.out.print("Digite o CEP do paciente: ");
                String CEP = entrada.next();
                System.out.print("Digite a Rua do paciente: ");
                String rua = entrada.next();
                System.out.print("Digite o Número da Rua do paciente: ");
                String numero = entrada.next();
                System.out.print("Digite o Complemento do Endereço do paciente: ");
                String complemento = entrada.next();
                System.out.print("Digite o Bairro do paciente: ");
                String bairro = entrada.next();
                System.out.print("Digite uma Referência do Endereço do paciente: ");
                String referencia = entrada.next();
                System.out.print("Digite o Tipo Sanguíneo do paciente: ");
                String tipoSanguineo = entrada.next();
                System.out.print("Digite a/as comorbidades do paciente: ");
                String comorbidade = entrada.next();
                System.out.print("Digite a/as medicações do paciente: ");
                String medicacao = entrada.next();
                
                paciente.setCPF(CPF);
                paciente.setTelefone(telefone);
                paciente.setEmail(email);
                paciente.setDataNascimento(dataNascimento);
                paciente.setCidade(cidade);
                paciente.setUF(UF);
                paciente.setCEP(CEP);
                paciente.setRua(rua);
                paciente.setNumero(numero);
                paciente.setComplemento(complemento);
                paciente.setReferencia(referencia);
                paciente.setBairro(bairro);
                paciente.setTipoSanguineo(tipoSanguineo);
                paciente.setComorbidade(comorbidade);
                paciente.setMedicacao(medicacao);
                
                System.out.println("Cadastro do paciente atualizado com suscesso!");
                return;
            }
        }
        
        System.out.println("Cadastro de paciente não encontrado");
    }
        
//Exclui cadastro de pacientes no sistema 
    private static void ExcluirPaciente(Scanner entrada){
        System.out.println("Digite o nome do paciente: ");
        String nome = entrada.next();
        for(Paciente paciente : pacientes){
            if (paciente.getNome().equals(nome)){
                pacientes.remove(paciente);
                System.out.println("Cadastro de paciente excluído com sucesso!");
                return;        
            }
        }
        System.out.println("Cadastro de paciente não encontrado");
    }
}

