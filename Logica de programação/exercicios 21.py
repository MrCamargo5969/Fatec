ge = input("Digite o genero da pessoa: ").lower()
alt = input("Digite a altura da pessoa: ")

m = ["masculino", "homem"]
f = ["feminino", "mulher"]
h = float(alt)
if ge in m:
    p = (72.7 * h) - 58
    print(f"O peso ideal para essa {ge} é {p:0.2f}")
elif ge in f:
    p = (62.1 * h) - 44.7
    print(f"O peso ideal para essa {ge} é {p:0.2f}")