package Main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        double intrest;
        intrest= 34*0.51352353;
        System.out.printf("intress on $%1.2f%n", intrest);

        Scanner stdin = new Scanner( System.in );
        System.out.println("sisesta principal?");
        double principal;
        principal = stdin.nextDouble();
        System.out.println(principal);




    }

}
