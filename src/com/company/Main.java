package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.println("Hi " + user);
        scan.close();
    }
}*/
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your first and last names: ");
        Scanner scan = new Scanner(System.in);
        String fName = scan.nextLine();
        String lName = scan.nextLine();
        System.out.println(fName + lName);

    }
}
*/


/*public class Main {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Code: " + c + "=" + x);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

    }
}*/

//task#1 Приветствовать любого пользователя при вводе его имени через командную строку.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in); //Обьявили сканер
        String name = scan.nextLine();
        System.out.println("Hi " + name + "!");
    }
}*/

//task#2 Отобразить в окне консоли аргументы командной строки в обратном порядке

/*
public class Main {
    public static void main(String[] args) {
        //int[] valueArgs = new int[args.length]; //создание пустого массива new с длинною args.length
        for (int i = args.length - 1; i >= 0; i--) {
            //valueArgs[i] = Integer.parseInt(args[i]);
            int x = Integer.parseInt(args[i]);
            System.out.println(x);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        String a = "11";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
*/


//task#3 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

/*public class Main {
    public static void main(String[] args) {
        double number1 = Math.random() * 3; //Диапазон [0;1) умножается на 3. Получаем диапазон [0;3) 3 - исключительно. ( Math.random() * (3 - 0) ) + 0
        double number2 = Math.random() + 2; //К диапазону [0;1) прибавляем 2. Получаем диапазон [2;3)
        System.out.println(number1);
        System.out.println(number2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        double number1 = Math.random() * 3; //Диапазон [0;1) умножается на 3. Получаем диапазон [0;3) 3 - исключительно. ( Math.random() * (3 - 0) ) + 0
        double number2 = Math.random() * 3;
        System.out.print(number1 + " ");
        System.out.print(number2);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 3); //диапазон [0;2]. (int)(( Math.random() * (b - a + 1) + a)
        int number2 = (int) (Math.random() * 3);
        System.out.print(number1 + " ");
        System.out.print(number2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 3); //диапазон [0;2]. (int)(( Math.random() * (b - a + 1) + a)
        int number2 = (int) (Math.random() * 3);
        System.out.println(number1);
        System.out.println(number2);
    }
}*/

//task#4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner scan = new Scanner(System.in);
        String password1 = scan.nextLine();
        String password2 = "test";
        if (password1.equals(password2) ) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is wrong");
        }
    }
        }*/


//task#5 Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.

/*public class Main {
    public static void main(String[] args) {
        int[] valueArgs = new int[args.length]; //создание пустого массива new с длинною args.length
        int sum = 0;
        for (int i = args.length - 1; i >= 0; i--) {
            valueArgs[i] = Integer.parseInt(args[i]);
            System.out.println(valueArgs[i]);
            sum = sum + valueArgs[i];
        }
        System.out.println("Sum: " + sum);
    }

}*/


//task#6.1

/*public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nNumbers = new ArrayList<>();
        System.out.println("Enter your numbers: ");
        Scanner scan = new Scanner(System.in);


        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        //как задать количество строк?
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        //как задать количество строк?
        System.out.println(value1 % value2);
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        Double number = scan.nextDouble();
        System.out.println(number);
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your phrase: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Even and odd numbers.");
        for ()

            System.out.println("Even and odd numbers.");
        for ()
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};
        System.out.println(value[0]);
        System.out.println(value[1]);
        System.out.println(value[2]);
        System.out.println(value[3]);
        System.out.println(value[4]);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int[] value = new int[6];
        value[0] = 10;
        value[4] = 20;
        for (int i = 0; i<value.length; i++ ) {
            System.out.println(value[i]);
        }

    }
}*/




/*
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number 1, 2 or 3: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number==1) {
            System.out.println("You entered: 1");
        }
        else if (number==2){
            System.out.println("You entered: 2");
        }
        else if (number==3){
            System.out.println("You entered: 3");
        }
        else {
            System.out.println("You entered not 1, 2 or 3");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number==1) {
            System.out.println("You entered 1.");
        } else {
            System.out.println("You entered number != 1");
        }
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number 1:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number==1) {
            System.out.println("You entered number 1!");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: 1, 2, 3 or 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered number 1.");
                break;
            case 2:
                System.out.println("You entered number 2.");
                break;
            case 3:
                System.out.println("You entered number 3.");
                break;
            case 4:
                System.out.println("You entered number 4.");
                break;
            default:
                System.out.println("You entered incorrect number.");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
     while (i<8){
         System.out.println(i + "");
         i++;
     }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
     while (i<0){
         System.out.println(i + "");
         i++;
     }
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        int i = 100;
     while (i>=10){
         System.out.println(i + "");
         i-=10;
     }
    }
}
*/


/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            System.out.println(i);
        } while (i < 0);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 3; i>=-3 ; i--) {
            System.out.println(i);
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i *= 2;
        }
    }
}*/


/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            System.out.print(i + " ");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("3*"+i+"="+3*i);
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5,8, 9, 123, 123, 125, 135, 123};
        //System.out.println(array[3]);
        for (int i = 0; i < array.length; i=i+1) {
            System.out.println(array[i]);
        }


    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5) break;
            System.out.println(i+" ");
        }
    }
}*/
/*
public class Main {
    public static void main(String[] args) {
        String s= "test";
        String s1 = "test";
        System.out.println(s.equals(s1));
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        String s= "test";
        String s1 = "test";
        int i = 1;
        System.out.println(s.equals(s1));
        System.out.println(""+1);
    }
}
*/


/*public class Main {
    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "123.456";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println(str);
    }
}*/



/*public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.toString(262));
        System.out.println(Integer.toHexString(267));
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int a = 12;
        int[] a1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < a1.length; i++) {
            //Arrays.stream(a1)
            IntStream.range(1,1000) //создание массива
                    .filter(s -> s % 2 == 0)
                    .map(s -> s * 100)
                    .forEach(s->System.out.print(s+" "));


        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int a = 12;
        int[] a1 = new int[5];
        System.out.println(Arrays.toString(a1));
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        int a = 12;
        int[][] a1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int sum = 0;
        //System.out.println(Arrays.deepToString(a1));
        //System.out.println(a1 [2][2]);
        for (int[] ints : a1) {
            int sum1 = 0;
            for (int anInt : ints) {
                sum += anInt;
                sum1 += anInt;
                System.out.println(anInt);
            }
            out.println("sum1="+sum1);
        }
        out.println("sum=" + sum);
    }
    }
*/


/*    public class Main {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        reversArr(a1);
        out.println(Arrays.toString(a1));
    }

        private static void reversArr(int[] a1) {
            for (int i = 0; i < a1.length/2; i++) {
                int temp = a1[i];
                a1[i] = a1[a1.length - 1 - i];
                a1[a1.length - 1 - i] = temp;

            }
        }
    }
    */
/*public class Main {
    public static void main(String[] args) {
        int[] a1 = {8, 1, 2, 3, 4, 5, 9, 6, 7}; //определили массив
        //for (int barrier = a1.length - 1; barrier >= 0; barrier--) {
        for (int i  = 0; i <= a1.length-1; i++) {
            for (int j = 0; j < a1.length-1; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }

        //Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
    }*/

 /*   public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
       // int [] mas = {1, 3, 4, 6, 7};

        boolean isNotSorted = true;
        int buf;
        while(isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isNotSorted = true;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
            System.out.println("loop finish");
        }
        System.out.println(Arrays.toString(mas));
    }
}*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your first and last names: ");
        Scanner scan = new Scanner(System.in);
        String fName = scan.nextLine();
        String lName = scan.nextLine();
        System.out.println(fName + lName);

    }
}




















