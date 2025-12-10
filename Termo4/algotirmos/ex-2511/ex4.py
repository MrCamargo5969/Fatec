from matrizMaker import matrizMaker
from ConnectedComponents import ConnectedComponents

def main():
    G = matrizMaker(7, directed=False, default_value=0)
    edges = [(0,1), (1,2), (2,3), (1,4), (4,5), (5,6)]
    for u, v in edges:
        G.add_edge(u, v)
    
    cc = ConnectedComponents(G)
    num_components = cc.calcular_componentes()
    print(f"Número de componentes conectados: {num_components}")
    articulacoes = cc.calcular_articulacoes()
    print(f"Vértices de articulação: {articulacoes}")

if __name__ == "__main__":
    main()