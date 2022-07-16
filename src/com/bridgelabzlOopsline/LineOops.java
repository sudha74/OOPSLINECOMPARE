package com.bridgelabzlOopsline;

import java.util.Scanner;

public class LineOops {
    double x1, x2, y1, y2;
    Double Line1, Line2;

    //initializing inputs of line coordinates from the user
    public void coordinates() {
        //  Initializing first line coordinates from the user
        OopsLineComparision firstLine = new OopsLineComparision();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1");
        x1 = input.nextInt();
        System.out.println("Enter x2");
        x2 = input.nextInt();
        OopsLineComparision secondLine = new OopsLineComparision();
        System.out.println("Enter y1");
        y1 = input.nextInt();
        System.out.println("Enter y2");
        y2 = input.nextInt();
    }

    //Now comparing two lengths of line
    public void compare(Double length1, Double length2) {
        Line1 = length1;
        Line2 = length2;
        int equality = Line1.compareTo(Line2);
        System.out.println(equality);
        if (equality < 0) {
            System.out.println("First line length is less than second line ");
        } else if (equality > 0) {
            System.out.println("First line length is greater than second line");
        } else {
            System.out.println("Both first and second line lengths are equal");
        }
    }

}