class Solution {
    public int[] solution(int money) {
        int[] AhAh = new int[2];
        
        AhAh [0] = money / 5500;
        AhAh [1] = money % 5500;   
        
        return AhAh;
    }
}