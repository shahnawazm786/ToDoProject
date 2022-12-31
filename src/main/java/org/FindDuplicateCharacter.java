package org;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
    duplicateChar();
    }
    public static void duplicateChar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String str= scanner.nextLine();
        System.out.println(str);
        for(int i=0; i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                {
                    System.out.print(str.charAt(i));
                }
            }
        }

    }

    public static void duplicateChar1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String str= scanner.nextLine();
        System.out.println(str);
        Set set=new HashSet();

    }
}


