
class bfs:
    def __init__(self, graph):
        self.graph = graph
        self.neighbors = set()
        self.row = []
        self.ordem_visita = []

    def run(self, start):

        self.neighbors.add(start)
        self.row.append(start)
        self.ordem_visita.append(start)

        while self.row:
            current = self.row.pop(0)
            print("---------------------------------------------------")
            print(f"Visitando vértice: {current}")

            for neighbor in self.graph.neighbors(current):
                if neighbor not in self.neighbors:
                    print(f"Adicionando vizinho: {neighbor}")
                    self.neighbors.add(neighbor)
                    self.row.append(neighbor)
                    self.ordem_visita.append(neighbor)
                else:
                    print(f"Vértice {neighbor} já visitado.")
            print()
            print(f"Fila atual: {self.row}")
            print(f"Visitados: {self.ordem_visita}")
        
        print("---------------------------------------------------")
        print("Busca concluída.")