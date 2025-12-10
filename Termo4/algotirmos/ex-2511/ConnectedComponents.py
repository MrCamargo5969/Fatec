from matrizMaker import matrizMaker

class ConnectedComponents:
    def __init__(self, grafo: matrizMaker):
        self.grafo = grafo
        self.quantidade_vertices = grafo.get_n()

    def dfs(self, vertice, visitado):
        visitado[vertice] = True
        for vizinho in self.grafo.neighbors(vertice):
            if not visitado[vizinho]:
                self.dfs(vizinho, visitado)
    
    def calcular_componentes(self):
        visitado = [False] * self.quantidade_vertices
        componentes = 0

        for vertice in range(self.quantidade_vertices):
            if not visitado[vertice]:
                self.dfs(vertice, visitado)
                componentes += 1
        
        return componentes

    def _dfs_articulacoes(self, u, visitado, disc, low, parent, articulacoes, tempo):
        visitado[u] = True
        disc[u] = tempo[0]
        low[u] = tempo[0]
        tempo[0] += 1
        filhos = 0

        for v in self.grafo.neighbors(u):
            if not visitado[v]:
                parent[v] = u
                filhos += 1
                self._dfs_articulacoes(v, visitado, disc, low, parent, articulacoes, tempo)

                low[u] = min(low[u], low[v])

                # Regra 1: raiz com 2+ filhos
                if parent[u] is None and filhos > 1:
                    articulacoes.add(u)

                # Regra 2: não raiz e low[v] >= disc[u]
                if parent[u] is not None and low[v] >= disc[u]:
                    articulacoes.add(u)

            elif v != parent[u]:
                # Atualiza low (back-edge)
                low[u] = min(low[u], disc[v])

    def calcular_articulacoes(self):
        visitado = [False] * self.quantidade_vertices
        disc = [float('inf')] * self.quantidade_vertices
        low = [float('inf')] * self.quantidade_vertices
        parent = [None] * self.quantidade_vertices
        tempo = [0]
        articulacoes = set()

        for u in range(self.quantidade_vertices):
            if not visitado[u]:
                self._dfs_articulacoes(u, visitado, disc, low, parent, articulacoes, tempo)

        return sorted(list(articulacoes))