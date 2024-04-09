import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {

        //declaración de variables
        String nombreCliente = "Lionel Messi";
        String tipoDeCuenta = "Corriente";
        String menu = """
                *** Indica la operación deseada ***
                1 - Consultar saldo
                2 - Retirar efectivo
                3 - Depositar
                0 - Salir
                """;
        double saldo = 2000;
        int operacion = 1;

        //Mensajes y datos del cliente
        System.out.println("***********************");
        System.out.println("\nHola " + nombreCliente + ", Bienvenido!");
        System.out.println("\nTú tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Tú saldo actual es de: $" + saldo);
        System.out.println("\n¿Qué operación querés hacer?");


        Scanner teclado = new Scanner(System.in);
        while (operacion != 0){
            System.out.println(menu);
            operacion = teclado.nextInt();

            switch (operacion){
                case 1:
                    System.out.println("El saldo actual es de: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Qué valor desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo Insuficiente");
                        System.out.println("El saldo actual es de: $" + saldo);
                        System.out.println("\n");
                    }else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actual es de: $" + saldo);
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("¿Qué monto desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                        saldo += valorADepositar;
                        System.out.println("El saldo actual es de: $" + saldo);
                        System.out.println("\n");
                    break;
                case 4:
                    double salirMenu = teclado.nextDouble();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
                }
            }
                System.out.println("Saliendo del menú");
                System.out.println("¡Que tenga buen día!");
        }
    }