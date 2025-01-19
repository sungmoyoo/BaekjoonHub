import sys

N, M = map(int, sys.stdin.readline().split())

N_arr = set([
    sys.stdin.readline()
    for _ in range(N)
    ])

M_arr = [
    sys.stdin.readline()
    for _ in range(M)
    ]

answer = [
    1 if x in N_arr else 0 
    for x in M_arr
]

print(answer.count(1))

