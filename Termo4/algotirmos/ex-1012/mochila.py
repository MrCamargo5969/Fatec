import random

def melhor_subconjunto(items, capacidade_float, scale=100):
    capacidade = int(round(capacidade_float * scale))

    for it in items:
        it['peso_int'] = int(round(it['peso'] * scale))

    n = len(items)
    dp = [[0] * (capacidade + 1) for _ in range(n + 1)]

    for i in range(1, n + 1):
        peso_i = items[i-1]['peso_int']
        valor = items[i-1]['valor']

        for w in range(capacidade + 1):
            if peso_i <= w:
                dp[i][w] = max(dp[i-1][w], valor + dp[i-1][w - peso_i])
            else:
                dp[i][w] = dp[i-1][w]

    w = capacidade
    subset = []
    for i in range(n, 0, -1):
        if dp[i][w] != dp[i-1][w]:
            subset.append(items[i-1])
            w -= items[i-1]['peso_int']

    return list(reversed(subset)), dp[n][capacidade]


def main():
    M = float(input("digite a capacidade da mochila: "))
    n = int(input("digite o numero de itens: "))

    items = []
    for i in range(n):
        peso = round(random.uniform(1, 10), 2)
        valor = round(random.uniform(10, 100), 2)
        items.append({'peso': peso, 'valor': valor})

    melhor, valor_total = melhor_subconjunto(items, M, scale=100)
    peso_total = sum(item['peso'] for item in melhor)

    print(f"\nItens gerados:")
    for item in items:
        print(item)

    print("\nMelhor subconjunto encontrado:")
    for item in melhor:
        print(item)

    print(f"\nValor Total: {valor_total}")
    print(f"Peso Total: {round(peso_total, 2)} / Capacidade: {M}")

if __name__ == "__main__":
    main()
