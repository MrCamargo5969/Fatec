import random
M = [[random.randint(1, 50) for coluna in range(5)] for linha in range(5)]

n = 0
N = []
L = []
for i in range(len(M)):
    for _, linha in enumerate(M):
        L.append(M[_][n])
    N.append(L)
    L = []
    n += 1

for i in M:
    print(i)
print()
for i in N:
    print(i)
