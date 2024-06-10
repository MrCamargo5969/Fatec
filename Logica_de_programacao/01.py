total = 0
while True:
    try:
        numero = int(input('Digite um numero\n-> '))
        if numero == 0:
            break
        else:
            total += numero
    except ValueError:
        pass

print(f'A soma dos numero digitados é {total}')

