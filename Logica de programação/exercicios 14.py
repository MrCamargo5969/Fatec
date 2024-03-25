a = int(input("Informe um valor -> "))
f1 = range(0, 10)
f2 = range(10,20)

if a<0:
    print("Numero negativo")
elif a in f1:
    print("Numero menor que 10 e maior que 0")
elif a in f2:
    print("Numero menor que 20 e maior que 10")
else:
    print("Numero maior que 20")