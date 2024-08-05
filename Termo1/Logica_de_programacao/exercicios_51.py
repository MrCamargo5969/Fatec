import random
A = []

while len(A) < 10:
    num = random.randint(1, 50)
    if num not in A:
        A.append(num)

print(sorted(A))