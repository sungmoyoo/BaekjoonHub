import sys

N = int(sys.stdin.readline())

arr = [
    int(sys.stdin.readline())
    for _ in range(N)
]

sorted_arr = sorted(arr)

for n in sorted_arr:
    print(n)
