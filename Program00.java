/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;



/**
 *
 * @author anya
 */
public class Program {
    
      public static void main(String[] args){
   
          int numInt = 479598; 
          
          int sum = 0 ;
          
          for(int i=0;i<=5;i++){
              sum = sum + numInt%10;
              numInt = (numInt-numInt%10)/10;
          }
          
             System.out.println(sum);
    }
    
}


//Реализуйте работу с целочисленным типом.
//Для шестизначного числа типа int (значение числа задается непосредственно в коде
//явной инициализацией переменной number), посчитать сумму цифр этого числа.
//Пример работы программы для числа ​479598​ :
//$ java Program
//42
