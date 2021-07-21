/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex002;

import java.util.Scanner;

/**
 *
 * @author anya
 */
public class Program02 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=0;
    int count = 0;
    sc.hasNextInt();
    num = sc.nextInt();
        
    
    while(num!=42){
    //for(int i = 1; i++; i>0){
//        sc.hasNextInt();
//        num = sc.nextInt();
       
        
        int num_temp = num;
        int sum = 0;
        
        while(num_temp>0){
        sum = sum + num_temp%10;
        num_temp = num_temp/10;
        }
     //   System.out.println("sum" + sum);
        int flag = 1;
        for(int i=2;i<= Math.sqrt(sum);i++){
                if(sum%i == 0 ){   flag =0;}
        }
        if(flag==1) count++;
        sc.hasNextInt();
        num = sc.nextInt();
        }
    
    System.out.println("Count of coffee-request - " + count);

}
}
