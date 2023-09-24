class Solution {
    public int solution(String A, String B) {
        
        int answer;
        String copy = A;
        // String A의 카피본을 딴다

        for (answer = 0; answer < A.length(); answer++) {
            // answer를 0으로 바꾼 다음 문자열 A길이 정수값에 도달할 때까지 반복된다
            if (copy.equals(B)) {
                return answer;
            // 만약 카피값과 B가 처음부터 일치할경우 초기화 answer값인 0을 반환한다
            }

            String a = copy.substring(copy.length() - 1);
            // 문자열 a 변수에 복사된 String A(문자열길이 - 1만큼의 정수값) substring을 통해 자른다
            // 그러면 맨 끝자리의 글자만 남은 채로 나머지는 잘려나간다
            copy = a + copy.substring(0, copy.length() - 1);
            // 그렇게 잘려져 저장된 String a는 회전을 위해 시작 인덱스 0부터 문자열값-1까지의 문자열 앞에 붙여진다
        }

        return -1; // A의 뒷 문자를 계속 밀어도 B가 되지 않는다면 -1 리턴
    }
}

