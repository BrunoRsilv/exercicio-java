
package CalcularIMC;

public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorlitro;
    private float qtdcombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorlitro, float qtdcombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorlitro = valorlitro;
        this.qtdcombustivel = qtdcombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String novocombustivel) {
        tipoCombustivel = novocombustivel;
    }

    public float getValorlitro() {
        return valorlitro;
    }

    public void setValorlitro(float valorlitro) {
        this.valorlitro = valorlitro;
    }

    public float getQtdcombustivel() {
        return qtdcombustivel;
    }

    public void setQtdcombustivel(float qtdcombustivel) {
        this.qtdcombustivel = qtdcombustivel;
    }

   public void setAbastecerValor (float valor){
   qtdcombustivel = valor / valorlitro;
   }
   
   public void setAbastecerLitro(float litros){
   qtdcombustivel = litros * valorlitro;    
   }
    
   public void setAlterarValor(float novopreco){
   valorlitro = novopreco;
   }
   
   public void setRetiradoBomba(float retiradobomba){
   qtdcombustivel = qtdcombustivel - retiradobomba;
   }
   
}
