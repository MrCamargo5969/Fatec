fibs = {}

def fib(n):
    if n <= 1:
        return n
    if n in fibs:
        return fibs[n]
    fibs[n] = fib(n-1) + fib(n-2)
    print(f"fib({n}) = {fibs[n]}")
    return fibs[n]

def main():
    n = int(input("Digite o valor de n: "))
    resultado = fib(n)
    print(f"O resultado de fibonati em {n} é: {resultado}")

if __name__ == "__main__":
    main()