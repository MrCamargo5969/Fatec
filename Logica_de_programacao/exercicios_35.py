import random
lista = []
for i in range(20):
    num = random.randint(1, 100)
    lista.append(num)
    print(num)
maior = sorted(lista)
print(f'o maior numero é {maior[19]}')