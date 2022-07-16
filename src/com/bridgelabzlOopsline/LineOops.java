package com.bridgelabzlOopsline;

import java.util.Scanner;

public class LineOops { double x1,x2,y1,y2;
    Double Line1,Line2;

    //initializing inputs of line coordinates from the user
    public void coordinates() {
        //  Initializing first line coordinates from the user
        OopsLineComparision firstLine=new OopsLineComparision();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1");
        x1 = input.nextInt();
        System.out.println("Enter x2");
        x2 = input.nextInt();
        OopsLineComparision secondLine=new OopsLineComparision();
        System.out.println("Enter y1");
        y1 = input.nextInt();
        System.out.println("Enter y2");
        y2 = input.nextInt();
    }

}
