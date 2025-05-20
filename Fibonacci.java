public class Fibonacci {
    /**
     * Calcula o número de Fibonacci de forma recursiva
     * @param n Número maior ou igual a 0
     * @return Valor correspondente na sequência de Fibonacci
     * @throws IllegalArgumentException se o número for negativo
     */
    public static int fibonacciRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0");
        }
        
        if (n <= 1) {
            return n;
        }
        
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    /**
     * Calcula o número de Fibonacci de forma iterativa
     * @param n Número maior ou igual a 0
     * @return Valor correspondente na sequência de Fibonacci
     * @throws IllegalArgumentException se o número for negativo
     */
    public static int fibonacciLinear(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0");
        }
        
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        // Testando a função recursiva
        System.out.println("Usando função recursiva:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("fibonacciRecursivo(%d) = %d%n", i, fibonacciRecursivo(i));
        }
        
        System.out.println("\nUsando função linear:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("fibonacciLinear(%d) = %d%n", i, fibonacciLinear(i));
        }
    }
} 