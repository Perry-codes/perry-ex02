/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */

/*
establish scanner input from user

prompt user to input string

count characters in string

print back original string with character count

 */

package ex02;

import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the input string? ");

        String inputString = sc.nextLine();

        int stringLength = inputString.length();

        System.out.printf("%s has %d characters." , inputString , stringLength);


    }
}
