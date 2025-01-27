import sys

def divisor(a, b):
    while b != 0:
        a, b = b, a % b
    
    return a

def multiple(a, b):
    return (a * b) // divisor(a, b)

A, B = map(int, sys.stdin.readline().split())
print(multiple(A, B))

