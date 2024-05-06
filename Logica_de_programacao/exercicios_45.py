from random import randint
pares = []
for i in range(20):
    if randint(1,50) % 2 == 0:
        pares.append(i)
    else:
        pass
total = 0
for i in pares:
    total += i
print(pares)
print(f'A média dos números pares é {total/len(pares):.2f}')

