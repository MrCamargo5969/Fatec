l = input("Digite uma letra: ").lower()
l1 = ["a", "b", "c", "d", "e", 
      "f", "g", "h", "i", "j", 
      "k", "l", "m", "n", "o", 
      "p", "q", "r", "s", "t", 
      "u", "v", "w", "x", "y", 
      "z", "ç"]
if l in l1:
    print(f"A posição dessa letra é {l1.index(l)+1}")
else:
    print("Digite uma letra: ")