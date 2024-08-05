from random import randint
cincos = []
total = []
for i in range(20):
    i = randint(1, 50)
    total.append(i)
for i in total:
    if i % 5 == 0:
        cincos.append(i)
    else:
        pass

print(f'Os números sorteados são {total}')
print(f'Os números mutiplos de cinco são {cincos}')