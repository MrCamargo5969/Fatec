print("Qual a placa do carro? ")
placa = input("OBS: Digite os 7 digitos -> ")

if len(placa) == 7 and placa[6].isdigit():
    if placa[6] == 1 or placa[6] == 2:
        print(f"A placa de final {placa[6]} tem rodizio na Segunda-feira")
    elif placa[6] == 3 or placa[6] == 4:
        print(f"A placa de final {placa[6]} tem rodizio na Terça-feira")
    elif placa[6] == 5 or placa[6] == 6:
        print(f"A placa de final {placa[6]} tem rodizio na Quarta-feira")
    elif placa[6] == 7 or placa[6] == 8:
        print(f"A placa de final {placa[6]} tem rodizio na Quinta-feira")
    else:
        print(f"A placa de final {placa[6]} tem rodizio na Sexta-feira")
else:
    print("Caso especial")