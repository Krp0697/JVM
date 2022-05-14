public class JvmComprehension {

    public static void main(String[] args) {
        // В момент вызова метода main создается фрейм в стэке.
        int i = 1;                      // 1 Во фрейме main создается переменная i со значением 1.
        Object o = new Object();        /* 2 В Куче создается объект Object, во фрейме main создается переменная o,
        которой присваивается ссылка на этот объект*/
        Integer ii = 2;                 /* 3 В Куче создается объект Integer со значением 2,
        а во фрейме main появляется переменная ii со ссылкой на этот объект*/
        printAll(o, i, ii);             /* 4 В стэке создается фрейм printAll
        с переменными Object o, int i и Integer ii*/
        System.out.println("finished"); /* 7 В стэке создается фрейм println,
        которой передается ссылка на созданный в куче объект String со значением "finished".
        В ходе работы программы отрабатывает Garbage Collector.*/
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   /* 5 В Куче создается объект Integer со значением 700,
        а во фрейме printAll появляется переменная uselessVar со ссылкой на этот объект.*/
        System.out.println(o.toString() + i + ii);  /*6 В стэке создается фрейм println,
        которой передаются ссылки на Object o, int i и Integer ii. В стэке созается фрейм toString.*/
    }
}

