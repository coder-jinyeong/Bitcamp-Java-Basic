/**
 * packageName: com.bitcamp.web.quiz.service
 * fileNa     : Feb10ServiceImpl
 * au         : kimjinyeong
 * date       : 2022-02-10
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         kimjinyeong    최초 생성
 */

package com.bitcamp.web.quiz.service;


import java.util.Random;

public class Feb10ServiceImpl implements Feb10Service{
    Random random = new Random();
    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public String rectangleStarPrint() {
        String res = "";
        int rand = random.nextInt(50);
        System.out.println("좌측90도 직각삼각형 별찍기");
        System.out.println("삼각형의 길이 랜덤으로 생성한 값 : " + rand);
        for(int i = 0; i < rand; i ++){
            for(int j = 0; j <= i; j++){
                res += String.format("*");
            }
            res += String.format("\n");
        }
        return res;

    }

    @Override
    public String triangleStarPrint() {
        String res = "";
        int rand = random.nextInt(50);
        System.out.println("정삼각형 별찍기");
        System.out.println("정삼각형의 길이 랜덤으로 생성한 값 : " + rand);
        for(int i = 0; i < rand; i++){
            for(int j = rand-i; j >= 0 ;j--){
                res += String.format("  ");
            }
            for(int k = 1; k < i; k++){
                res += String.format("*");
            }
            res += String.format("\n");
        }
        return res;
    }
}
