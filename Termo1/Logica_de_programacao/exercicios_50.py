import random
def main():
    lista = []
    for i in range(10):
        lista.append(random.randint(1, 50))
    bubbleSort(lista)
    print(lista)


def bubbleSort(lista):
    for _ in range(len(lista)-1,0,-1):
        for i in range(_):
            if lista[i]>lista[i+1]:
                x = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = x

if __name__ == "__main__":
    main()



