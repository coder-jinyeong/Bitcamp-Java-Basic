/**
 * packageName: com.bitcamp.web.quiz.service
 * fileNa     : Feb10Service
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
import java.util.Scanner;
public interface Feb10Service {
    // 아래 문제들은 모두 스캐너 없이 , Math랜덤으로 처리합니다
    // 1인
    void bubbleSort(int[] arr);
    void insertionSort(int[]arr);
    void selectionSort(int[]arr);
    // 1인
    void quickSort(int []arr1, int start, int end);
    void mergeSort(Scanner scanner);
    // 1인
    void magicSquare();
    // 1인
    String zigzag();
    // 1인
    // 좌측90도 직각삼각형 별찍기
    String rectangleStarPrint();
    // 정삼각형 별찍기
    String triangleStarPrint();

}
