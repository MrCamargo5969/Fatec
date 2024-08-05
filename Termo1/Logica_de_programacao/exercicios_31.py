conta = 0
while conta != 100:
    conta += 1
    if conta < 100:
        print(conta, end='-')
    else:
        print(conta, end='.\n')

for i in range(100, 0, -1):
    print(i)