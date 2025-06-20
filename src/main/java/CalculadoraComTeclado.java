import java.util.Scanner;

public class CalculadoraComTeclado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Calculadora Simples ===");
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0); // Lê o primeiro caractere
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado;
            
            switch (operador) {
                case '+' -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '-' -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '*' -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero!");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                }
                default -> System.out.println("Operador inválido. Use +, -, * ou /.");
            }
        }
    }
}
