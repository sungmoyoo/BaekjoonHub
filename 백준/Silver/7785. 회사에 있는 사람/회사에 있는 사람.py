import sys

N = int(sys.stdin.readline())

company = set([])

for i in range(N):
    name, action = sys.stdin.readline().split()

    if action == "enter":
        company.add(name)
    else:
        company.remove(name)

sorted_list = sorted(company, reverse=True)

for employee in sorted_list:
    print(employee)

