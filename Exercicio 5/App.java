package CalcularIMC;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    int matricula;    
    String nome;
    float nota1, nota2, notatrabalho;
    
    Alunos alu = new Alunos(1, "bruno", 10, 10, 0);
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe os dados do Aluno");
    
    System.out.println("Informe o numero da Matricula");
    matricula = leitor.nextInt();
    alu.setMatricula(matricula);
    
    System.out.println("Nome:");
    nome = leitor.next();
    alu.setNome(nome);
    
    System.out.println("Informe a nota da primeira prova:");
    nota1 = leitor.nextFloat();
    alu.setNota1(nota1);
    
    System.out.println("Informe a nota da segunda prova:");
    nota2 = leitor.nextFloat();
    alu.setNota2(nota2);
    
    System.out.println("Informe a nota do trabalho");
    notatrabalho = leitor.nextFloat();
    alu.setNotatrabalho(notatrabalho);
    
    
    alu.media();
    alu.mediafinal();  
        }
    
}