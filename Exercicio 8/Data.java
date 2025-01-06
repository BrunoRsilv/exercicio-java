package CalcularIMC;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;


public class Data implements Cloneable {
    // Construtor da Classe
    public static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
    private Date  novadata;
    private Date comparadata;
    private Date ate;
    private int resultado;
    private boolean anobissexto;
    
       
    public Data() {
        this.novadata = novadata;
        this.comparadata = comparadata;
        this.ate = ate;
    }


    public Date getNovadata() {
        return novadata;
    }

    public void setNovadata(Date novadata) {
        this.novadata = novadata;
    }

    public Date getComparadata() {
        return comparadata;
    }

    public void setComparadata(Date comparadata) {
        this.comparadata = comparadata;
    }

    public Date getAte() {
        return ate;
    }

    public void setAte(Date ate) {
        this.ate = ate;
    }
    
    // Metodo que imprime as Datas informadas
    public void imprimirDados(){
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Mostrando a data " +formatador.format(this.getNovadata()));
    System.out.println("Mostrando a 2 data " +formatador.format(this.getComparadata()));
    }
    
    //Metodo que compara quais das duas datas é a maior ou menor
    public void ComparandoDatas(){
    resultado = (novadata.compareTo(comparadata));
  
    if (resultado == 1){
    System.out.println("A primeira data e maior");
    } 
    else if (resultado == -1) {
    System.out.println("A segunda data e maior");
    } 
    else {
    System.out.println("As datas sao iguais");
     }  
    }

    //Metodos para retornar o dia
    public void dia(){
    SimpleDateFormat formatador = new SimpleDateFormat("dd");
    System.out.println("Mostrando o dia da primeira data, Dia: " +formatador.format(this.getNovadata()));
    System.out.println("Mostrando o dia da segunda data, Dia: " +formatador.format(this.getComparadata()));
    }
    
    //Metodos para retornar o mes por extenso, usando o LOCALE
    public void mes(){
   
    SimpleDateFormat formatador = new SimpleDateFormat("MMMM");
    System.out.println("Mostrando o mes da primeira data, Mes: " +formatador.format(this.getNovadata()));
    System.out.println("Mostrando o mes da segunda data, Mes: " +formatador.format(this.getComparadata()));
    }
    
    //Metodos para retornar ano
    public void ano(){
    SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
    System.out.println("Mostrando o ano da primeira data, Ano: " +formatador.format(this.getNovadata()));
    System.out.println("Mostrando o ano da segunda data, Ano: " +formatador.format(this.getComparadata()));
    }
    
    
    /*public void anobissexto() {
    SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
    int anobissexto = formatador.parse(novadata.ano());  
    }
    
     public Object clone() throws CloneNotSupportedException {
    return super.clone();
    
    }
    */
 
}

   
    

   
