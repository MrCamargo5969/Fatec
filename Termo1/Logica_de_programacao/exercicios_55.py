import random
num = 10
A = random.sample(range(1, 50), num)
B = random.sample(range(1, 50), num)
C = []

for i in range(num):
    if A[i] in B:
        C.append(A[i])
    else:
        pass
print(f'{sorted(A)}\n{sorted(B)}\n{sorted(C)}')
