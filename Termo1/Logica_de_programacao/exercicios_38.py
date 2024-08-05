def main():
    while True:
        total = 0
        print('Indique dois numeros')
        n1 = int(input('Primeiro numero: '))
        n2 = int(input('Segundo numero: '))

        if n1 > n2:
            pass
        else:
            for i, e in enumerate(range(n1, n2+1)):
                total += e
            print(f'A soma dos numeros entre {n1} e {n2} é {total}')
        if continua() == True:
            continue
        else:
            break

def continua():
    userWanted = input('Deseja continuar?\n [S] [N]\n-> ')
    if userWanted.upper() == 'S':
        return True
    else:
        print('Até mais!')
        return False

if __name__ == '__main__':
    main()
