package cs.vsu.ru.skogorevma.gr12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();
        if (year%4==0 &&(year%100!=0 || year%400==0)) {
            System.out.println("366 days");
        } else {
            System.out.println("365 days");
        }
    }
}
