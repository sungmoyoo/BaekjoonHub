import sys

# Xi > Xj 를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 함
# 가장 작은 값의 X'i는 0, 두번째로 큰 값은 1, 세번째로 큰 값은 2... N번째는 N-1이 된다.
# => 중복없이 정렬했을 때 인덱스 값이 곧 X'i값.

N = int(sys.stdin.readline())

X = list(map(int, sys.stdin.readline().split()))

sorted_X = sorted(set(X))

#리스트를 순회하면서, 각 요소의 값을 키로 하고, 인덱스를 값으로 하는 딕셔너리를 생성
compress_map = {value: index for index, value in enumerate(sorted_X)}

# 리스트 컴프리헨션으로 압축된 새 좌표 생성(시간복잡도 O(N))
compress_X = [compress_map[x] for x in X] 

print(' '.join(map(str, compress_X)))
