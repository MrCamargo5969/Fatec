import random
M = []
total = 0
len = 0
for i in range(10):
    M.append([])
    for j in range(10):
        x = random.randint(1, 50)
        total += x
        len += 1
        M[i].append(x)

print(M)
print(total/len)