import sys

N = int(sys.stdin.readline())

points = []

for i in range(N):
    x, y = map(int, sys.stdin.readline().split())
    points.append((y,x))

sorted_points = sorted(points)

for i in range(N):
    print(sorted_points[i][1], sorted_points[i][0])