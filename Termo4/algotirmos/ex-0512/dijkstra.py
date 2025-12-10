import heapq

class Graph:
    def __init__(self, adj):
        self.adj = adj
        self.n = len(adj)

    def dijkstra(self, start, goal):
        dist = [float('inf')] * self.n
        pai = [-1] * self.n
        dist[start] = 0
        fila = [(0, start)]

        while fila:
            d, u = heapq.heappop(fila)
            if d > dist[u]:
                continue
            if u == goal:
                break
            for v, weight in self.adj[u]:
                nd = d + weight
                if nd < dist[v]:
                    dist[v] = nd
                    pai[v] = u
                    heapq.heappush(fila, (nd, v))
        
        path = []
        x = goal
        while x != -1:
            path.append(x)
            x = pai[x]
        path.reverse()

        return dist[goal], path