N = abs(int(input("Digite um número inteiro: ")))

def primeiro_digito(numero):
    if numero < 10:
        return numero
    return primeiro_digito(numero // 10)

print(f"O valor absoluto é: {primeiro_digito(N)}")
