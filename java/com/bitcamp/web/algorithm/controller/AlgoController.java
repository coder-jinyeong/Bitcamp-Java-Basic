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

package com.bitcamp.web.algorithm.controller;


import com.bitcamp.web.algorithm.service.GraphService;
import com.bitcamp.web.algorithm.service.GraphServiceImpl;
import com.bitcamp.web.algorithm.service.HeapService;
import com.bitcamp.web.algorithm.service.HeapServiceImpl;


import java.util.Arrays;
import java.util.Scanner;

public class AlgoController {
        public void execute(Scanner scanner){
            GraphService graphService = new GraphServiceImpl();
            HeapService heapService = new HeapServiceImpl();
            while(true){
                System.out.println("[담당] 0.종료 1.권혜민 2.조현국 3.김한슬 4.서성민 5.김진영");
                switch (scanner.next()){
                    case "0":
                        System.out.println("Exit");return;
                    case "1":
                        System.out.println("0.Exit 1.Sort 2.Stack 3.Queue");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("Exit");return;
                            case "1": break;
                            case "2": break;
                            case "3": break;
                            default: System.out.println("Wrong Number");break;
                        }
                        break;
                    case "2":
                        System.out.println("0.Exit 1.Hash 2.Dfs 3.Bfs");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("Exit");return;
                            case "1": break;
                            case "2": break;
                            case "3": break;
                            default: System.out.println("Wrong Number");break;
                        }
                        break;
                    case "3":
                        System.out.println("0.Exit 1.Greedy 2.Bruteforce");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("Exit");return;
                            case "1": break;
                            case "2": break;
                            default: System.out.println("Wrong Number");break;
                        }
                        break;
                    case "4":
                        System.out.println("0.Exit 1.Dps 2.Binary");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("Exit");return;
                            case "1": break;
                            case "2": break;
                            default: System.out.println("Wrong Number");break;
                        }
                        break;
                    case "5":
                        System.out.println("0.Exit 1.Heap 2.Graph");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("Exit");return;
                            case "1":
                                System.out.print("가진 음식의 개수를 입력하세요 : ");
                                int [] scoville = new int[scanner.nextInt()];
                                System.out.println(scoville.length + "개 음식의 각 scoville 지수를 입력하세요 ");
                                for(int i = 0; i < scoville.length; i++){
                                    System.out.print((i + 1) + " 번째 음식의 스코빌 지수 : ");
                                    scoville[i] = scanner.nextInt();
                                }
                                System.out.print("원하시는 스코빌 지수를 입력하세요 : ");
                                int k = scanner.nextInt();
                                System.out.println("모든 음식의 스코빌 : " + Arrays.toString(scoville) + "\n원하는 스코빌 지수 : " + k +
                                        "\n섞은 횟수 : " + heapService.spicy(scoville,k));

                                int [][] jobs = new int[10][10];
                                heapService.diskController(jobs);
                                String [] operations = new String[10];
                                heapService.priorityQueue(operations);
                                break;
                            case "2":
                                int n = 0;
                                int [][] edge = new int[10][10];
                                graphService.node(n,edge);
                                int [][] results = new int[10][10];
                                graphService.rank(n,results);
                                int [] arrows = new int[10];
                                graphService.room(arrows);
                                break;
                            default: System.out.println("Wrong Number");break;
                        }
                        break;
                    default:
                        System.out.println("Wrong Number");break;
                }
            }
        }
}
