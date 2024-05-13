A = []
while len(A) < 20:
    A.append(int(input('Digite um elemento para o vetor:\n->')))
print(f'Vetor A = {A}')

for i in range(10):
    A[i], A[10+i] = A[10+i], A[i]
print(f'Vetor A = {A}')