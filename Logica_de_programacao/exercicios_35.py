import random

lista = []
for i in range(20):
    num = random.randint(1, 100)
    lista.append(num)
maior = sorted(lista)
print(maior[19])