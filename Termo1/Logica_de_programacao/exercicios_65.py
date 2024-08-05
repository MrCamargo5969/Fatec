import random
tamanho_A = int(input('Digite o tamanho da coluna: '))
tamanho_B = int(input('Digite o tamanho da linha: '))
M = [[random.randint(1, 50) for coluna in range(tamanho_A)] for linha in range(tamanho_B)]

print("Matriz M:")
for linha in M:
    print(linha)

if tamanho_A != tamanho_B:
    print("A matriz não é quadrada, portanto não pode ser simétrica.")
else:
    simetrica = True
    for i in range(tamanho_A):
        for j in range(tamanho_A):
            if M[i][j] != M[j][i]:
                simetrica = False
                break
        if not simetrica:
            break
    if simetrica:
        print("A Matriz é Simétrica")
    else:
        print("A Matriz não é Simétrica")