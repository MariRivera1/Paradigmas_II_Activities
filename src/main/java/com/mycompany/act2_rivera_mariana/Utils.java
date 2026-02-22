/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2_rivera_mariana;

/**
 *
 * @author riv_sunset
 */

public class Utils {
    // Metodo generico estatico a num comparables
    public static <T extends Number & Comparable<T>>T[] ordena(T[] v){
        quickSort(v,0,v.length-1);
        return v;
    }

    private static <T extends Comparable<T>> void quickSort(T[] v, int i, int j){
        if(i<j){
            int m=partition(v,i,j);
            quickSort(v,i,m-1);
            quickSort(v,m+1,j);
        }
    }

    private static <T extends Comparable<T>> int partition(T[]v, int i, int j) {
        T k=v[j];      // pivote
        int m=i-1;

        for(int l=i; l<j; l++){
            if(v[l].compareTo(k)<= 0){
                m++;
                swap(v,m,l);
            }
        }

        swap(v, m+1,j);
        return m+1;
    }

    private static <T> void swap(T[] v, int i, int j) {
        T k=v[i];
        v[i]=v[j];
        v[j]=k;
    }

    public static <T> void imprimir(T[] v){
        for (T i:v){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}