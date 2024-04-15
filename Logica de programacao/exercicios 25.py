numero = input('digite um numero: ')
contador = 0
if numero.isalpha():
    print('digite um numero!!!')

else:
    while contador != 11:
        print(f'{numero} x {contador} = {int(numero)*contador}')
        contador += 1