import heapq
from typing import List, Tuple
from graph import Graph, Edge
from disjoint_set import DisjointSet

class MSTAlgorithms:

    @staticmethod
    def kruskal(graph: Graph) -> Tuple[List[Edge], float]:
        edges = sorted(graph.edges(), key=lambda e: e[2])
        ds = DisjointSet(graph.nodes())
        mst = []
        total = 0.0

        for u, v, w in edges:
            if ds.union(u, v):
                mst.append((u, v, w))
                total += w
                if len(mst) == len(graph.nodes()) - 1:
                    break

        return mst, total

    @staticmethod
    def prim(graph: Graph, start=None) -> Tuple[List[Edge], float]:
        nodes = list(graph.nodes())
        if not nodes:
            return [], 0.0

        start = nodes[0] if start is None else start
        visited = {start}
        heap = []

        for v, w in graph.adj[start].items():
            heapq.heappush(heap, (w, start, v))

        mst = []
        total = 0.0

        while heap and len(visited) < len(nodes):
            w, u, v = heapq.heappop(heap)
            if v in visited:
                continue

            visited.add(v)
            mst.append((u, v, w))
            total += w

            for nbr, wt in graph.adj[v].items():
                if nbr not in visited:
                    heapq.heappush(heap, (wt, v, nbr))

        return mst, total
