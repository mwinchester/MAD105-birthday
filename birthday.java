package com.company;



import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // to get user input
        LocalDateTime today = LocalDateTime.now(); // to get current date / time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        String textToday = today.format(formatter);
        System.out.println("Today's date is: " + textToday);
        System.out.println("What month were you born in? (Enter the number, January would be 1");
        String myMonth = scanner.next();
        System.out.println("What day were you born? ");
        int day = scanner.nextInt();


        System.out.println(myMonth);

        // setting  the birthday from the user
       // LocalDateTime birthday = LocalDate.of(2017, Month.myMonth, day);

       /*

        //loop till next full moon is determined
        while(today.isAfter(next)) {
            // add minutes until the next full moon is determined
            next = next.plusMinutes(MINUTES_BETWEEN);
        }

        String textNext = next.format(formatter);
        System.out.println("The next full moon will be: " + textNext);
        LocalDateTime ends = next.plusDays(3);
        String textEnds = ends.format(formatter);
        System.out.println("Wear silver or stay inside at night until " + textEnds);


    */
    }
}
