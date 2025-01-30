import sys
import math

N = int(sys.stdin.readline())
trees = [
  int(sys.stdin.readline())
  for _ in range(N)
]

distances = [
  trees[i+1] - trees[i]
  for i in range(N-1)  
]

gcd = distances[0]
for d in distances[1:]:
  gcd = math.gcd(gcd, d)

answer = sum((d // gcd) - 1 for d in distances)
print(answer)