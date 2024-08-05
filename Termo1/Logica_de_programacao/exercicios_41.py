def main():
    cont = 0
    num = int(input('Digite um numero:\n-> '))
    if num < 2:
        print(f'{num} não é primo')
    else:
        for i in range(1, num + 1):
            if num % i == 0:
                cont += 1
        if cont == 2:
            print(f'{num} é primo')
        else:
            print(f'{num} não é primo')

if __name__ == "__main__":
    main()