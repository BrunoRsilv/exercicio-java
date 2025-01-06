package CalcularIMC;

public class Funcionario {
    private String primeironome;
    private String sobrenome;
    private float salariomensal;
    private float salarioanual;

    public Funcionario(String primeironome, String sobrenome, float salariomensal, float salarioanual) {
        this.setPrimeironome(primeironome);
        this.setSobrenome(sobrenome);
        this.setSalariomensal(salariomensal);
        this.setSalarioanual(salarioanual);
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(float salariomensal) {
        if (salariomensal < 0) {
        this.salariomensal = 0.0f;
        } else {
        this.salariomensal = salariomensal;
        }  
    }

    public float getSalarioanual() {
        return salarioanual;
    }

    public void setSalarioanual(float salarioanual) {
        this.salarioanual = salarioanual;
    }
    
    
    
    public void InvoiceAmount(){
    System.out.println("Primeiro Nome:" +primeironome);
    System.out.println("Sobrenome:" +sobrenome);
    System.out.println("Salario:" +salariomensal);
    }
    
    public void SalarioAnual(){
    salarioanual = salariomensal * 12;
    System.out.println("O salario Anual e de R$ " +salarioanual);
    }
    
    public void AumentoSalarioAnual() {
    salariomensal = (float) (salariomensal * 0.1 + salariomensal);
    salarioanual = salariomensal * 12;
    System.out.println("O salario anual com o reajuste foi de R$ " +salarioanual);
    }
}
