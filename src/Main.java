public class Main {

    public static void main(String[] args) {
        System.out.println("Controle de Estoque");

        Produto p1 = new Produto(5555, "Macarrao", 3.50, 100);
        
        p1.exibirDados();

       System.out.println(p1.getNome());
       System.out.println(p1.getCodigo());
        
    }
}

