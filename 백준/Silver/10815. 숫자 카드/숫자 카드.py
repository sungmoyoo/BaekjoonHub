import sys

N = int(sys.stdin.readline())
N_arr = set(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
M_arr = list(map(int, sys.stdin.readline().split()))

answer = [1 if x in N_arr else 0 for x in M_arr]

print(' '.join(map(str,answer)))