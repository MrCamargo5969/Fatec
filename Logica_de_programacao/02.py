try:
    numero = int(input('Digite um numero\n-> '))
    for num in range(1,11):
        print(f'{numero} x {num} = {numero * num}')

except ValueError:
    pass