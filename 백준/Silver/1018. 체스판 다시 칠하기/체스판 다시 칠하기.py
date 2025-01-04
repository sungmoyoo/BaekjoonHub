N, M = map(int, input().split())
board = [
  input()
  for _ in range(N)
  ]

def paint_count(x, y):
  repaint_w = 0  
  repaint_b = 0  
    
  for i in range(8):
    for j in range(8):
      color = board[x + i][y + j]

      if (i + j) % 2 == 0:
        if color != 'W':  
          repaint_w += 1
        if color != 'B':
          repaint_b += 1
      else:
        if color != 'B':
          repaint_w += 1
        if color != 'W':
          repaint_b += 1

  return min(repaint_w, repaint_b)

min_repaint = float('inf')


for i in range(N - 7):
  for j in range(M - 7):
    min_repaint = min(min_repaint, paint_count(i, j))

print(min_repaint)