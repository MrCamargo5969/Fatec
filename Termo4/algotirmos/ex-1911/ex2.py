def exp(x, y):
    if y == 0:
        return 1
    else:
        return x * exp(x, y-1)

def main():
    x = int(input("Digite o valor de x: "))
    y = int(input("Digite o valor de y: "))
    resultado = exp(x, y)
    print(f"O resultado de {x} elevado a {y} é: {resultado}")

if __name__ == "__main__":
    main()