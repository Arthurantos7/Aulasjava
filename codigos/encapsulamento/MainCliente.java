package encapsulamento;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        
        cliente1.setNome("ui");
        cliente1.setEmail("ui@gmail.com");
        cliente1.setSenha(321);


        System.out.println("Nome: " + cliente1.getNome() );
        System.out.println("E-mail: " + cliente1.getEmail() );
        System.out.println("Senha: " + cliente1.getSenha() );

        Cliente cliente2 = new Cliente("lucas", "lucas@gmail.com", 123);
        System.out.println(cliente2.toString());

        Cliente cliente3 = new Cliente("paulo", "paulo@gmail.com", 543);
        System.out.println(cliente3.toString());
    }
}
