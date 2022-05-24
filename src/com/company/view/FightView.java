package com.company.view;

import com.company.model.NPC;
import com.company.model.Player;
import com.company.service.FightService;

import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;

public class FightView {

    public static void fightingMessages(String value, NPC enemy, Player player) {
        switch (value) {
            case "1": System.out.println("Your enemy successes their attack!");
            case "2": System.out.println("You successes your attack!");
            case "3": System.out.println("The enemy makes you " +YELLOW_BRIGHT+ FightService.fightDamage(enemy, player)+ " points "+ANSI_RESET +"of damage!");
            case "4": System.out.println("You makes " +YELLOW_BRIGHT+ FightService.fightDamage(player, enemy)+ " points "+ANSI_RESET +"of damage to your enemy!");
            case "5": System.out.println("Your enemy has failed, now is your turn!");
            case "6": System.out.println("You have failed, now is your enemy's turn!");
            case "7": System.out.println("You have failed, try again!");
            case "8": System.out.println("Your enemy has failed, they will try again!");
            case "9": System.out.println("You have leveled up! Your level is now " +YELLOW_BRIGHT+ player.getLevel()+ANSI_RESET);
            case "10": System.out.println("You're stronger! Now your strength is " +YELLOW_BRIGHT+ player.getStrength() +ANSI_RESET + ", your defense is "
                    +YELLOW_BRIGHT+ player.getDefense() +ANSI_RESET + ", your speed is "+YELLOW_BRIGHT+ player.getSpeed() +ANSI_RESET + ", your dexterity is "
                    +YELLOW_BRIGHT+ player.getDexterity() +ANSI_RESET + " and you have " +YELLOW_BRIGHT+ player.getMaxHealthPoints() + " HP"+ANSI_RESET);
            case "11": System.out.println("You need to attack again");
        }
    }

    public static void enemyPresentationMessage(NPC enemy){
        switch (enemy.getName()){
            case "Goblin": System.out.println("\nYou found a greenish creature; is somewhat an caricature of a human, with a long bulbous nose, big pointy ears and a enormous mouth. You found yourself facing a "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+".");
            case "Wolf": System.out.println("\nIn front of you theres a rabid "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+". Maybe you don't like killing innocent creatures, but this one stopped being so a long time ago.");
            case "Burglar": System.out.println("\nThe evil can take many forms; for example the "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" in front of you, motivated by greed and willing to kill you for whatever you have on you.");
            case "Witch": System.out.println("\nThere are some corrupt magic users; servants of dark gods who do bloody rituals. Before you stands one of them, a "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+".");
            case "Ratman": System.out.println("\nIs that a man, or perhaps a beast? It doesn't matter, that "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" only wants to kill you.");
            case "Wild boar": System.out.println("\nNormally a "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" like the one in front of you can be dangerous, but the rabies in this one makes it deadly.");
            case "Vampire": System.out.println("\nSometimes the dead cannot rest. So they come out of their graves and look for prey to feed on; if you don't kill this "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" you will be that prey.");
            case "Wendigo": System.out.println("\nHunger can drive a man to do crazy things, but certain lines must not be crossed, even if one is desperate. When a man decides to feed on a fellow, he becomes a grotesque and unreal creature; a "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+", like the one before you.");
            case "Soldier": System.out.println("\nNot everyone trusts you and your mission; this "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" before you is going to give his life to prevent you from carrying it out. Are you going to kill him or will you prefer to escape and spare his life?");
            case "Golem": System.out.println("\nThe once inanimate now walks; this "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+" is a demonstration of the infinite possibilities of magic, but if you marvel too much, you may end up falling victim to its inhuman strength.");
            case "Cave lion": System.out.println("\nFrom the frozen southern mountains has came this "+YELLOW_BRIGHT+enemy.getName()+ANSI_RESET+". Aforetime it was a magnificent animal, but nowadays is only a rabid bloodthirsty beast.");
        }
    }
}
