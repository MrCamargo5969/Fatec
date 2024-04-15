a = int(input("Primeiro ângulo -> "))
b = int(input("Segundo ângulo -> "))
c = int(input("Terceiro ângulo -> "))
s = a+b+c
if a+b+c == 180:
    if a == 90 or b == 90 or c == 90:
        print('Triângulo retângulo')
    elif a < 90 and b < 90 and c < 90:
        print('Triângulo acutângulo')
    elif a > 90 or b > 90 or c > 90:
        print('Triângulo obtuso')
else:
    print('Não é Triângulo')
