package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(10);
        int a;
        a=233;
        System.out.println(a);
        /*if(true){System.out.println(100);}
        if(false){System.out.println(200);
            it.folse.else{System.out.println};
            Spring a;
            a="привет как дела hello";
            System.out.print(a);*/

        a=sum3(1,2,3);
        System.out.println(a);
        int b;
        b=d1(10);
        System.out.println(b);
        int v;
        v=n1(5,5);
        System.out.println(v);
        v=n1(1,1);
  int g=0;
          while (true){
              System.out.println(g);
              g=g+1;
              if (g==300){
                  break;
              }
          }

    }

    public static int sum3 (int privet,int kakdela,int da){
        int s;
        s=privet+kakdela+da;
        return s;
    }
    public static int d1 (int privet){
        int c;
        c=privet*privet;
        return c;

    }

    public static int n1 (int da, int net){
        int k;
        k=da*net;
        return k;
    }


}


