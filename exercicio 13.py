while True:
    print("[1]Retangulo\n[2]Triangulo")
    op = input("Deseja a area de qual? ")
    if op.isdigit():
        if op == "1":
            b = input("Base: ")
            h = input("Altura: ")
            a = float(b) * float(h)
            print(f"Area do retangulo = {round(a)}\n")
            break
        elif op == "2":
            b = input("Base: ")
            h = input("Altura: ")
            a = (float(b) * float(h))/2
            print(f"Area do triangulo = {round(a)}\n")
            break
        else:
            print("Digite uma das opções mencionadas\n")
            continue
    else:
        print("Digite uma das opções mencionadas\n")
        continue