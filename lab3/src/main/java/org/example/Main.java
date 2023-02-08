package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
USN();
        }
    public static void USN(){
        Scanner in = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;


        while(true){

            System.out.println("Введите номер операции");

            String input = in.nextLine();

            if("end".equals(input)){
                System.out.println("Программа завершена");
                break;
            }


            int operation = Integer.parseInt(input);

            switch(operation){
                case 1:
                    System.out.println("Введите сумму дохода");
                    String moneyStr = in.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    System.out.println("Доходы"+" "+earnings);
                    break;

                case 2:
                    System.out.println("Введите сумму расходов");
                    String spendMoney = in.nextLine();
                    int spends = Integer.parseInt(spendMoney);
                    spendings += spends;
                    System.out.println("Расходы"+" "+spendings);
                    break;

                case 3:
                    double usn = earnings*0.06;
                    System.out.println("Доходы ип"+" "+earnings+" "+"Рублей");
                    System.out.println("Расходы ип"+" "+spendings+" "+"Рублей");
                    double usn2 = (earnings-spendings)*0.15;


                    if(usn<usn2)
                    {
                        taxEarningsMinusSpendings( earnings, spendings);
                        System.out.println("Экономия"+" "+usn);
                    }
                    else
                    {
                        Earnings( earnings);
                        System.out.println("Экономия"+" "+usn2);
                    }
            }
        }

    }

    public static double taxEarningsMinusSpendings(int earnings, int spendings){
        double usn2 = (earnings - spendings)* 15/100;

        if(usn2 >= 0)
        {
            System.out.println("Выгодное решение усн доходы минус расходы:"+" "+usn2);
            return usn2;
        }
        else
        {
            return 0;
        }
    }


    public static double Earnings(int earnings){
        double usn = earnings * 0.06;
        if(usn >= 0)
        {
            System.out.println("Выгодное решение усн доходы:"+" "+usn);
            return usn;
        }
        else
        {
        return 0;
        }
     }

//     Задание 2

    public static void equal(){

        Scanner in = new Scanner(System.in);


        System.out.println("Выберите операцию \n 1) Сравнить \n 2) Округлить \n 3) Отбросить дробную часть");


        int operation = in.nextInt();



        switch(operation){
            case 1:
                System.out.println("Введите первое число");
                String first = in.nextLine();
                double one = Double.parseDouble(first);
                System.out.println("Введите второе число");
                String second = in.nextLine();
                float two = Float.parseFloat(second);
                if(one == two)
                {
                    System.out.println("Числа равны");
                    break;
                }
                else if (one<two)
                {
                    System.out.println("Число 1 меньше числа 2");
                    break;
                }
                else
                {
                    System.out.println("Число 1 больше числа 2");
                    break;
                }
            case 2:
                System.out.println("Введите число для округления");
                float round = in.nextFloat();
                System.out.println(Math.round(round));

            case 3:
                System.out.println("Введите число у которого нужно отбросить дробную часть");
                double s = in.nextDouble();
                long res = (long) s;
                System.out.println("Результат"+" "+res);
                break;
        }

    }

}
