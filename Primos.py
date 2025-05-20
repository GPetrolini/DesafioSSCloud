def eh_primo(n):
    """Verifica se um número é primo"""
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def primos_recursivo(n, atual=2, resultado=None):
    """Encontra números primos até n usando recursão"""
    if not isinstance(n, int) or n < 2:
        raise ValueError("O número deve ser um inteiro maior que 1")
    
    if resultado is None:
        resultado = []
    
    if atual > n:
        return resultado
    
    if eh_primo(atual):
        resultado.append(atual)
    
    return primos_recursivo(n, atual + 1, resultado)

def primos_linear(n):
    """Encontra números primos até n usando iteração"""
    if not isinstance(n, int) or n < 2:
        raise ValueError("O número deve ser um inteiro maior que 1")
    
    return [i for i in range(2, n + 1) if eh_primo(i)]

# Testes
if __name__ == "__main__":
    numeros_teste = [2, 3, 10, 20]
    
    print("Usando função recursiva:")
    for num in numeros_teste:
        print(f"primos_recursivo({num}) = {primos_recursivo(num)}")
    
    print("\nUsando função linear:")
    for num in numeros_teste:
        print(f"primos_linear({num}) = {primos_linear(num)}")
