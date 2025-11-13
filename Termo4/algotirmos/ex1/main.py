from matrizMaker import matrizMaker

def main():
    G = matrizMaker(int(input("Digite o número de linhas da matriz: ")), 
    bool(int(input("Digite 1 para direcionado ou 0 para não direcionado: "))))

    edges = [(0,1), (1,2), (2,3), (3,4), (4,2),
            (2,5), (5,0), (0,6), (6,2), (3,0)]
    
    for u, v in edges:
        G.add_edge(u,v)

    print("Matriz inicial:")
    print(G, end="\n\n")

    n = int(input("Digite o vértice(n-1) para verificar vizinhos e grau: "))
    print(f"Vizinhos do vértice {n+1}:", G.neighbors(n))
    if G.get_directed():
        print(f"Grau de entrada do vértice {n+1}:", G.indegree(n))
        print(f"Grau de saida do vértice {n+1}:",(G.degree(n)), end="\n\n")
    else:
        print(f"Grau do vértice {n+1}:", G.degree(n), end="\n\n")

    v1 = int(input("Digite o primeiro vértice da aresta a ser verificada: "))
    v2 = int(input("Digite o segundo vértice da aresta a ser verificada: "))
    if G.has_edge(v1, v2):
        print(f"A aresta entre {v1} e {v2} existe.")
    else:
        print(f"A aresta entre {v1} e {v2} não existe.")

if __name__ == "__main__":
    main()