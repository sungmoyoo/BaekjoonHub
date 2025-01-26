import sys

def divisor(a, b):
    while b != 0:
        a, b = b, a % b
    
    return a

def multiple(a, b):
    return (a * b) // divisor(a, b)

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(multiple(A, B))

