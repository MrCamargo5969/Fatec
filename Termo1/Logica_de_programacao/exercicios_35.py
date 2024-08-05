import random
# lista = []
# for i in range(20):
#     num = random.randint(1, 100)
#     lista.append(num)
#     print(num, end=' ')
# maior = sorted(lista)
# print(f'\nO maior numero é {maior[19]}')


maior = 0
for i in range(20):
    num = random.randint(1, 100)
    print(num)
    if num > maior:
        maior = num
print(f'o maior numero é {maior}')