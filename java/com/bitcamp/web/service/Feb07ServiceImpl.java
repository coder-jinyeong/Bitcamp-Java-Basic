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

package com.bitcamp.web.service;


import java.util.Random;
import java.util.Scanner;

public class Feb07ServiceImpl implements Feb07Service {

    @Override
    public void leapYear(Scanner scanner) {
        //윤년은 해당년도가 4로 나눈 나머지값이 0인것이다. (i%4==0)
        //그리고(and==>&&) 100으로 나눈 나머지값이 0인것은 윤년에서 제외되며(부정[default값 반대=!](i%100!=0)
        //또는(or==>||)400으로 나눈값은 윤년(i%400==0)
        System.out.println("연도를 입력해주세요!");
        int i=scanner.nextInt();
        String s;
        if((i%4==0 && i % 100 !=0) || i%400==0){
            s="윤년";
        }else
            s="평년";
        System.out.println(String.format("%d는 %s입니다.",i,s));
    }

    @Override
    public String numberGolf() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        String res = "";
        System.out.println("임의로 입력받은 숫자 맞추기");
        while(true) {
            System.out.print("예상 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            if (rand == num) {
                res = "정답입니다";
                return String.format(res);
            } else if (rand < num) {
                System.out.println("임의의 숫자가 더 작습니다.");
            } else if (rand > num) {
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
        int count=0;

        for(int i=2; i<=a; i++) {
            for(int j=2; j<=i; j++) {
                if(i%j ==0)  {
                    count ++;
                }
            }

            if(count==1) {
                System.out.print(i+" ");
            }
            count=0;
        }
    }

    @Override
    public void feb07() {
        int dice  = (int)(Math.random()*6)+1;
        // int dice 는 int random 한 값을 1~6 까지
        int dice1  = (int)(Math.random()*6)+1;
        System.out.println("첫번째 주사위 숫자 : "+ dice+ "\n두번째 주사위 숫자 : "  + dice1);
        int res = dice + dice1;
        System.out.println("주사위 두개를 더한값 : " + res);

    }

    @Override
    public void rps(Scanner scanner) {// 우선 if문을 사용할 수도 있었지만 경우의 수를 더 간결하게 코딩하기 위해서 switch문을 활용함.
        Random random = new Random(); // random 이라는 새로운 변수를 생성한다.
        int computer = random.nextInt(3); // computer라는 정수 타입의 변수를 random으로 할당한다. ( 이때 난수는 3)
        while (true){ // 반복문 while을 사용하여 가위,바위,보, 탈출이라는 메뉴를 출력한다.
            System.out.println("0.가위 1.바위 2.보 3.EXIT");
            int user = scanner.nextInt(); // 사용자라는 정수 타입의 변수를 scanner로 쓴다.
            String s = ""; // s라는 변수를 초기화 한다.
            if(user==3){ // 조건문 if를 사용하여 사욪아가 3일 경우 s는 종료하는 것을 의미한다.
                s = "종료합니다";
                return; // 종료는 반복이 필요없기 때문에 return을 썼다.
            }
            //0~2까지 랜덤으로 번호가 입력된다.
            switch (computer - user){ // 조건문 switch를 활용해 컴퓨터 - 사용자 라는 입력변수를 가정한다.
                case 2 : // 컴퓨터에서 사용자를 뺀 값이 2일때
                    s = " 이겼다~"; // 결과
                    break;
                case -1 :
                    s = "이겼다~";
                    break;
                case 1 :
                    s = "졌다...";
                case -2 :
                    s = "졌다...";
                case 0 :
                    s = "비겼음1";
                    break;
                default:    // 잘못 입력했을 때를 나타내기 위해 씀
                    s = "다시 입력해 주세요"; // 다시 입력하라는 결과
                    break;

                // 컴퓨터0(가위)/사용자1(바위)(win)=-1
                // 컴퓨터1(바위)/사용자2(보)(win)=-1
                // 컴퓨터2(보)/사용자0(가위)(win)=2

                // 컴퓨터0(가위)/사용자2(보)(lose)=-2
                // 컴퓨터1(바위)/사용자0(가위)(lose)=1
                // 컴퓨터2(보)/사용자1(바위)=1
            }
            System.out.println(s); // 출력하기 위해 만듬
        }
    }
}
