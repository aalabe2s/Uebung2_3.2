package org.example;

import java.util.Scanner;
public class Time implements TimeIF {

    static int std1;
    static int std2;
    static int mint1;
    static int mint2;

        public  void main (String [] args){

            Scanner scanner = new Scanner(System.in);
            System.out.print("geben Sie was ein");

             std1 = scanner.nextInt();
             mint1 = scanner.nextInt();
             std2 = scanner.nextInt();
             mint2 = scanner.nextInt();


            String [] erg = zeit(std1, mint1);
            System.out.println(erg[0] + erg[1] + erg[2]);

            Time m1 = new Time();
            Time m2 = new Time();

            String [] ergadd= zeitaddieren(m1, m2);
            System.out.print(ergadd[0] + ergadd[1]+ ergadd[2]);
        }

        public String [] zeit(int std, int mint) {
            String std2 = Integer.toString(std);
            String mint2=  Integer.toString(mint);
            String [] res =new String[3];
            res [0]=std2;
            res [1]=":";
            res [2]=mint2;
            return res;
        }

        public String [] zeitaddieren (Time m1, Time m2){


            int new_std = m1.std1 + m1.std2;
            int new_mint = m1.mint1 + m2.mint2;

            while(new_mint>59){
                new_mint = new_mint -60;
                new_std++;
            }
            String [] t1 = new String[3];
            t1[0]=Integer.toString(new_std);
            t1[1]=":";
            t1[2]=Integer.toString(new_mint);
            return t1;
        }

    }

