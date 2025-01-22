import sys

N = int(sys.stdin.readline())
N_arr = list(map(int, sys.stdin.readline().strip().split()))

M = int(sys.stdin.readline())
M_arr = list(map(int, sys.stdin.readline().strip().split()))


ans_map = {value: 0 for value in M_arr}

for card in N_arr:
    if (card in ans_map):
        ans_map[card] += 1

result = [ans_map[value] for value in M_arr]

print(" ".join(map(str, result)))

