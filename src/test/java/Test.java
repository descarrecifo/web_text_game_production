

import com.company.model.EquippableItem;
import com.company.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.*;

public class Test {
   @org.testng.annotations.Test
    public  void testrefactor(){
        List<com.company.model.Item> items = new ArrayList<>();
       items.add(new com.company.model.EquippableItem("p","weapon","d",1,1,1,1,1,1,1));
        com.company.model.Inventory inventory = new com.company.model.Inventory(items,10);
        List<Item> equipments = new ArrayList<>();
        com.company.model.Equipment equipment = new com.company.model.Equipment(1,1,1,1,equipments);
        com.company.model.Player player = new com.company.model.Player("p",1,inventory, equipment,1,1,1,1,1,1,"w",1);
       showInventroy(player);
    }
    public static void showInventroy(com.company.model.Player player){
        AtomicInteger i = new AtomicInteger(1);
        player.getInventory().getItems().forEach(     (k) -> { k.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + k.getName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + k.getQuantity() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + k.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            if (k.getClass() == EquippableItem.class){
                if(((EquippableItem) k).getStrength() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + ((EquippableItem) k).getStrength() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            if (k.getClass() == EquippableItem.class){
                if (((EquippableItem) k).getDefense() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + ((EquippableItem) k).getDefense() + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            if (k.getClass() == EquippableItem.class) {
                if (((EquippableItem) k).getSpeed() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + ((EquippableItem) k).getSpeed() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        });
    }
}
