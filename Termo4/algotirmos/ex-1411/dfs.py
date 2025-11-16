class dfs():
    def __init__(self, graph):
        self.graph = graph
        self.visited = set()
        self.ordem_visita = []

    def run(self, start_vertex):
        print(f"Iniciando DFS pelo vértice:{start_vertex}")
        self._dfs_util(start_vertex)
        print(f"Vizinhos:{self.ordem_visita}")

    def _dfs_util(self, vertex):
        self.visited.add(vertex)
        self.ordem_visita.append(vertex)
        print(f"Visitando vértice: {vertex}")

        for neighbor in self.graph.neighbors(vertex):
            if neighbor not in self.visited:
                print(f"Indo para o vizinho: {neighbor}")
                self._dfs_util(neighbor)
            else:
                print(f"Vértice {neighbor} já visitado.")