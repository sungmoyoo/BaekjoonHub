arr = [
  int(input())
  for _ in range(3)
]

if sum(arr) != 180:
    print("Error")
else:
  if arr.count(60) == 3:
      print("Equilateral")
  elif len(set(arr)) == 2:
      print("Isosceles")
  else:
      print("Scalene")
