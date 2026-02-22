/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act2_rivera_mariana;

/**
 *
 * @author riv_sunset
 */
public class ACT2_RIVERA_MARIANA {
    public static void main(String[] args) {

        Integer[] intVector={101,99,12,19,21,111,345,25,77,81};
        Integer[] resultInt=Utils.ordena(intVector);
        Utils.imprimir(resultInt);

        Float[] floatVector={19.1f,456.6f,23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };
        Float[] resultFloat=Utils.ordena(floatVector);
        Utils.imprimir(resultFloat);
        
      // String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
      // String [] resultStr = Utils.ordena (strVector);

    }
}