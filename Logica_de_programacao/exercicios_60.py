import random
M = []
for i in range(10):
    M.append([])
    menor = 50
    for j in range(10):
        x = random.randint(1, 50)
        M[i].append(x)
        if x < menor:
            menor = x
    print(menor)

for i in M:
    print(i)