from graph import Graph
from mst_algoritms import MSTAlgorithms
import random

def gerar_grafo_aleatorio(num_vertices: int, num_arestas: int, peso_min=1, peso_max=20):
    g = Graph()
    verts = list(range(num_vertices))

    # --- Garantir conectividade: criar uma árvore aleatória base ---
    ordem = verts[:]
    random.shuffle(ordem)

    for i in range(1, len(ordem)):
        u = ordem[i - 1]
        v = ordem[i]
        w = random.randint(peso_min, peso_max)
        g.add_edge(u, v, w)

    # --- Adicionar arestas extras aleatórias ---
    arestas_existentes = set()
    for u, v, _ in g.edges():
        arestas_existentes.add((min(u, v), max(u, v)))

    while len(arestas_existentes) < num_arestas:
        u = random.choice(verts)
        v = random.choice(verts)
        if u == v:
            continue
        a = (min(u, v), max(u, v))
        if a in arestas_existentes:
            continue
        arestas_existentes.add(a)
        g.add_edge(u, v, random.randint(peso_min, peso_max))

    return g


def comparar(g: Graph):
    kr_edges, kr_cost = MSTAlgorithms.kruskal(g)
    pr_edges, pr_cost = MSTAlgorithms.prim(g)

    fmt = lambda seq: [f"{u}-{v}({w})" for u, v, w in seq]

    print("\n--- KRUSKAL ---")
    print("Arestas:", fmt(kr_edges))
    print("Custo total:", kr_cost)

    print("\n--- PRIM ---")
    print("Arestas:", fmt(pr_edges))
    print("Custo total:", pr_cost)


if __name__ == "__main__":
    random.seed()  # usa entropia real

    NUM_VERTICES = 10
    NUM_ARESTAS = 18  # deve ser >= N-1

    print("Gerando grafo aleatório...")
    g = gerar_grafo_aleatorio(NUM_VERTICES, NUM_ARESTAS)

    comparar(g)
