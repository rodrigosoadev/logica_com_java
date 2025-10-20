package Condicional;

//
public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Rodrigo";
        byte idade = 20;

        if (idade < 11) {
            System.out.println("O participante " + nome + "participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("O participante " + nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("O participante " + nome + " participará da categoria Pré-adulto");
        } else if (idade >= 20) {
            System.out.println("O participante " + nome + " participará da categoria Adulto");
        }
    }
}
