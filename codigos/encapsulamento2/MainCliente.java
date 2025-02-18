package encapsulamento2;

public class MainCliente {
    public static void main(String[] args) {
        
    
    cliente cliente1 = new cliente("cr7", 39, 12345678, "rua saldanha", 71456321);
    System.out.println(cliente1.toString());
    
    veiculo veiculo1 = new veiculo("rj321", "preto", 5, "300L", "280KM", "250L");
    System.out.println(veiculo1.toString());
}
}