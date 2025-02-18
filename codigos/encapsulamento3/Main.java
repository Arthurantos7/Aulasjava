package encapsulamento3;

import encapsulamento.Cliente;

public class Main {
   public static void main(String[] args) {
    
    Clientes cliente = new Clientes("hhh", "hhh@",
    new Endereco("rua A", 188, "Salvador"));
    System.out.println(cliente.toString());

    } 
}
