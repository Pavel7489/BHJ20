package by.belhard.BPJ20.homework.homework02;

import org.w3c.dom.ls.LSOutput;

public class exercise04 {
    public static void main(String[] args) {
        double sal1=1000.80;
        double sal2=345.78;
        double sal3=70065.59;
        double max;
        double min;
      // for(int i=0;i<3;i++)
           if(sal1>sal2&&sal1>sal3){
               max=sal1;
               System.out.println("max="+ max);
              min=sal2<sal3?sal2:sal3;
               System.out.println("min=" + min);
               System.out.println("max-min="+ (max-min));
           }

        if(sal2>sal1&&sal2>sal3){
            max=sal2;
            System.out.println("max="+ max);
            min=sal1<sal3?sal1:sal3;
            System.out.println("min=" + min);
            System.out.println("max-min="+ (max-min));
        }

        if(sal3>sal2&&sal3>sal1){
            max=sal2;
            System.out.println("max="+ max);
            min=sal1<sal2?sal1:sal2;
            System.out.println("min=" + min);
            System.out.println("max-min="+ (max-min));
        }

    //    while(sal2>sal1&&sal2>sal3){
      //      max=sal2;
        //}
      //  System.out.println("max-min="+ (max-min));
    }

}
