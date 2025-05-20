def fibonacci_recursivo(n):
    """Calcula o número de Fibonacci de forma recursiva"""
    if not isinstance(n, int) or n < 0:
        raise ValueError("O número deve ser um inteiro maior ou igual a 0")
    
    if n <= 1:
        return n
    
    return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2)

def fibonacci_linear(n):
    """Calcula o número de Fibonacci de forma iterativa"""
    if not isinstance(n, int) or n < 0:
        raise ValueError("O número deve ser um inteiro maior ou igual a 0")
    
    if n <= 1:
        return n
    
    a, b = 0, 1
    for _ in range(2, n + 1):
        a, b = b, a + b
    return b

# Testes
if __name__ == "__main__":
    print("Usando função recursiva:")
    for i in range(7):
        print(f"fibonacci_recursivo({i}) = {fibonacci_recursivo(i)}")
    
    print("\nUsando função linear:")
    for i in range(7):
        print(f"fibonacci_linear({i}) = {fibonacci_linear(i)}")
