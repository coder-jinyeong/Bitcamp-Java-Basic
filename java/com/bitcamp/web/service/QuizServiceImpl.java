/**
 * packageName: com.bitcamp.web.service
 * fileNa     : QuizService
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

import java.util.Scanner;

public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력 : ");
        String s = "";
        for(int i = 0; i < arr.length; i++){
            s += i + " : " + arr[i] + "\t";
            if(( i + 1 ) % 5 == 0) s += "\n";
        }
        System.out.println(s + "\n");
    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2.  팀장이 맡은 과제만 출력 . 예시 ) 김진영 , 힙, 그래프");
        String zzang = "";
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i].equals("김진영")){

                for(int j = 0; j < 3; j++){
                    zzang += arr[i] + ",";
                    i += 5;
                }
            }
        }
        System.out.println(zzang + "\n");
    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력 예 ) 큐를 담당한 사람 : 권혜민");
        String qManager = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("큐")){
                for(int j = 0; j < 3 ;j++){
                    qManager += arr[i - (j * 5)] + ",";
                }
                qManager += "를 담당한 사람 : " + arr[i -15];
            }
        }
        System.out.println(qManager + "\n");
    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력 예 ) 권혜민(3개), 조현국(3개), 김진영(2개)," +
                "김한슬(2개)" + "서성민(2개)");
        int [] intArr = new int[5];
        int count = 0;
        String countManager = "";
        for(int i = 0; i < arr.length; i++){
            int a = i % 5 ;
            for(int j = 0; j < 5; j++){
                if(a == 0) intArr[a]++;
                else if (a == 1) intArr[a]++;
                else if (a == 2) intArr[a]++;
                else if (a == 3) intArr[a]++;
                else if (a == 4) intArr[a]++;
            }
        }
        for(int i = 0; i < 5; i++){
            count = (arr.length - (i + 1)) / 5;
            countManager += arr[i] + "(" + count + "개), ";
        }
        System.out.println(countManager + "\n");
    }


    @Override
    public void quiz5(String res, String[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(res))index = i % 5;
        }
        System.out.println("입력한 과제의 인덱스 : " + index);
    }
}


