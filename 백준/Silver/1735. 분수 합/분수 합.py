import sys
import math

def sum_fraction(a1, b1, a2, b2):
  son = (a1 * b2) + (a2 * b1)
  mom = b1 * b2

  return solution(son, mom)

def solution(a, b):
  gcd = math.gcd(a, b)
  if gcd != 1:
    a, b = a // gcd, b // gcd

  return a, b


A1, B1 = map(int, sys.stdin.readline().split())
A2, B2 = map(int, sys.stdin.readline().split())

answer1, answer2 = sum_fraction(A1, B1, A2, B2)
print(answer1, answer2)
