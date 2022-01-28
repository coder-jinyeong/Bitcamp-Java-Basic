/**
 * packageName: com.bitcamp.web.algorithm
 * fileNa     : AlgoController
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

package com.bitcamp.web.algorithm;

import com.bitcamp.web.calc.CalcDemo;

import java.util.Scanner;

public class AlgoController {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            Stack stack = new Stack();
            Queue queue = new Queue();
            while(true){
                System.out.println("[Menu] 0.exit\n" +
                        "[김아름] 1. stack \t" +
                        "2. queue \t" +
                        "3. heap \n" +
                        "[유재혁] 4. hash \t" +
                        "5. sort \n" +
                        "[장원종] 6. brute force \t" +
                        "7. dfs \t" +
                        "8. bfs \n" +
                        "[강민] 9. dp \t" +
                        "10. graph \n" +
                        "[최건일] 11. bin search \t" +
                        "12. greedy\n");
                switch (scanner.next()){
                    case "0": return;
                    case "1":
                        System.out.println(stack.solution(null)); break;
                    case "2":
                        System.out.println(queue.solution(0, 0, null)); break;
                    default:
                        System.out.println("Wrong Number");break;
                }
            }
        }
}
