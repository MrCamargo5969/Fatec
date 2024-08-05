while True:
    print('Exibir nova tabuada[1] ou Encerrar[2]: ')
    dec = input('->')
    if dec == '1':
        numero = input('digite um numero: ')
        contador = 0
        if numero.isdigit():
            while contador != 11:
                if contador == 10:
                    print(f'{numero} x {contador} = {int(numero)*contador}\n')
                    contador += 1
                else:
                    print(f'{numero} x {contador} = {int(numero)*contador}')
                    contador += 1
        else:
            continue
    else:
        break