import sys

N = int(sys.stdin.readline())

words = {
    sys.stdin.readline().strip()
    for _ in range(N)
    }

sorted_words = sorted(words, key= lambda x: (len(x), x))

for word in sorted_words:
    print(word)


