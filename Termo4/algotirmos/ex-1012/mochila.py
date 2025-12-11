import math
import sys

EPS = 1e-9

def ler_float(prompt=""):
    try:
        return float(input(prompt))
    except:
        print("Entrada inválida. Use número (ex.: 10 ou 10.5).")
        sys.exit(1)

def main():
    capacidade = ler_float("Digite a capacidade da mochila: ")
    n = int(ler_float("Digite o número de itens: "))

    pesos = []
    valores = []
    for i in range(1, n+1):
        p = ler_float(f"Peso do item {i}: ")
        v = ler_float(f"Valor do item {i}: ")
        pesos.append(p)
        valores.append(v)

    escala = 100
    pesos_int = [int(round(p * escala)) for p in pesos]
    capacidade_int = int(round(capacidade * escala))

    dp = [[0.0] * (capacidade_int + 1) for _ in range(n + 1)]

    for i in range(1, n+1):
        wi = pesos_int[i-1]
        vi = valores[i-1]
        for w in range(capacidade_int + 1):
            sem = dp[i-1][w]
            com = -1e300
            if wi <= w:
                com = vi + dp[i-1][w - wi]
            dp[i][w] = com if com > sem + EPS else sem

    valor_maximo = dp[n][capacidade_int]

    solucoes_indices = []

    def backtrack(i, w_rest, corrente):
        if i == 0:
            valor_corrente = sum(valores[idx] for idx in corrente)
            if abs(valor_corrente - valor_maximo) <= 1e-6:
                solucoes_indices.append(list(sorted(corrente)))
            return

        if abs(dp[i][w_rest] - dp[i-1][w_rest]) <= 1e-6:
            backtrack(i-1, w_rest, corrente)

        wi = pesos_int[i-1]
        vi = valores[i-1]
        if w_rest >= wi:
            if abs(dp[i][w_rest] - (vi + dp[i-1][w_rest - wi])) <= 1e-6:
                corrente.append(i-1)
                backtrack(i-1, w_rest - wi, corrente)
                corrente.pop()

    backtrack(n, capacidade_int, [])

    solucoes_unicas = []
    seen = set()
    for s in solucoes_indices:
        key = tuple(s)
        if key not in seen:
            seen.add(key)
            solucoes_unicas.append(s)

    print("\n===== RESULTADO =====")
    print(f"Valor máximo possível: {valor_maximo}")

    if not solucoes_unicas:
        print("Nenhuma solução encontrada (verifique entradas).")
        return

    print("\nSubconjuntos ótimos (itens são índices 1..n):\n")
    for sol in solucoes_unicas:
        itens_1based = [i+1 for i in sol]
        peso_total = sum(pesos[i] for i in sol)
        valor_total = sum(valores[i] for i in sol)
        print(f"Itens: {itens_1based}  |  Peso total: {peso_total}  |  Valor total: {valor_total}")

if __name__ == "__main__":
    main()
