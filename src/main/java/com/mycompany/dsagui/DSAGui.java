/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsagui;

import java.util.Scanner;

/**
 *
 * @author johnl
 */
public class DSAGui {

    public static void main(String[] args) {
        System.out.println("Lex");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Ente name: ");
        name = scanner.nextLine();
        
        System.out.println("Hello "+name);
        
    }
}
