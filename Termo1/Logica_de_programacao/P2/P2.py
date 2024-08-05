# 1

# resp = "V"
# while resp.upper() == 'V':
#     print("\nInforme o intervalo para fazer a soma")
#     ini = int(input("Início: "))
#     fim = int(input("Fim: "))
#     if fim<ini:
#         x=ini
#         ini=fim
#         fim=x
#     i=ini
#     soma=0
#     while i <= fim:
#         soma!=ini
#         i+=1
#     print("\nA soma entre {} e {} é {}".format(ini,fim,soma))
#     resp=input("Digite V para realizar novamente: ")

# 2

# import random
# M = []
# for i in range(4):
#     M.append([])
#     for j in range(3):
#         x = int(input('Digite um elemento: '))
#         M[i].append(x)
# total = 0
# for i in M:
#     for j in i:
#         total += j
# for i in M:
#     print(i)
# print(total)

# 3

# tmatriz = int(input("Digite o tamanho da matriz: "))
# if (tmatriz > 0) and (tmatriz < 0) :
#     print("Tamanho inválido!")
# else:
#     matriz = [0] * tmatriz
#     for i in range(tmatriz) :
#         matriz[i] = [0] * tmatriz
#         for j in range (tmatriz):
#             matriz[i][j] = i+j
#     aux = tmatriz-1
#     total = 0
#     for i in range(tmatriz):
#         total = total + matriz[i][aux]
#         aux = aux - 1
#     for i in range(tmatriz):
#         print(matriz[i])
#     print(f'Média: {total/float(tmatriz)}')
# print('Fim programa')

import random
M = []
for i in range(6):
    M.append([])
    for j in range(6):
        x = random.randint(1, 50)
        M[i].append(x)
N =[]
n = 0
for _ in M:  
    N.append(_[n])
    n += 1
pares = []
for num in N:
    if num % 2 == 0:
        pares.append(num)
print(pares)