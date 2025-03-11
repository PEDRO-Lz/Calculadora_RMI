import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
            Interface obj = (Interface) Naming.lookup("rmi://127.0.0.1/Incrementa");
            Scanner scanner = new Scanner(System.in);
            int escolha;

            do {
                System.out.println("Escolha uma operação:");
                System.out.println("1. Incrementar até 10");
                System.out.println("2. Zerar valor no servidor");
                System.out.println("3. Somar dois valores");
                System.out.println("4. Obter valor da soma");
                System.out.println("5. Enviar mensagem 'Hello World'");
                System.out.println("0. Sair");

                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Iniciando incrementos até 10...");
                        obj.reset();
                        while (obj.get() < 10) {
                            System.out.println("Incrementando: " + obj.inc());
                        }
                        System.out.println("Incremento concluído!");
                        break;

                    case 2:
                        obj.reset();
                        System.out.println("Valor zerado no servidor.");
                        break;

                    case 3:
                        System.out.print("Digite o primeiro valor: ");
                        int a = scanner.nextInt();
                        System.out.print("Digite o segundo valor: ");
                        int b = scanner.nextInt();
                        obj.soma(a, b);
                        System.out.println("Soma realizada no servidor.");
                        break;

                    case 4:
                        int resultado = obj.getSoma();
                        System.out.println("Valor da soma no servidor: " + resultado);
                        break;

                    case 5:
                        obj.printMessage("Hello World");
                        System.out.println("Mensagem 'Hello World' enviada ao servidor.");
                        break;

                    case 0:
                        System.out.println("Encerrando cliente...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

                System.out.println();
            } while (escolha != 0);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro no Cliente: " + e);
        }
    }
}
