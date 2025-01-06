package CalcularIMC;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
   int numeroitemfaturado;
   String descricao;
   int qtditem;
   float precouni;
       
    
    Scanner leitor = new Scanner(System.in);
    
    Invoice fat = new Invoice(1, "mouse", 5, 2.50f);
    System.out.println("Fatura dos itens" );
    
    System.out.println("Informe o numero do item a ser faturado");
    numeroitemfaturado = leitor.nextInt();
    fat.setNumeroitemfaturado(numeroitemfaturado);
    
    System.out.println("Informe a descricao do produto");
    descricao = leitor.next();
    fat.setDescricao(descricao);
    
    System.out.println("Informe a quantidade dos itens");
    qtditem = leitor.nextInt();
    fat.setQtditem(qtditem);
    
    System.out.println("Informe o preco unitario dos itens");
    precouni = leitor.nextFloat();
    fat.setPrecouni(precouni);
    
    fat.getInvoiceAmount();
    
        }
    
}