el = 450
p1 = input("peso dessa pessoa: ")
p2 = input("peso dessa pessoa: ")
p3 = input("peso dessa pessoa: ")
p4 = input("peso dessa pessoa: ")
p5 = input("peso dessa pessoa: ")

p = int(p1) + int(p2) + int(p3) + int(p4) + int(p5)

if p <= el:
    print("Elevador liberado, SUBINDO!!!")
else:
    print("Elevador bloqueado, EMAGREÇAM!!!")