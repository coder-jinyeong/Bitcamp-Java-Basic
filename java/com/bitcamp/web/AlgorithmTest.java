/**
 * packageName: com.bitcamp.web
 * fileNa     : AlgorithmTest
 * au         : kimjinyeong
 * date       : 2022-01-27
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         kimjinyeong    최초 생성
 */

package com.bitcamp.web;

public class AlgorithmTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.print(solution.solution(scoville,K));
    }
}
