import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Alimento validade = new Alimento();
        Alimento func = new Alimento();
        Vestuario tam = new Vestuario();

        String vali;
        int size;
        int opc;
        int opc2;

        vali = scanner.nextLine();
        size = scanner.nextInt();

        func.validade(vali);
        tam.tamanho(size);

        System.out.println("Bem vindo ao Mercadinho! O que deseja fazer? ");
        System.out.println("1- Adicionar um produto ao carrinho ");
        System.out.println("2- Aplicar um desconto ");
        System.out.println("3- Verificar o carrinho ");
        System.out.println("4- Finalizar a compra ");
        opc = scanner.nextInt();
        do {
            if(opc == 1){
                System.out.println("É um item padrao(1), um alimento(2) ou uma peca de roupa(3)? ");
                opc2 = scanner.nextInt();
                if(opc2 == 1){
                    System.out.println("Insira o nome, o preco e a quantidade em estoque: ");
                    String nome = scanner.nextLine();
                    int preco = scanner.nextInt();
                    int quantidade = scanner.nextInt();
                }
                if(opc2 == 2){
                    System.out.println("Insira o nome, o preco, a quantidade em estoque e sua validade: ");
                    String nome = scanner.nextLine();
                    int preco = scanner.nextInt();
                    int quantidade = scanner.nextInt();
                    String validade = scanner.nextLine();
                }
                if(opc2 == 3){
                    System.out.println("Insira o nome, o preco, a quantidade em estoque e seu tamanho: ");
                    String nome = scanner.nextLine();
                    int preco = scanner.nextInt();
                    int quantidade = scanner.nextInt();
                    int tamanho = scanner.nextInt();
                }
                }



            }while(opc != 4);




        }
    }
