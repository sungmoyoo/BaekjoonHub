n, m = map(int, input().split())
arr = list(map(int, input().split()))

max_sum = 0

for i in range(n):
  for j in range(i+1, n):
    for k in range(j+1, n):
      current_sum = arr[i] + arr[j] + arr[k]
      if (current_sum <= m):
        max_sum = max(current_sum, max_sum)

print(max_sum)

