def knapsack(c, w, v, n):
    k = [[0 for _ in range(c + 1)] for _ in range(n + 1)]
    itemList = [["" for _ in range(c + 1)] for _ in range(n + 1)]

    for i in range(n + 1):
        k[i][0] = 0
        itemList[i][0] = ""
    for j in range(c + 1):
        k[0][j] = 0
        itemList[0][j] = ""

    for i in range(1, n + 1):
        for j in range(1, c + 1):
            if w[i] > j:
                k[i][j] = k[i - 1][j]
                itemList[i][j] = itemList[i - 1][j]+" "
            else:
                k[i][j] = max(k[i - 1][j], k[i - 1][j - w[i]] + v[i])
                if k[i][j] == k[i - 1][j]:
                    itemList[i][j] = itemList[i - 1][j]+" "
                else:
                    itemList[i][j] = itemList[i - 1][j - w[i]] + str(i)+" "

    return itemList

c = 5
n = 4
w = [0, 2, 1, 3, 2]
v = [0, 12, 10, 20, 15]

print(knapsack(c, w, v, n))