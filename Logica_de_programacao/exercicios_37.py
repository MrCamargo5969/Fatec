fibonacci = 0
anterior = 1
sequenciaFibonacci = []
num = int(input('Quantos numeros da série deseja?\n-> '))
for i in range(num):
    sequenciaFibonacci.append(fibonacci)
    print(fibonacci, end=' ')
    anterior, fibonacci = fibonacci, fibonacci + anterior