import sys
import math

def solution(lst):
  for i in range(2, int(math.sqrt(len(lst))) + 1):
    if lst[i]:
      for j in range(i*i, len(lst), i):
        lst[j] = False

  return lst

def partition(is_prime, n):
    count = 0
    for p in range(2, n // 2 + 1):
      if is_prime[p] and is_prime[n-p]:
        count += 1
    return count

max_N = 1000000
arr =[False, False] + [True] * (max_N + 1)

T = int(sys.stdin.readline())

prime_lst = solution(arr)

for i in range(T):
  N = int(sys.stdin.readline())

  print(partition(prime_lst, N))
