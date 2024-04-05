import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Tarefa EBAC sobre Wrapers");

        int idade = 12;
        Integer idade2 = idade;
        System.out.println(idade2);

        int identidade = 123564526;
        double identiade1 = identidade;
        System.out.println(identiade1);

        Scanner cr = new Scanner(System.in);
        System.out.println("Qual o seu CR na Faculdade?");
        float cr1 = cr.nextFloat();
        Float cr2 =  cr1;

        System.out.println("O seu CR na faculdade é: "+ cr2);
    }
}