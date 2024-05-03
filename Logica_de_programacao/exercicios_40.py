num = int(input('Digite um numero:\n-> '))
resultado = 1
for i in range(num):
    resultado = resultado * (i+1)
print(f'{num}! = {resultado}')