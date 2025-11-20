def multi(x, y):
    if y == 0:
        return 0
    else:
        return x + multi(x, y-1)

def main():
    x = int(input("Digite o valor de x: "))
    y = int(input("Digite o valor de y: "))
    resultado = multi(x, y)
    print(f"O resultado de {x} multiplicado por {y} é: {resultado}")

if __name__ == "__main__":
    main()