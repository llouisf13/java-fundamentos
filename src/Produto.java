public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

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

        public String getNome(){
            return nome;
        }

        public int getCodigo(){
            return codigo;
        }

        public double getPreco(){
            return preco;
        }

        public int getQuantidade(){
            return quantidade;
        }

        
}
