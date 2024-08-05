total = 0
while True:
    x = int(input('Digite um numero:\n-> '))
    if x != 0:
        total += x
        continue
    else:
        print(total)
        break