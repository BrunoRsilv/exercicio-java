package CalcularIMC;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws ParseException {
   
        
       Scanner leitor = new Scanner(System.in);
       SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
       
       String nome, dataString ;
       double altura;
       Date datanasc;
       
       
       System.out.println("Informe o nome:");
       nome = leitor.nextLine();
       
       System.out.println("Informe a altura:");
       altura = Double.parseDouble(leitor.nextLine());
       
       System.out.println("Infome a data de nascimento");
       dataString = leitor.nextLine();
       datanasc = formatador.parse(dataString);
             
       
       Pessoa p = new Pessoa();
       p.setNome(nome);
       p.setAltura(altura);
       p.setDatanasc(datanasc);
       
       
      p.imprimirdados();
     }    
    }
