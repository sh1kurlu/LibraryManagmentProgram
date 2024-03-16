package week08;

import java.util.*;


public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println("toString method:");
        System.out.println(list1.toString());

        System.out.println("For loop");
        for(int i = 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        System.out.println("Enhanced for loop:");
        for(Integer num: list1){
            System.out.println(num);
        }

        System.out.println("Iterator:");
        Iterator it = list1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        List <String> shoppingList = new ArrayList<String>();

        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("breah");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println("toString method with new list:");
        System.out.println(shoppingList.toString());
        
        System.out.println("For loop with new list:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        System.out.println("Enhanced for loop with new list:");
        for (String item : shoppingList) {
            System.out.println(item);
        }
        
        System.out.println("Iterator with new list:");
        Iterator<String> iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        shoppingList.remove("bread");
        
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        
        System.out.println(newShoppingList.toString());
        
        if (newShoppingList.contains("tea")) {
            System.out.println("The element \"tea\" exists in the newShoppingList.");
        } else {
            System.out.println("The element \"tea\" does not exist in the newShoppingList.");
        }
        
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
       
        
        newLinkedList.addAll(newShoppingList);
        
        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());
        
        newLinkedList.removeLast();
        System.out.println(newLinkedList.toString());


  
    
    }      

}
