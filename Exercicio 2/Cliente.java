
package CalcularIMC;


public class Cliente {
    private String nome;
    private int numeroconta;
    private float saldo;
    private float deposito;
    private float saque;
    

    public Cliente(String nome, int numeroconta, float saldo, float deposito, float saque) {
        this.nome = nome;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.deposito = deposito;
        this.saque = saque;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
       this.deposito = deposito;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    //metodo de mostrar Extrato da conta
    public String Extrato() { 
    return "Nome cliente: " + nome+  " \n" + "Numero da Conta: " +numeroconta
            + "\n" + "Saldo da Conta: " +saldo;
    }
    
    //metodo de alterar nome de usuario da conta
    public void setAlterar(String valor){
    nome = valor;
    System.out.println("O nome foi alterado de: " +nome+ " para " +valor);
    }
    
    //metodo de depositar 
    public void setDepositar(float valor) {
    saldo = saldo + valor;
    System.out.println("Deposito realizado de : " +valor+ " seu novo saldo e " +saldo);
    }

    //metodo de sacar
    public void setSacar(float valor) {
     if(saldo < valor) {
     System.out.println("Voce nao tem saldo suficiente para sacar, seu saldo e " +saldo );
     } else {
    saldo = saldo - valor;
    System.out.println("Voce sacou " +valor+ " seu saldo e de " +saldo); 
     }
   }
  
  
    
}
