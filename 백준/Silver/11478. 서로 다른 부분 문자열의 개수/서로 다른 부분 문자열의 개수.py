import sys

def count_substrings(s):
    substrings = set()

    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            substrings.add(s[i:j])
    
    return len(substrings)

S = sys.stdin.readline().strip()
print(count_substrings(S))