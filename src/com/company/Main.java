package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("TestFile");
            Scanner scanFile = new Scanner(fr);
            Scanner scan = new Scanner(System.in);
            int LineNumber = 0;
            System.out.println("Текст из вашего файла: ");
            while (scanFile.hasNextLine()) {
                System.out.println(scanFile.nextLine());
                LineNumber++;
            }
            FileWriter fw = new FileWriter("TestFile");
            System.out.println("Введите ваш текст: ");
            String str;
            do {
                str = scan.nextLine();
                fw.write(str + "\n");
                LineNumber--;
            } while (LineNumber != 0);
            fw.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
