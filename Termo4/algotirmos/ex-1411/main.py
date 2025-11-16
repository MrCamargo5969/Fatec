from bfs import bfs as BFS
from dfs import dfs as DFS
from matrizMaker import matrizMaker

def main():
    G = matrizMaker(int(input("Digite o número de linhas da matriz: ")), 
    bool(int(input("Digite 1 para direcionado ou 0 para não direcionado: "))))

    edges = [(0,1), (0,2), (1,3), (1,4), (2,5), (2,6)]
    
    for u, v in edges:
        G.add_edge(u,v)

    print("Matriz inicial:")
    print(G, end="\n\n")

    G.mostrar_lista_adjacencia()
    print()

    # bfs = BFS(G)
    # start_vertex = int(input("Digite o vértice inicial para BFS: "))
    # bfs.run(start_vertex)

    dfs = DFS(G)
    start_vertex = int(input("Digite o vértice inicial para DFS: "))
    dfs.run(start_vertex)

if __name__ == "__main__":
    main()