nota = input("Digita as notas separadas por virgula: ").replace(" ", "").split(",")
falta = input("Digita as aulas e faltas separadas por virgula: ").replace(" ", "").split(",")

if (int(nota[0]) + int(nota[1])) / 2 >= 7 and (int(falta[0]) - int(falta[1])) * 100/ int(falta[0]) >= 75:
    print("Aprovado")
elif (int(nota[0]) + int(nota[1])) / 2 < 7 and (int(falta[0]) - int(falta[1])) * 100/ int(falta[0]) >= 75:
    print("Recurso")
elif (int(nota[0]) + int(nota[1])) / 2 >= 7 and (int(falta[0]) - int(falta[1])) * 100/ int(falta[0]) < 75:
    print("Recurso")
else:
    print("Reprovado")