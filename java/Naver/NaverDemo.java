/**
 * packageName: Naver
 * fileNa     : NaverDemo
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter variable :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package Naver;

import java.util.Scanner;

public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(NaverApp.Title);
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        String result = naverApp.naver(id, pw);
        System.out.println(result);
    }
}
