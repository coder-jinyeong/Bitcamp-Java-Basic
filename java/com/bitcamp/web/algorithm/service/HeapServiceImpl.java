/**
 * packageName: com.bitcamp.web.algorithm.service
 * fileNa     : HeapServiceImpl
 * au         : kimjinyeong
 * date       : 2022-02-08
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         kimjinyeong    최초 생성
 */

package com.bitcamp.web.algorithm.service;

import java.util.PriorityQueue;

public class HeapServiceImpl implements HeapService{
    @Override
    public int spicy(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for(int sco : scoville){
            heap.add(sco);
        }

        while(heap.peek() <= K){
            if(heap.size() == 1){
                return -1;
            }
            int a = heap.remove();
            int b = heap.remove();

            heap.add(a + (b*2));
            answer ++ ;
        }

        return answer;
    }

    @Override
    public int diskController(int[][] jobs) {
        return 0;
    }

    @Override
    public int[] priorityQueue(String[] operations) {
        return new int[0];
    }
}
