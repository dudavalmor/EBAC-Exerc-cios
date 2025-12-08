import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Olá, digite a sua idade: ");
        int idade = leia.nextInt();

        System.out.println("Agora, digite o seu nome: ");
        String nome = leia.next();

        System.out.println("Por último, a sua altura: ");
        double altura = leia.nextDouble();

        leia.close();
        System.out.println("A sua idade é: " + idade);
        System.out.println("O dobro da sua idade é: " + idade*2);
        System.out.println("Seu nome é " + nome + ", a sua idade é " + idade + " e a sua altura é " + altura);
    }
}
