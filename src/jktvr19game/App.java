/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19game;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class App {
      /* private String repeat = "y";
    public static void main(String[] args) {
    }*/
        
    public void  run() {
        
        
        System.out.println("-------Game1----------");
        Random random = new Random() ;
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Загадано число, угадай: ");
        Scanner scanner = new Scanner(System.in);
        String gamerNumberStr = null;
        /*int gamerNumber = Integer.parseInt(gamerNumberStr);*/
        int gamerNumber = -1;
        int attempt = 0;
        do {            
            
        try {
            gamerNumberStr = scanner.nextLine();
            gamerNumber = Integer.parseInt(gamerNumberStr);
        } catch (Exception e) {
            System.out.println("неправильный ввод");
            System.exit(0);
        }
        
        
                if(myNumber == gamerNumber){
                    System.out.println("выиграл");
                    break;
                }else{
                    if (attempt < 2){
                        System.out.println("Неправильн, попробуй ещё");
                    }else{
                    
                        System.out.println("проиграл. было задумаео число" + myNumber);
                    }
                    break;
    }
        } while (true);
                System.out.println("конец игры");
                
        
    
}
}
