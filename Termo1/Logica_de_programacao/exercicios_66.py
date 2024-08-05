import random
M = [[random.randint(1, 50) for coluna in range(10)] for linha in range(10)]
print('Matriz gerada: ')
for linha in M:
    print(linha)
N = []
while True:
    x = int(input('Digite um numero entre 0 a 9:\n-> '))
    if 0 <= x < 10:
        N.append(M[x])
        print('Linha escolhida:', N)
        break
    else:
        continue
