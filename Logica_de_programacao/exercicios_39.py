validos = []
for i in range(1000,10000):
    if (i%100 + i//100) **2 == i:
        validos.append(i)
    else:
        pass
print(validos)