package training.supportbank;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main (String args[]) {
        String input1 = "";
        printinput(input1);

    }
    public static void transactionlist1 (String args[]) throws IOException {
        ArrayList<String> transactions = (ArrayList<String>) Files.readAllLines(Paths.get("/Users/hmoodley/Desktop/bootcamp/Challenge3/SupportBank/2014 transactions.csv"));
        for (String transaction : transactions) {
            System.out.println(transaction);
        }

    }
    //input statement for List All
    public static void printinput(String input1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ListAll to output the account of each person : ");
        input1 = input.next();
        System.out.println("You entered " + input1);
        input.close();


        if(input1.equals("ListAll")){
            System.out.println( String transaction : transactions);

        }

    }
}