import random
num = int(input('Digite um numero\n-> '))
A = random.sample(range(1, 50), 10)
for i in A:
    if num == i:
        print(f'O numero {num} esta na lista')
    else:
        print(f'O numero {num} nao esta na lista')