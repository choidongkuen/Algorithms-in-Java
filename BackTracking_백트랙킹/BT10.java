// 날짜 : 2022/09/29
// 문제 : 최소 점프 횟수
// 문제 설명 :
// 각 위치로부터의 '최대 점프 가능 거리를 의미하는 n개의 숫자가' 주어졌을 때, 첫 번째 위치로부터 n번째 위치에 도달하기 위해 필요한 최소 점프 횟수를 구하는 판단하는 프로그램을 작성해보세요.
// 여기서 최대 점프 가능 거리란 현재 위치로부터 추가적으로 나아갈 수 있는 '최대 칸의 수'를 의미하며, 점프는 앞으로만 가능합니다.
// 예를 들어 다음과 같이 n개의 숫자가 주어진 경우라면, 2번 점프하여 n번째 위치가 도달이 가능합니다.

// 입력 형식 :
// 첫 번째 줄에 n이 주어집니다.
// 두 번째 줄에는 n개의 숫자가 공백을 사이에 두고 주어집니다.
// 2 ≤ n ≤ 10
// 0 ≤ 주어지는 숫자 ≤ 4

// 입력 예시01:
// 5
// 2 3 1 1 4
// 출력 예시01:
// 2

// 입력 예시02:
// 5
// 2 1 1 0 4
// 출력 예시02:
// -1


package BackTracking_백트랙킹;

public class BT10 {
    public static final int MAX_N = 10; // 주어지는 숫자의 최대 갯수
    public static int MAX_NUMS = 4; // 1 ~ 4
    public static int n;

    public static int[] jumps = new int[MAX_N]; // n개의 숫자를 저장할 1차원 배열

    public static void main(String[] args) {


    }
}
