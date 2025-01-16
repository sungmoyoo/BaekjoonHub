import sys

N = int(sys.stdin.readline())

accounts = []

for i in range(N):
    age, name = sys.stdin.readline().split()
    accounts.append((int(age), name))

sorted_accounts = sorted(accounts, key = lambda x:x[0])

for account in sorted_accounts:
    print(account[0], account[1])