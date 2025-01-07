N = int(input())
arr = [
    int(input())
    for _ in range(N)
]

sorted = False

while not sorted:
  sorted = True
  for i in range(N-1):
    if arr[i] > arr[i + 1]:
      arr[i], arr[i + 1] = arr[i + 1], arr[i]
      sorted = False

for i in range(N):
  print(arr[i])