import sys

N, M = map(int, sys.stdin.readline().split())

pokemon_list = [
    sys.stdin.readline().strip()
    for _ in range(N)
]

# key가 이름이고 value가 도감번호인 딕셔너리
pokemon_map = {name: index + 1 for index, name in enumerate(pokemon_list)}

# key가 도감번호이고 value가 이름인 딕셔너리
pokemon_reversed = {index + 1: name for index, name in enumerate(pokemon_list)}

question = [
    sys.stdin.readline().strip()
    for _ in range(M)
]

# key만 사용해 정답 출력
for k in question:
    if k.isdigit():
        print(pokemon_reversed.get(int(k)))
    else:
        print(pokemon_map.get(k))


