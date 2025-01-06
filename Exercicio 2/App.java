package CalcularIMC;

import java.util.Scanner; 

public class App {
    public static void main(String[] args) {
    
    int opcoes;    
    float depositar, sacar;
    String alterar;
    
    Cliente cli = new Cliente("bruno",100, 50.0f, 0, 0);
  
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe qual opcao deseja seguir: 1- Alterar nome || "
            + "2 - Realizar um deposito || 3 - Realizar um Saque || 4 - Extrato ");
    opcoes = leitor.nextInt();
    
    switch (opcoes) {
        case 1 -> {
        System.out.println("Informe o nome do usuario para ser alterado");
        alterar = leitor.next();
        cli.setAlterar(alterar);
            
        break;
        }
        
        case 2 -> {
        System.out.println("Informe o valor do deposito");
        depositar = leitor.nextFloat();
        cli.setDepositar(depositar);
        System.out.println("Dados da Conta \n"  +cli.Extrato());
        break;
        }
        case 3 -> {
        System.out.println("Informe o valor que deseja sacar:");
        sacar = leitor.nextFloat();
        cli.setSacar(sacar);    
        System.out.println("Dados da Conta \n"  +cli.Extrato());
        break;
        }
        case 4 -> {
        System.out.println("Dados da Conta \n"  +cli.Extrato());

        }
        default  -> {
        System.out.println("Opcao Invalida");

        } 
    }
       
     }
    }
