n1 = int(input("Digite o primeiro: "))
n2 = int(input("Digite o segundo: "))
n3 = int(input("Digite o terceiro: "))

d = {n1:"primeiro", n2:"segundo", n3:"terceiro"}
l = [n1, n2, n3]

for n in l:
    if n % 2 == 0:
        print(f"O numero {d[n]} é par")
    else:
        print(f"O numero {d[n]} é impar")
