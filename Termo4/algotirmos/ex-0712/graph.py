from typing import Dict, Set, Tuple, List

Edge = Tuple[int, int, float]

class Graph:
    def __init__(self):
        self.adj: Dict[int, List[Tuple[int, float]]] = {}
    
    def add_edge(self, u: int, v: int, weight: float):
        if u == v:
            return
        self.adj.setdefault(u, {})
        self.adj.setdefault(v, {})
        self.adj[u][v] = min(self.adj[u].get(v, float('inf')), weight)
        self.adj[v][u] = min(self.adj[v].get(u, float('inf')), weight)

    def nodes(self) -> Set[int]:
        return set(self.adj.keys())
    
    def edges(self) -> List[Edge]:
        edge_list = []
        seen = set()
        for u, neighbors in self.adj.items():
            for v, weight in neighbors.items():
                if (v, u) not in seen:
                    edge_list.append((u, v, weight))
                    seen.add((u, v))
        return edge_list