package com.company;

public class Main {

        public static void main (String[]args){         //
            boolean flag1 = isHoopy(202);            //1+5 = opstart og return, og sender videre nedad
            boolean flag2 = isFrabjuous(202);        //6+10 = ny start efter return, og return og videresending
            System.out.println(flag1);                  //11 = souter "true"
            System.out.println(flag2);                  //12 = souter "true"
            if (flag1 && flag2) {                       //13 = hvis de to "flags" er kørt, da iværksættes
                System.out.println("ping!");            //14 = souter "ping!"
            }                                           //
            if (flag1 || flag2) {                       //15 = hvis "flags" er kørt, da iværksættes
                System.out.println("pong!");            //16 = souter "pong!"
            }                                           //
        }                                               //17 = programmet afsluttes
        public static boolean isHoopy ( int x){         //
            boolean hoopyFlag;                          //
            if (x % 2 == 0) {                           //2 = hvis resultat, er da sandt
                hoopyFlag = true;                       //3 = resultatet er sandt, så der kan skrives "true"
            } else {                                    //
                hoopyFlag = false;                      //
            }                                           //
            return hoopyFlag;                           //4 = beder om at returnere til toppen
        }                                               //
        public static boolean isFrabjuous ( int x){     //
            boolean frabjuousFlag;                      //
            if (x > 0) {                                //7 = hvis resultat, er da sandt
                frabjuousFlag = true;                   //8 = resultatet er sandt, så der kan skrives "true"
            } else {                                    //
                frabjuousFlag = false;                  //
            }                                           //
            return frabjuousFlag;                       //9 = beder om at returnere til toppen
        }                                               //
    }                                                   //
