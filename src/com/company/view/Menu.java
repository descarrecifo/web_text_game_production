package com.company.view;
import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

public class Menu{

    //Main Menu
    public static void mainMenuView() {
        System.out.println("**************************************");
        System.out.println("* 1- New Game                        *");
        System.out.println("* 2- Exit                            *");
        System.out.println("**************************************");
    }

    // Menu New Game
    public static void menuNewGameView() {
        System.out.println("************************************");
        System.out.println("* 1- Fight                         *");
        System.out.println("* 2- Inventory                     *");
        System.out.println("* 3- Return                        *");
        System.out.println("************************************");
    }


    public static void showClass(){
        System.out.println("Choose your class");
        System.out.println("******************");
        System.out.println("* 1-Warrior      *");
        System.out.println("* 2-Mage         *");
        System.out.println("* 3-Hunter       *");
        System.out.println("******************");
    }

}
