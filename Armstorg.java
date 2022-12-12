package Giris;

import java.util.Scanner;

public class Armstorg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int number = input.nextInt();
        int basNumber = 0, tempNumber = number, basValue,result = 0,basPow;
        while (tempNumber != 0){
            tempNumber /= 10 ;
            basNumber++;
        }

        tempNumber = number; //number degeri kaybolmasin diye boyle bir islem yapiyoruz.

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1 ;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result +=basPow;
            tempNumber /= 10 ;
        }
        if (result == number){
            System.out.println( number + " sayisi bir armstrong sayidir.");
        }else {
            System.out.println( number + " sayisi bir armstrong sayi degildir.");
        }
    }
}
