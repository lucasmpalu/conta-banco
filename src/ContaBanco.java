import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    
    public static void main(String[] args) throws Exception {
                                            //hay que exportar locale también, 
                                            //solo cambia que en los double te hace usar . en vez de , para separar, como en EEUU
      Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Limpa o buffer antes de ler o nome completo
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
