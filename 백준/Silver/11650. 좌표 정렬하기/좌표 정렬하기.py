import sys

N = int(sys.stdin.readline())

points = []

for i in range(N):
    x, y = map(int, sys.stdin.readline().split())
    points.append((x,y))

sorted_points = sorted(points)

for i in range(N):
    print(sorted_points[i][0], sorted_points[i][1])