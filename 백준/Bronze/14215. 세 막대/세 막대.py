sides = list(map(int, input().split()))

sides.sort()

while True:
  if sides[0] + sides[1] > sides[2]:
    break

  sides[2] -= 1


print(sides[0]+ sides[1] + sides[2])
