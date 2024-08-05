M = []
total = 0
for i in range(2):
    M.append([])
    for j in range(3):
        x = int(input('Digite um numero -> '))
        total += x
        M[i].append(x)

print(M)
print(total)