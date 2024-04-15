while True:
    print("Digite os lados do triangulo")
    a = int(input("Informe um valor -> "))
    b = int(input("Informe um valor -> "))
    c = int(input("Informe um valor -> "))

    if a<b+c and c<b+a and b<a+c:
        if a == b == c:
            print("Triangulo Equilatero")
            break
        elif a == b or a == c or c == b:
            print("Triangulo isóscele")
            break
        elif a != b and a != c and c != b:
            print("Triangulo Escaleno")
            break
    else:
        continue