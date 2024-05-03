def main():
    num = int(input('Digite um numero:\n-> '))
    if num ** 0.5 != type(float):
        print(f'O numero {num} é um quadrado perfeito')
    else:
        print(f'O numero {num} não é um quadrado perfeito')

if __name__ == "__main__":
    main()