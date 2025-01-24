import sys

N, M = map(int, sys.stdin.readline().split())

A = set(list(map(int, sys.stdin.readline().split())))
B = set(list(map(int, sys.stdin.readline().split())))

answer_list = (A - B) | (B - A)

print(len(answer_list))