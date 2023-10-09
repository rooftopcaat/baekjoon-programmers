function solution(common) {
    
    const A = common[1] - common[0];
    const B = common[2] - common[1];
    
    let answer = 0;
    
    if (A === B) {
        // 동일할 경우 등차수열
        answer = common[common.length - 1] + A;
        // 마지막 항 + 1
    } else {
        // 등비수열
        answer = common[common.length - 1] * (B / A);
        // 마지막 항 * 등비
    }
    return answer;
}
