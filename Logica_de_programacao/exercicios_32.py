import random

def main():
    while True:
        x = random.randint(1, 10)
        y = random.randint(1, 10)
        resultado = input(f'{x} * {y} = ')
        if resultado.isalpha():
            print('ERROU')
        else:
            if int(resultado) == x*y:
                print('ACERTOU')
            else:
                print('ERROU')
            if continuar() == True:
                continue
            else:
                break
        if continuar() == True:
            continue
        else:
            break

def continuar():
    desejo = input('Deseja continuar? [S/N] ')
    if desejo.upper() in ['S', 'SIM']:
        return True
    else:
        print('Até mais!')
        return False

if __name__ == '__main__':
    main()