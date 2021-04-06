package com.localglobalvariable;

public class LocalGlobalVariable {
    public static void main(String[] args) {
        //Herhangi bir döngüde tanımlanmamışsa global değişkendir.( If not defined in any loop, it is a global variable.)
        int a=8;
        int b=4;
        for(int i=0;i<=1;i++){
            //Herhangi bir döngüde tanımlanmışsa local değişkendir.( If defined in any loop, it is a local variable.)
            System.out.println(i);
        }
        System.out.println(a);
        System.out.println(b);

    }
}
