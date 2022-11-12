import java.util.Scanner;
        import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер программы для исполнения:\n 1)Значения выражений\n 2)Равенство 4 чисел\n 3)Поиск числа наибольших элементов массива\n 4)Поиск числа наименьших элементов массива\n 5)Поиск чисел превышающих среднее по массиву\n 6)Умножение 2х чисел без знака умножения\n 7)Четные или нечетные числа массива\n 8)Из фаренгейта в цельсия\n 9)Расчет ИМТ\n 10)Квадрат, куб и четвертая степень\n 11)проверка на существование треугольника\n ");
        int vybor = scan.nextInt();
        if(vybor==1)
        {one();
        }
        else if(vybor==2) {
            two();
        } else if(vybor==3)
        {
            three();
        }
        else if(vybor==4)
        {four();
        } else if(vybor==5)
        {five();
        } else if(vybor==6)
        {six();
        } else if(vybor==7)
        {seven();
        } else if(vybor==8)
        {eight();
        } else if(vybor==9)
        {nine();
        } else if(vybor==10)
        {ten();
        } else if(vybor==11)
        {eleven();
        } else
        {System.out.println("Неправильно выбрана программы");
        }
    }
    static void one()
    {
        System.out.println("a)Результат выражения:(101+0)/3");
        System.out.println((101+0)/3);
        System.out.println("b)Результат выражения:(3.0e-6*10000000.1");
        System.out.println(3.0e-6*10000000.1);
        System.out.println("c)Результат выражения:(true&&true)");
        System.out.println(true&&true);
        System.out.println("d)Результат выражения:(false&&true)");
        System.out.println(false&&true);
        System.out.println("e)Результат выражения:(false&&false)|(true&&true)");
        System.out.println((false&&false)|(true&&true));
        System.out.println("f)Результат выражения:(false&&false)&&(true&&true)");
        System.out.println((false|false)&&(true&&true));
    }
    static void two()
    {
        System.out.println("Введите 4 числа");
        Scanner scunner = new Scanner(System.in);
        int n1 = scunner.nextInt();
        int n2 = scunner.nextInt();
        int n3 = scunner.nextInt();
        int n4 = scunner.nextInt();
        if(n1==n2 & n2==n3 & n3==n4)
        {System.out.println("Равно");
        }
        else {System.out.println("Не равно");
        }
    }
    static void three()
    {System.out.println("Количество наибольших чисел на выходе");
        Scanner scan = new Scanner(System.in);
        int kolichestvo = scan.nextInt();
        int max = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        int [] arr2 = {0,0,0,0,0,0,0,0,0};
        Arrays.sort(arr1);
        for (int i = arr1.length - kolichestvo; i < arr1.length; i++)
        {System.out.println(arr1[i]);
        }
    }
    static void four()
    {System.out.println("Количество наименьших чисел на выходе");
        Scanner scan = new Scanner(System.in);
        int kolichestvo = scan.nextInt();
        int min = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        for (int i = 0; i < arr1.length - 1; i++)
        {
            for (int z = i + 1; z < arr1.length; z++)
            {
                if (arr1[i] < arr1[z])
                {
                    min = arr1[z];
                    arr1[z] = arr1[i];
                    arr1[i] = min;}
            }
        }
        for (int n = arr1.length - kolichestvo; n < arr1.length; n++)
        {System.out.println(arr1[n]);
        }
    }
    static void five()
    {
        int summa = 0;
        int schetchic = 0;
        double srznach = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        for(int i = 0; i < arr1.length; i++ )
        {summa = arr1[i] + summa;
            schetchic = schetchic + 1;
        }
        srznach = summa/schetchic;
        for(int z = 0; z < arr1.length; z++)
        {if(arr1[z] > srznach)
            {System.out.println("Числа превышающие среднее по массиву:"+arr1[z]);
            }
        }
    }
    static void six()
    {System.out.println("Введите множители");
        Scanner scunner = new Scanner(System.in);
        float n1 = scunner.nextFloat();
        float n2 = scunner.nextFloat();
        float result = 0;
        for(int i = 0; i < n2; i++)
        {result = result + n1;
        }
        System.out.println("Результат:" + result);
    }
    static void seven()
    {int [] arr1 = {10,350,750,40,20,35,12,17,85};
        System.out.println("Четные:");
        for(int i = 0; i < arr1.length; i++)
        {if(arr1[i] % 2 == 0)
            {System.out.println(arr1[i]);
            }
        }
        System.out.println("Нечетные:");
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                System.out.println(arr1[i]);
            }
        }
    }
    static void eight()
    {System.out.println("Температура в Фаренгейтах");
        Scanner scunner = new Scanner(System.in);
        float faren = scunner.nextFloat();
        System.out.println("Ваша температура в Цельсия:" + ((faren-32)*5/9));
    }
    static void nine()
    {System.out.println("Ваш рост в м");
        Scanner scunner = new Scanner(System.in);
        float rost = scunner.nextFloat();
        System.out.println("Ваш вес в кг");
        float ves = scunner.nextFloat();
        System.out.println("Ваш имт:" + (ves/(rost*rost*0.0001)));
    }
    static void ten()
    {System.out.println("Введите число");
        Scanner scunner = new Scanner(System.in);
        float num = scunner.nextFloat();
        System.out.println("Квадрат числа:" + (num*num));
        System.out.println("Куб числа:" + (num*num*num));
        System.out.println("Четвертая степень:" + (num*num*num*num));
    }
    static void eleven()
    {System.out.println("Введите стороны треугольника");
        Scanner scunner = new Scanner(System.in);
        int n1 = scunner.nextInt();
        int n2 = scunner.nextInt();
        int n3 = scunner.nextInt();
        if((n1 + n2) > n3 & (n2 + n3) > n1 & (n1 + n3) > n2)
        {System.out.println("Треугольник существует");
        } else
        {System.out.println("Треугольник не существует");
        }
    }
}