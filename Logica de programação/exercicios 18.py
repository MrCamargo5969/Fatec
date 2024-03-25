a = int(input("Idade do nadador -> "))
if 5 <= a <=7:
    print('Infantil A')
elif 8 <= a <=11:
    print('Infantil B')
elif 12 <= a <=13:
    print('Juvenil A')
elif 14 <= a <=17:
    print('Juvenil B')
elif a > 18:
    print('Adultos')
else:
    print('Não pode competir')