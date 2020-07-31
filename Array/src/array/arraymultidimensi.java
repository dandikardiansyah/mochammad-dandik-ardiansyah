/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

/**
 *
 * @author laptop jefri
 */
public class arraymultidimensi {
    public static void main(String[] args) {
        int[][]bil ={{11,12,13}, {14,15,16}, {17,18,19}};
        
        for (int b=0; b<13; b++){
            System.out.println("{");
            for (int k=0; k<13; k++){
                System.out.println("bil[b][k]");
            }
            System.out.println(")");
            System.out.println();
        }
    }
}
