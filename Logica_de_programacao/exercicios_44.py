from random import randint
l = []
pares, impares = 0, 0
for i in range(10):
    l.append(randint(1,50))
for i in l:
    print(i, end=' ')
    if i % 2 == 0:
        pares += 1
    else:
        impares += 1
print(f"> Tem {pares} pares e {impares} impares na lista")