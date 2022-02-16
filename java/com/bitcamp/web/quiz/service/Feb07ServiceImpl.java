/**
 * packageName: com.bitcamp.web.service
 * fileNa     : Feb07ServiceImpl
 * au         : kimjinyeong
 * date       : 2022-02-07
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         kimjinyeong    최초 생성
 */

package com.bitcamp.web.quiz.service;


import java.util.Random;
import java.util.Scanner;

public class Feb07ServiceImpl implements Feb07Service {

    @Override
    public void leapYear(Scanner scanner) {
        //윤년은 해당년도가 4로 나눈 나머지값이 0인것이다. (i%4==0)
        //그리고(and==>&&) 100으로 나눈 나머지값이 0인것은 윤년에서 제외되며(부정[default값 반대=!](i%100!=0)
        //또는(or==>||)400으로 나눈값은 윤년(i%400==0)
        System.out.println("연도를 입력해주세요!");
        int i = scanner.nextInt();
        String s;
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            s = "윤년";
        } else
            s = "평년";
        System.out.println(String.format("%d는 %s입니다.", i, s));
    }

    @Override
    public String numberGolf() {
        Scanner scanner = new Scanner(System.in);
        int rand = (int)(Math.random()*100) + 1;
        String res = "";
        System.out.println("임의로 입력받은 숫자 맞추기");
        while (true) {
            System.out.print("예상 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            if (rand == num) {
                res = "정답입니다";
                return String.format(res);
            } else if (rand < num) {
                System.out.println("임의의 숫자가 더 작습니다.");
            } else{
                System.out.println("임의의 숫자가 더 큽니다.");
            }
        }

    }

    @Override
    public void primeNumber(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        int a;
        System.out.print("수 입력 : ");
        a = scanner1.nextInt();
        int count = 0;

        for (int i = 2; i <= a; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }

    @Override
    public void feb07() {
        Random random = new Random();
        double d = Math.random();
        int player = (int) (d * 6) + 1;
        System.out.println("플레이어 숫자 : " + player);
        int com = random.nextInt(5) + 1;
        System.out.println("컴퓨터 숫자 : " + com);
        String s = "Draw";
        if (player != com) s = (player > com) ? "Win." : "Lose.";
        System.out.println(s);

    }

    @Override
    public void rps(Scanner scanner) {
        int a = (int) (Math.random() * 3) + 1;
        int b = (int) (Math.random() * 3) + 1;
        System.out.println((a == b) ? "Draw" : (b > (a + 1) % 3) ? "Win" : "lose");
    }
}

