package CalcularIMC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException  {
    
    //Atributos
    String dataString;
    Date novadata; 
    String dataCompara;
    Date comparadata;
    
   
   Scanner leitor = new Scanner(System.in); 
   //Formatador para Data 
   
   SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
   //Lendo os campos Data 
   System.out.println("Informe a primeira DATA: ");
   dataString = leitor.nextLine();
   novadata = formatador.parse(dataString);
    
  //Lendo os campos Data 
   System.out.println("Informe a segunda DATA: ");
    dataCompara = leitor.nextLine();
    comparadata = formatador.parse(dataCompara);
    
    //Criando o objeto data e setando os valores para os campos
    Data p = new Data();
    p.setNovadata(novadata);
    p.setComparadata(comparadata);
   
    //imprimindo os metodos
    p.imprimirDados();
    p.ComparandoDatas();
    p.dia();
    p.mes();
    p.ano();
    

    }
}