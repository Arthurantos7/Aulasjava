package encapsulamento2;

public class veiculo {
    
    private String Placa;
    private String cor;
    private int NumeroPassageiro;
    private String Capacidadetanque ;
    private String VelocidadeMaxima ;
    private String ConsumoMaximo ;
    
    
    
    public veiculo() {
    }



    public veiculo(String placa, String cor, int numeroPassageiro, String capacidadetanque, String velocidadeMaxima,
            String consumoMaximo) {
        Placa = placa;
        this.cor = cor;
        NumeroPassageiro = numeroPassageiro;
        Capacidadetanque = capacidadetanque;
        VelocidadeMaxima = velocidadeMaxima;
        ConsumoMaximo = consumoMaximo;
    }



    public String getPlaca() {
        return Placa;
    }



    public void setPlaca(String placa) {
        Placa = placa;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public int getNumeroPassageiro() {
        return NumeroPassageiro;
    }



    public void setNumeroPassageiro(int numeroPassageiro) {
        NumeroPassageiro = numeroPassageiro;
    }



    public String getCapacidadetanque() {
        return Capacidadetanque;
    }



    public void setCapacidadetanque(String capacidadetanque) {
        Capacidadetanque = capacidadetanque;
    }



    public String getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }



    public void setVelocidadeMaxima(String velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }



    public String getConsumoMaximo() {
        return ConsumoMaximo;
    }



    public void setConsumoMaximo(String consumoMaximo) {
        ConsumoMaximo = consumoMaximo;
    }



    @Override
    public String toString() {
        return "veiculo [Placa=" + Placa + ", cor=" + cor + ", NumeroPassageiro=" + NumeroPassageiro
                + ", Capacidadetanque=" + Capacidadetanque + ", VelocidadeMaxima=" + VelocidadeMaxima
                + ", ConsumoMaximo=" + ConsumoMaximo + "]";
    }


    
}

