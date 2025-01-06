package CalcularIMC;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    //Atributos
    String primeironome;
    String sobrenome;
    float salariomensal;
    
    Scanner leitor = new Scanner(System.in);
    
    Funcionario fat = new Funcionario("Bruno", "Ribeiro", 20f, 0.0f);
    
    System.out.println("Dados do Funcionario");
    
    
    // Lendo os dados do Funcionario
    System.out.println("Infome o primeiro nome do funcionario: ");
    primeironome = leitor.next();
    fat.setPrimeironome(primeironome);
    
    System.out.println("Informe o sobrenome do funcionario: ");
    sobrenome = leitor.next();
    fat.setSobrenome(sobrenome);
    
    System.out.println("Informe o salario mensal do funcionario");
    salariomensal = leitor.nextFloat();
    fat.setSalariomensal(salariomensal);
    
    // Chamando o metodo 
    fat.InvoiceAmount();
    
    // Mostrando o salario Anual
    fat.SalarioAnual();
    
    // Mostrando salario com reajuste de 10%
    fat.AumentoSalarioAnual();
    }
    
}