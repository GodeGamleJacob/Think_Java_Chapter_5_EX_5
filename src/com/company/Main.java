package com.company;

public class Main {

        public static void main (String[]args){         //
            boolean flag1 = isHoopy(202);            //1+5
            boolean flag2 = isFrabjuous(202);        //6+10
            System.out.println(flag1);                  //11
            System.out.println(flag2);                  //12
            if (flag1 && flag2) {                       //13
                System.out.println("ping!");            //14
            }                                           //
            if (flag1 || flag2) {                       //15
                System.out.println("pong!");            //16
            }                                           //
        }                                               //17
        public static boolean isHoopy ( int x){         //
            boolean hoopyFlag;                          //
            if (x % 2 == 0) {                           //2
                hoopyFlag = true;                       //3
            } else {                                    //
                hoopyFlag = false;                      //
            }                                           //
            return hoopyFlag;                           //4
        }                                               //
        public static boolean isFrabjuous ( int x){     //
            boolean frabjuousFlag;                      //
            if (x > 0) {                                //7
                frabjuousFlag = true;                   //8
            } else {                                    //
                frabjuousFlag = false;                  //
            }                                           //
            return frabjuousFlag;                       //9
        }                                               //
    }                                                   //
