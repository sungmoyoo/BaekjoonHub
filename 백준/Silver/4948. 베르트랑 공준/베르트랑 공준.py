import sys
import math

def solution(lst ,n):
  for i in range(2, int(math.sqrt(n)) + 1):
    if lst[i]:
      for j in range(i*i, n+1, i):
        lst[j] = False

  return [i for i in range(n//2 + 1, n + 1) if lst[i]]

while (True):
  N2 = int(sys.stdin.readline()) * 2
  
  if N2 == 0:
    break

  arr = [True] * (N2 + 1)
  arr[0] = arr[1] = False

  answer_lst = solution(arr, N2)

  print(len(answer_lst))
