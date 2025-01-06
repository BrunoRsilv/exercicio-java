package CalcularIMC;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
  
    float valor, litros, novopreco, retiradobomba;
    String novocombustivel;
    
    BombaCombustivel Bom = new BombaCombustivel("Alcool", 05.0f, 10.0f);
    
    Scanner leitor = new Scanner(System.in);
 
        
        System.out.println("Tipo de Combustivel " +Bom.getTipoCombustivel()+ " \n Informe o valor que deseja abastecer:");
        valor = leitor.nextFloat();
        Bom.setAbastecerValor(valor);
        System.out.println("Valor Abastecido R$"+valor+ ", foi colocado " +Bom.getQtdcombustivel()+ " Litros de " +Bom.getTipoCombustivel());
       
        System.out.println("Abastecer por Litro: \n Informe a quantidade de litros que deseja abastecer");
        litros = leitor.nextFloat();
        Bom.setAbastecerLitro(litros);
        System.out.println("Litros abastecidos: "+litros+ "Litros, \nValor a pagar R$"  +Bom.getQtdcombustivel());
          
        System.out.print("Informe o valor que deseja alterar do combustivel:");
        novopreco = leitor.nextFloat();
        Bom.setAlterarValor(novopreco);
        System.out.println("O novo valor do combustivel e R$ "+novopreco);
     
        System.out.println("Alterar o tipo de Combustivel");
        novocombustivel = leitor.next();
        Bom.setTipoCombustivel(novocombustivel);
        System.out.println("O novo combustivel e "+novocombustivel);
        
        System.out.println("Quantos litros de combustivel foi retirado da bomba");
        retiradobomba = leitor.nextFloat();
        Bom.setRetiradoBomba(retiradobomba);
        System.out.println("Foi retirado da Bomda " +retiradobomba + " resta na bomba " +Bom.getQtdcombustivel());
        
        }
    
}