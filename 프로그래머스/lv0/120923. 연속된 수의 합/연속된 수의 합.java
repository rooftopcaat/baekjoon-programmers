class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // 출력값을 배열로 설정
        int first = ((2 * total / num) - num + 1) / 2;
        // 시작값 설정
        // 5/15의 경우 6 - 6 / 2 = 0 이 된다
        
        for (int i = 0; i < num; i++) {
            answer[i] = first;
            first++;
            // i가 ++ 증가하며 반복되어 배열에 입력된다.
            // 5 / 15의 경우 0부터 시작하여 1->2->3->4->5의 값이 배열로 나열된다.
        }
        return answer;
        //결과값 리턴
    }
}
