import sys

N = int(sys.stdin.readline())

arr = list(map(int, str(N)))

sorted_arr = sorted(arr, reverse=True)

for n in sorted_arr:
    print(n, end="")
