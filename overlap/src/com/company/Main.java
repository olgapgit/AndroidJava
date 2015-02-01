package com.company;
public class Main {
    static int x, y, width, height, x1, y1, width1, height1;

    public static void main(String[] args) {
        x = 5;
        y= 2;
        width=10;
        height=4;
        x1=9;
        y1=4;
        width1=10;
        height1=5;
        paint();
    }
    static void paint(){
        int maxHeight;
        int maxWidth;
        if (height>height1) maxHeight=height;
        maxHeight=height1;
        if (width>width1) maxWidth=width;
        maxWidth=width1;
        if (x>x1) maxWidth+=x;
        maxWidth+=x1;
        if (y>y1) maxHeight+=y;
        maxHeight+=y1;
        for(int i=0;i<maxHeight;i++){
            for(int j=0;j<maxWidth;j++){
                if (draw(j,i)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static boolean draw(int column,int row){
        return draw1(column,row) || draw2(column,row);
    }
    static boolean draw1(int column,int row) {
        return ((row >= y && row < y + height) && (column == x || column == x + width -1))
    ||((row == y || row == y + height-1) && (column >= x && column < x + width));
    }


    static boolean draw2(int column,int row){
        return ((row >= y1 && row < y1 + height1) && (column == x1 || column == x1 + width1 -1))
                ||((row == y1 || row == y1 + height1-1) && (column >= x1 && column < x1+ width1));
}
}
