import sys
import math

def is_prime(x):
  if x < 2:
    return False

  if x == 2 or x == 3:
    return True

  # 약수 대칭 활용, 제곱근까지만 반복
  for i in range(2, int(math.sqrt(x) + 1)):
    if x % i == 0:
      return False
  
  return True

N = int(sys.stdin.readline())

for i in range(N):
  t = int(sys.stdin.readline())

  while (is_prime(t) != True):
    t += 1

  print(t)
