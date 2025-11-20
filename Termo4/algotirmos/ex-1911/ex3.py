def som(n):
    if n == 0:
        return 0
    else:
        return n + som(n-1)

def main():
    n = int(input("Digite o valor de n: "))
    resultado = som(n)
    print(f"O resultado de somatoria {n} é: {resultado}")

if __name__ == "__main__":
    main()