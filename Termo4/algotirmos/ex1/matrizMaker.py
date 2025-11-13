class matrizMaker:
    def __init__(self, n, directed=False, default_value=0):
        self.n = n
        self.directed = directed
        self.default_value = default_value
        self.matriz = self.criar_matriz()

    def get_n(self):
        return self.n

    def get_directed(self):
        return self.directed

    def criar_matriz(self):
        return [[self.default_value for _ in range(self.n)] for _ in range(self.n)]

    def add_edge(self, u, v, weight=1):
        if not (0 <= u < self.n and 0 <= v < self.n):
            raise IndexError("vértice fora do intervalo")
        self.matriz[u][v] = weight
        if not self.directed:
            self.matriz[v][u] = weight

    def remove_edge(self, u, v):
        if not (0 <= u < self.n and 0 <= v < self.n):
            raise IndexError("vértice fora do intervalo")
        self.matriz[u][v] = self.default_value
        if not self.directed:
            self.matriz[v][u] = self.default_value

    def has_edge(self, u, v):
        return self.matriz[u][v] != self.default_value
    
    def neighbors(self, u):
        return [v for v in range(self.n) if self.matriz[u][v] != self.default_value]
    
    def degree(self, u):
        return sum(1 for v in range(self.n) if self.matriz[u][v] != self.default_value)

    def indegree(self, u):
        if not self.directed:
            return self.degree(u)
        return sum(1 for v in range(self.n) if self.matriz[v][u] != self.default_value)

    def __str__(self):
        return "\n".join(" ".join(str(x) for x in row) for row in self.matriz)
