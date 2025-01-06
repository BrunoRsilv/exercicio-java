
package CalcularIMC;


public class Alunos {
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float notatrabalho;
    private int media;

    public Alunos(int matricula, String nome, float nota1, float nota2, float notatrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notatrabalho = notatrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotatrabalho() {
        return notatrabalho;
    }

    public void setNotatrabalho(float notatrabalho) {
        this.notatrabalho = notatrabalho;
    }
    
    public void media (){
    media = (int) (((nota1 * 2.5) + (nota2 * 2.5) + (notatrabalho *2 )) / (2.5 + 2.5 + 2));
    System.out.println("A media foi de " + media+ " pontos");
    
    }
    
    public void mediafinal() {
    if (media < 7 ){
    System.out.println("Para o prova final, falta " +(7 - media )+ " pontos");
    } else {
    System.out.println("O aluno foi para prova final com a media: " +media);
    }
    
    }
    
}
