public class HomeWorkApp2 {
    public static void main(String[] args) {
        checkSum(5,5);
        printText(-10);
        returnText(-10);
        printWord( "Строка", 5);
        checkYear(504);
    }
    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    //(включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkSum(int a, int b) {
        int x = a * b;
        if (x >= 10 && x <= 20) {
           return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void printText(int a) {
        if (a>=0) {
            System.out.println(a + " число положительное");
        } else {
            System.out.println(a + " число отрицательное");
        }

    }

    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean returnText(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWord(String word, int b) {

//        for (int i = 0; i < b; i++) {
//            System.out.println(word);
//        }
        int i = 0;
        while (i < b){
            System.out.println(word);
            i++;
        }

    }

//* Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.

    public static boolean checkYear(int year) {
        if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)){
            return true;
        } else {
            return false;
        }
    }
}

