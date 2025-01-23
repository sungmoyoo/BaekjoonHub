import sys

N, M = map(int, sys.stdin.readline().split())

N_list = set([
    sys.stdin.readline().strip()
    for _ in range(N)
])

M_list = set([
    sys.stdin.readline().strip()
    for _ in range(M)
])

answer_list = sorted(N_list & M_list)

print(len(answer_list))
for answer in answer_list:
    print(answer)