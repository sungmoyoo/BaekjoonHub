n = int(input())
min_m = 0

for i in range(1, n + 1):
    calc_sum = i
    current_num = i
    
    # 각 자리수를 더하는 로ㄱ
    while current_num > 0:
        calc_sum += current_num % 10
        current_num //= 10  
    
    # 분해합이 N과 같다면 반복문 중단
    if calc_sum == n:
        min_m = i
        break

print(min_m)