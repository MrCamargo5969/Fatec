print("[1]Volume da lata \n[2]Volume da caixa")
x = input("Calcular volume de Lata ou Caixa? ")
if x == "1":
    R = input("Raio da lata: ")
    A = input("Altura da lata: ")
    V = 3.14159 * int(R) ** 2 * int(A)
    print(f"Volume da Lata = {round(V)}")
elif x == "2":
    h = input("Altura da caixa: ")
    l = input("Largura da caixa: ")
    c = input("Comprimento da caixa: ")
    V = int(h) * int(l) * int(c)
    print(f"Volume da Caixa = {round(V)}")
else:
    print("Digite uma das opções mencionadas")