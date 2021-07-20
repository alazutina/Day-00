/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex001;

import java.util.Scanner;

/**
 *
 * @author anya
 */
public class ex001 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int num;
        sc.hasNextInt();
        num = sc.nextInt(); 
        int count = 1;
        
        if(num<=0) {System.out.println(" Illegal Argument");} 
        else{
            
            
            for(int i=2;i<num;i++){
                if(num%i == 0 ){ System.out.println("​false  " + count); break;}
                else count++;
            
                if(count==num-1)System.out.println("​true  " + count);
        }

     
    }


    
}
}

//На вход программа принимает число, введенное в процессе работы программы с
//клавиатуры, и выводит на экран результат проверки на “простоту”. Также программа
//должна выводить количество шагов (итераций), за которое ей удалось выполнить эту
//проверку. В данной задаче итерация - одна операция сравнения.
//Для отрицательных чисел, нуля и единицы следует вывести сообщение ​IllegalArgument
//и завершить выполнение программы с кодом ​-1​.
