import random
M = []
for i in range(10):
    M.append([])
    total = 0
    len = 0
    for j in range(10):
        x = random.randint(1, 50)
        total += x
        len += 1
        M[i].append(x)
    print(total)

for i in M:
    print(i)