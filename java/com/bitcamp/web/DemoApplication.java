/**
 * packageName: com.bitcamp.web
 * fileNa     : DmoApplication
 * au         : kimjinyeong
 * date       : 2022-02-09
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         kimjinyeong    최초 생성
 */

package com.bitcamp.web;

import com.bitcamp.web.algorithm.controller.AlgoController;
import com.bitcamp.web.auth.controller.AuthController;
import com.bitcamp.web.quiz.controller.Feb06Controller;
import com.bitcamp.web.oop.controller.OopController;
import com.bitcamp.web.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        AlgoController algoController = new AlgoController();
        AuthController studentController = new AuthController();
        OopController phoneController = new OopController();
        QuizController quizController = new QuizController();
        while (true){
            System.out.println("[메인메뉴] \n 0.Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm ");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###"); return;
                case "1":
                    System.out.println("### Auth ###");
                    studentController.execute(scanner);
                    break;
                case "2":
                    System.out.println("### OOP ###");
                    phoneController.execute(scanner);
                    break;
                case "3":
                    System.out.println("### Quiz ###");
                    quizController.execute(scanner);
                    break;
                case "4":
                    System.out.println("### Algorithm ###");
                    algoController.execute(scanner);
                    break;
                default:
                    System.out.println(" Wrong Number ");break;
            }
        }
    }
}
