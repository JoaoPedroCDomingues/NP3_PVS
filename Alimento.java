public class Alimento extends Item {

    public String validade;


    public Alimento (String nome; double preco; int estoque; String validade;){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.validade = validade;
    };

    public void mostraInfo(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(estoque);
        System.out.println(validade);
    }

    public void validade(String vali) {
    }
}