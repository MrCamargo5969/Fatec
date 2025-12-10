def troco(valor, moedas= [1, 5, 10, 25, 50, 100]):
    resultado = {}
    for moeda in moedas:
        quantidade = valor // moeda
        if quantidade > 0:
            resultado[moeda] = quantidade
            valor = valor % moeda
    
    return resultado

valor = float(input("Digite o valor do troco (em reais): "))
valor_centavos = int(round(valor * 100))
troco_resultado = troco(valor_centavos)

for moeda, quantidade in troco_resultado.items():
    print(f"{quantidade} moeda(s) de {moeda}")