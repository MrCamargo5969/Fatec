import random
M = []
menor = 50
for i in range(10):
    M.append([])
    for j in range(10):
        x = random.randint(1, 50)
        M[i].append(x)

menores_colunas = []
for j in range(len(M)):
    menor_coluna = M[0][j]
    for i in range(len(M)):
        if M[i][j] < menor_coluna:
            menor_coluna = M[i][j]
    menores_colunas.append(menor_coluna)

for i in M:
    print(i)
print()
print(menores_colunas)

