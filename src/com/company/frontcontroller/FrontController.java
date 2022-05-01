package com.company.frontcontroller;

import static com.company.controller.FightController.fighting;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> fighting();
        }
    }
}
