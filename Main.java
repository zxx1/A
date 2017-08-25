package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String st=sc.nextLine();
            HashSet<String> has= new HashSet<>();
            int h=st.length();
            for (int i=0;i<h;i++){
                has.add(st.substring(i,i+1));
            }
            if (has.size()>2){
               System.out.println(0);
               break;
            }
            System.out.println(has.size());
        }
    }
}
