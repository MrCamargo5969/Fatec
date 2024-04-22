a = int(input("Informe um valor A -> "))
b = int(input("Informe um valor B -> "))
c = int(input("Informe um valor C -> "))
d = int(input("Informe um valor D -> "))

if b > c and d > a and c+d>a+b and c>0 and d>0 and a % 2 == 0:
    print("Valores aceitos")
else:
    print("Valores não aceitos")
