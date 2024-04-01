vogal = ["a", "e", "i", "o", "u"]

while True:
    enter = input("Digite uma letra: ")
    if enter.isalpha():
        if enter.lower() in vogal:
            print(f"{enter} é uma vogal")
            break
        else:
            print(f"{enter} não é uma vogal")
            continue
    else:
        print("Digite uma letra")
        continue