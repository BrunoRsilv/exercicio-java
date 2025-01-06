package CalcularIMC;


public class Invoice {
   private int numeroitemfaturado;
   private String descricao;
   private int qtditem;
   private float precouni;
   private double valorfatura;

    public Invoice(int numeroitemfaturado, String descricao, int qtditem, float precouni) {
        this.numeroitemfaturado = numeroitemfaturado;
        this.descricao = descricao;
        if (qtditem < 0 ) {
        this.qtditem = 0; 
        } else {
        this.qtditem = qtditem;
        }
        if (precouni < 0) {
        this.precouni = 0.0f;
        } else {
        this.precouni = precouni;
        }
    }

    public int getNumeroitemfaturado() {
        return numeroitemfaturado;
    }

    public void setNumeroitemfaturado(int numeroitemfaturado) {
        this.numeroitemfaturado = numeroitemfaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtditem() {
        return qtditem;
    }

    public void setQtditem(int qtditem) {
        this.qtditem = qtditem;
    }

    public float getPrecouni() {
        return precouni;
    }

    public void setPrecouni(float precouni) {
        this.precouni = precouni;
    }
   
    public void getInvoiceAmount() {
    valorfatura = qtditem * precouni;
    System.out.println("Item faturado N: " +numeroitemfaturado);
    System.out.println("Descricao do item:  " +descricao);
    System.out.println("Qtd de itens:  " +qtditem);
    System.out.println("Preco unitario itens:  " +precouni);
    System.out.println("O valor da fatura " +valorfatura);
    
}
   
    
}
