public class Vestuario extends Item{

    public int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.tamanho = tamanho;
    }

    public Vestuario() {

    }

    public void mostraInfo(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(estoque);
        System.out.println(tamanho);
    }


    public void tamanho(int size) {
    }
}
