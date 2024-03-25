a = int(input("Idade do nadador -> "))

v = range(5,8)
w = range(8,12)
x = range(12,14)
y = range(14,17)
z = range(17, 60)

if a in v:
    print('Infantil A')
elif a in w:
    print('Infantil B')
elif a in x:
    print('Juvenil A')
elif a in y:
    print('Juvenil B')
elif a in z:
    print('Adultos')
else:
    print('Não pode competir')