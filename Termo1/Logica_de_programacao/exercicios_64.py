import random
import sys
tamanho_A = int(input('Digite o tamanho da matriz A: '))
tamanho_B = int(input('Digite o tamanho da matriz B: '))
A = [[random.randint(1, 50) for coluna in range(tamanho_A)] for linha in range(tamanho_A)]
B = [[random.randint(1, 50) for coluna in range(tamanho_B)] for linha in range(tamanho_B)]

if len(A) != len(B) or len(A[0]) != len(B[0]):
    sys.exit('As matrizes não podem ser somadas')
else:
    C = [[A[i][j] + B[i][j] for j in range(len(A))] for i in range(len(A))]

for item in A:
    print(item)
print()
for item in B:
    print(item)
print()
for item in C:
    print(item)