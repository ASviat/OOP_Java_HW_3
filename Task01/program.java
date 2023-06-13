package Task01;

import java.util.Scanner;

// Вам нужно добавить реализацию собственного функционального интерфейса. 
// Вы можете выбрать любой класс и добавить свой собственный функциональный интерфейс, 
// описывающий необходимое поведение.

public class program {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Имя пациента:");
        String name = myScanner.next();
        System.out.println("Введенный препарат: ");
        String drug = myScanner.next();
        System.out.println("Количество мг: ");
        int dose = myScanner.nextInt();

        I_MakePunishment makePunishment = (client, hesDrug, doseTaken) -> {
            System.out.printf("Пациенту %s был(-о,-а) введен(-о,-а) препарат %s дозой %d мг", client, hesDrug, doseTaken);
        };

        makePunishment.doIt(name, drug, dose);

        myScanner.close();
    }
}