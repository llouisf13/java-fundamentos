public class Produto {
    int codigo;
    String nome;
    double preco;
    int quantidade;

    public Produto(int codigo, String nome, double preco, int quantidade){
        //construtor
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
        public void exibirDados() {
            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade: " + quantidade);
        }

        
}
