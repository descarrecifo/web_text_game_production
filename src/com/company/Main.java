package com.company;
import com.company.model.Player;

import static com.company.controller.CharacterController.createPlayer;
//import static com.company.view.IOView.mainLoopView;
import static com.company.view.IOView.optionsMainMenu;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Player player = createPlayer();

        //we are starting the main loop
        optionsMainMenu(player);

    }
}