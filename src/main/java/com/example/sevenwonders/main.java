package com.example.sevenwonders;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Voulez-vous jouer dans la console ou dans l'interface ?" + "\n" + "Taper 1 pour la console et 2 pour l'interface : ");

            int choice = sc.nextInt();
            if (choice == 1){
                Game.Play();
            }else{
                Menu_Controller.main();

            }
        }
}
