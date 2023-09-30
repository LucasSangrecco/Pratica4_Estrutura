package Questao2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main extends Dados {

    public Main(String nome, String telefone, String email) {
        super(nome, telefone, email);
    }

    public static void main(String[] args) {
        Deque<Dados> dados = new ArrayDeque<>();
        Scanner ler = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.println("Entre com o nome: ");
            String nome = ler.nextLine();
            System.out.println("Entre com o telefone: ");
            String telefone = ler.nextLine();
            System.out.println("Entre com o e-mail: ");
            String email = ler.nextLine();
            Dados usuario = new Dados(nome, telefone, email);
            dados.add(usuario);
        }

        System.out.println("\nOrdem correta: ");

        for (Iterator i = dados.iterator(); i.hasNext();){
            System.out.println(i.next().toString() + " ");
        }

        System.out.println("\nOrdem inversa: ");

        for (Iterator i = dados.descendingIterator(); i.hasNext();){
            System.out.println(i.next().toString() + " ");
        }
    }
}
