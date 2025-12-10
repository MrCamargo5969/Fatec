N =  abs(int(input("Digite um número inteiro: ")))

def numero_perfeito(n, i=1, soma=0):
    if i == n:
        return soma == n
    if n % i == 0:
        soma += i
    return numero_perfeito(n, i + 1, soma)

print(f"O número {N} é perfeito? {numero_perfeito(N)}")