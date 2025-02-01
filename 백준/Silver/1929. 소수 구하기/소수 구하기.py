import sys
import math

def solution(lst, m ,n):
  for i in range(2, int(math.sqrt(N)) + 1):
    if lst[i]:
      for j in range(i*i, n+1, i):
        lst[j] = False

  # M부터 N까지의 범위의 인덱스를 
  # 소수인 경우만 배열에 넣어 리턴
  return [i for i in range(m, n + 1) if lst[i]]

M, N = map(int, sys.stdin.readline().split())

#0과 1을 제외한 N까지의 배열을 True로 초기화
arr = [True] * (N + 1)
arr[0] = arr[1] = False

answer_lst = solution(arr, M, N)

for x in answer_lst:
  print(x)
