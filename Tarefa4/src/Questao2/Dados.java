package Questao2;

public class Dados {
    String nome, telefone, email;

    public Dados (String nome, String telefone, String email) {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email;
    }
}
