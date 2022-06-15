//
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
//import static main.com.company.service.InventoryService.compareItems;
//import static main.com.company.service.InventoryService.createItem;
//import static main.com.company.view.ShopView.buyingAndSelling;
//
//public class Test {
//   @org.testng.annotations.Test
//    public  void testrefactor(){
//        List<Item> items = new ArrayList<>();
//       items.add(new EquippableItem("p","weapon","d",1,1,1,1,1,1,1));
//        Inventory inventory = new Inventory(items,10);
//        List<EquippableItem> equipments = new ArrayList<>();
//        Equipment equipment = new Equipment(1,1,1,1,equipments);
//        Player player = new Player("p",1,inventory, equipment,1,1,1,1,1,1,"w",1);
//        shopping(player,1);
////       showInventroy(player);
//    }
//    public static void showInventroy(Player player){
//        AtomicInteger i = new AtomicInteger(1);
//        player.getInventory().getItems().forEach(     (k) -> { k.setIndex(i.intValue());
//            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
//                    + k.getName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + k.getQuantity() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
//                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + k.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
//            if (k.getClass() == EquippableItem.class){
//                if(((EquippableItem) k).getStrength() != 0) {
//                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + ((EquippableItem) k).getStrength() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
//                }
//            }
//            if (k.getClass() == EquippableItem.class){
//                if (((EquippableItem) k).getDefense() != 0) {
//                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + ((EquippableItem) k).getDefense() + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
//                }
//            }
//            if (k.getClass() == EquippableItem.class) {
//                if (((EquippableItem) k).getSpeed() != 0) {
//                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + ((EquippableItem) k).getSpeed() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
//                }
//            }
//            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
//        });
//    }
//    public static void shopping(Player player, int value) {
//        List<Item> items = new ArrayList<>(200);
//        Inventory shopInventory = new Inventory(items, 200);
//        for (int i = 0; i < 100; i++) {
//            Item newItem = createItem();
//            if (compareItems(shopInventory.getItems(), newItem)){
//                String name = newItem.getName();
//                items.stream().filter(z -> z.getName().equals(name)).forEach( x -> x.setQuantity(x.getQuantity()+1));
//            }
//            //shopInventory.getItems().items.replace(newItem, items.get(newItem) + 1);
//            else items.add(newItem);
//            newItem.setQuantity(1);
//            shopInventory.setItems(items);
//            shopInventory.setCapacity(shopInventory.getCapacity() - 1);
//        }
//        if (value != 1) buyingAndSelling(shopInventory, player, 2);
//        else buyingAndSelling(shopInventory, player, 1);
//    }
//}
