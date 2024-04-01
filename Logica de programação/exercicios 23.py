x = input("Digite o primeiro numero -> ")
y = input("Digite o primeiro numero -> ")
op = input("Digite a operação -> ")

if x.isdigit() and y.isdigit():
    x = int(x)
    y = int(y)
    match op:
        case "+":
            r = x + y
            print(f"{x} + {y} = {r}")
        case "-":
            r = x - y
            print(f"{x} - {y} = {r}")
        case "*":
            r = x * y
            print(f"{x} * {y} = {r}")
        case "/":
            if y == 0:
                print("Não pode dividir por zero")
            else:
                r = x / y
                print(f"{x} / {y} = {r}")
else:
    print("Digite numeros")