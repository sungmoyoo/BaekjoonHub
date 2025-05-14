import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int[][] room;
  static final int NORTH = 0;
  static final int EAST = 1;
  static final int SOUTH = 2;
  static final int WEST = 3;

  static class Direction {
    int x;
    int y;

    public Direction(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    Direction current = new Direction(Integer.parseInt(st.nextToken()),
        Integer.parseInt(st.nextToken()));

    int head = Integer.parseInt(st.nextToken());

    room = new int[N][M];

    // 방 정보 입력
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        room[i][j] = Integer.parseInt(st.nextToken());
      }
    }


    int count = 0;

    // 청소기 작동
    while (true) {
      int x = current.getX();
      int y = current.getY();

      // 청소 로직
      if (room[x][y] == 0) {
        room[x][y] = -1;
        count++;
      }

      // 주변 4칸 청소되어 있는 경우
      if (isAllCleaned(current)) {
        Direction back = getBack(head, current);
        int backX = back.getX();
        int backY = back.getY();

        // 후진 조건 검사
        if (isValidPosition(backX, backY) && room[backX][backY] != 1) {
          current = back; 

        } else {
          break; // 종료

        }

      } else { // 빈칸이 존재하는 경우
        head = (head + 3) % 4;

        Direction front = getFront(head, current);
        int frontX = front.getX();
        int frontY = front.getY();
        
        // 전진 조건 검사
        if (isValidPosition(frontX, frontY) && room[frontX][frontY] == 0) {
          current = front;
          
        }
      }
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }

  // 후진용 좌표 반환 메서드
  private static Direction getBack(int head, Direction current) {
    if (head == NORTH) {
      return new Direction(current.getX() + 1, current.getY());
    } else if (head == EAST) {
      return new Direction(current.getX(), current.getY() - 1);
    } else if (head == SOUTH) {
      return new Direction(current.getX() - 1, current.getY());
    } else {
      return new Direction(current.getX(), current.getY() + 1);
    }
  }

  // 전진용 좌표 반환 메서드
  private static Direction getFront(int head, Direction current) {
    if (head == NORTH) {
      return new Direction(current.getX() - 1, current.getY());
    } else if (head == EAST) {
      return new Direction(current.getX(), current.getY() + 1);
    } else if (head == SOUTH) {
      return new Direction(current.getX() + 1, current.getY());
    } else {
      return new Direction(current.getX(), current.getY() - 1);
    }
  }

  // 범위 유효성 검사 메서드
  private static boolean isValidPosition(int x, int y) {
    return x >= 0 && x < room.length && y >= 0 && y < room[0].length;
  }

  // 동서남북 빈칸 여부 확인 메서드
  private static boolean isAllCleaned(Direction current) {
    int x = current.getX();
    int y = current.getY();

    boolean left = isValidPosition(x-1, y) && room[x-1][y] == 0;
    boolean right = isValidPosition(x+1, y) && room[x+1][y] == 0;
    boolean up = isValidPosition(x, y-1) && room[x][y-1] == 0;
    boolean down = isValidPosition(x, y+1) && room[x][y+1] == 0;

    return !(left || right || up || down);
  }
}