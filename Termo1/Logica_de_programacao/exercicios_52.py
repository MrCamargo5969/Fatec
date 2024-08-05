import random
A = random.sample(range(1, 50), 10)
B = []
C = []
for i in A:
    if i % 2 == 0:
        B.append(i)
    else:
        C.append(i)
print(sorted(A))
print(sorted(B))
print(sorted(C))
