package CalcularIMC;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;


public class Pessoa {
    public static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
    
//atributos
    private String nome;
    private double altura;
    private Date datanasc;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    
    public int CalcularIdade() {
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);
        
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        int anoNasc = Integer.parseInt(formatador.format(this.getDatanasc()));
        
        return anoAtual - anoNasc;
        
    }
    
    public void imprimirdados(){
    System.out.println("Nome = " + this.nome);
    System.out.println("Altura = " + this.altura);
    System.out.println("Data de Nascimento = " + this.datanasc);
    System.out.println("Idade = " + this.CalcularIdade()); 
    }

       
}



