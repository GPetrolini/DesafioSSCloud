import java.util.ArrayList;
import java.util.List;

public class Primos {
    /**
     * Verifica se um número é primo
     */
    private static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Encontra números primos até n usando recursão
     */
    public static List<Integer> primosRecursivo(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O número deve ser maior que 1");
        }
        return primosRecursivoAux(n, 2, new ArrayList<>());
    }

    private static List<Integer> primosRecursivoAux(int n, int atual, List<Integer> resultado) {
        if (atual > n) {
            return resultado;
        }
        
        if (ehPrimo(atual)) {
            resultado.add(atual);
        }
        
        return primosRecursivoAux(n, atual + 1, resultado);
    }

    /**
     * Encontra números primos até n usando iteração
     */
    public static List<Integer> primosLinear(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O número deve ser maior que 1");
        }
        
        List<Integer> resultado = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] numerosTeste = {2, 3, 10, 20};
        
        System.out.println("Usando função recursiva:");
        for (int num : numerosTeste) {
            System.out.printf("primosRecursivo(%d) = %s%n", num, primosRecursivo(num));
        }
        
        System.out.println("\nUsando função linear:");
        for (int num : numerosTeste) {
            System.out.printf("primosLinear(%d) = %s%n", num, primosLinear(num));
        }
    }
} 