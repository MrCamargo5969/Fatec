def remove_ocorrencia(L, N):
    if not L:
        return []
    elif L[0] == N:
        return remove_ocorrencia(L[1:], N)
    return [L[0]] + remove_ocorrencia(L[1:], N)

L = [1, 2, 3, 2, 4, 2, 5, 2, 4, 5, 2, 4, 2, 5]
print(remove_ocorrencia(L, 2))