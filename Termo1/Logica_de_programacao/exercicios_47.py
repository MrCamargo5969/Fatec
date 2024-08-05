from random import randint
total = []
multi = []
x = int(input('Digite um numero:\n-> '))
for i in range(20):
    i = randint(1, 50)
    total.append(i)
for i in total:
    if i % x == 0:
        multi.append(i)
    else:
        pass

print(f'Os números sorteados são {total}')
print(f'Os números mutiplos de cinco são {multi}')