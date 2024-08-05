from random import randint
total = []
for i in range(10):
    i = randint(1, 50)
    total.append(i)

user_choice = input('Deseja da forma [1]direta ou forma [2]reversa:\n-> ')
if user_choice == '1':
    for i in total:
        print(i, end=' ')
elif user_choice == '2':
    for i in range(len(total)-1, -1, -1):
        print(total[i], end=' ')
else:
    print('Opção inválida')
    
