class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            //boolean함수를 통해 매개변수 n에 3이 카운트될 때마다 ++
            answer++; // 기본적으로 증가하는 경우
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                    answer++; // 9같이 특수한 경우
                }
            }
        }
        return answer;
    }
}


