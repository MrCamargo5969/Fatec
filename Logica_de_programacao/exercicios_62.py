import random
M = [[random.randint(1, 50) for coluna in range(5)] for linha in range(5)]
# for linha in range(5):
#     M.append([])
#     for coluna in range(5):
#         x = random.randint(1, 50)
#         M[linha].append(x)

N = [M[i][i] for i in range(len(M))]
O = [M[i][(len(M)-1)-i] for i in range(len(M))]
# for _ in M:
#     N.append(_[n])
#     n += 1
# for _ in M:
#     O.append(_[len(_)-n-1])
#     n += 1

for i in M:
    print(i)
print()
print(f'Diagonal principal: {N}')
print(f'Diagonal Secundaria: {O}')