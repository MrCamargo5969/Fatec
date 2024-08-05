from random import randint
a = []
b = []
for i in range(10):
    i = randint(1, 50)
    a.append(i)

user = int(input('Digite um numero:\n-> '))
for i in a:
    b.append(i * user)

print(f'Os numeros do vetor A:{a}\nOs numeros do vetor B:{b}')
