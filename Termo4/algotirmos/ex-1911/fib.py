def fib(n):
    if n <= 1:
        return n
    else:
        return fib(n-1) + fib(n-2)

def main():
    n = int(input("Digite o valor de n: "))
    resultado = fib(n)
    print(f"O resultado de fibonati em {n} é: {resultado}")

if __name__ == "__main__":
    main()