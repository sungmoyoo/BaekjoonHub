import sys

N = int(sys.stdin.readline())
N_arr = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
M_arr = list(map(int, sys.stdin.readline().split()))

#교집합 찾기
intersection_arr = set(N_arr) & set(M_arr)

# M 카드 딕셔너리 생성
card_check = {card: 0 for card in M_arr}

# 값 입력
for n in intersection_arr:
    card_check[n] = 1

# 리스트로 변환
answer = [card_check[x] for x in card_check]

# 출력
print(' '.join(map(str,answer)))