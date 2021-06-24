package Limits;

import java.util.Scanner;

public class DemoSplit {

    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        do {
            System.out.print("Mời bạn nhập số lượng sinh viên: ");
            n = sc.nextInt();
        } while (n < 0);
        String[] ten = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập họ tên sinh viên thứ " + (i + 1));
            ten[i] = sc.nextLine();
        }
    }
}
