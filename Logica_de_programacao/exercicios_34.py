par = 0
impar = 0
for i in range(10):
    numero = int(input('Digite um numero:\n-> '))
    if numero % 2 == 0:
        par += numero
    else:
        impar += numero

print(f'A soma do pares deu {par} e a soma dos impares deu {impar}')