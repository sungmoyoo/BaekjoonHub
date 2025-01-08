N = 5
arr = [
    int(input())
    for _ in range(N)
]

sorted_arr = sorted(arr)

print(sum(arr)//5, sorted_arr[N//2])
