package by.belhard.BPJ20.homework.homework02;

public class exercise03 {
    public static void main(String[] args) {
        int t = 16;
        if (t < 10) {
            System.out.println("Следует надеть куртку");
        }
        else if (t >= 10 && t<17) {
            System.out.println("Возьмите ветровку");
        }
        else if (t >= 17 && t < 20) {
            System.out.println("Возьмите свитер");
        }
        else if (t >= 21 && t < 30) {
            System.out.println("Возьмите майку");
        }
        else if (t >= 31)
            System.out.println("Возьмите ветровку");
    }
}


