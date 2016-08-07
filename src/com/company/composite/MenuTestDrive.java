package com.company.composite;

/**
 * Created by GP on 4/23/2016.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Sauce",
                true,
                3.89
        ));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Appple Pie",
                "Apple pie with flakey crust",
                true,
                1.59
        ));

//        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();

        CompositeIterator iterator = new CompositeIterator(allMenus.createIterator());
        while(iterator.hasNext()) {
            MenuComponent component = (MenuComponent)iterator.next();
            Waitress waitress = new Waitress(component);
            waitress.printVegetarianMenu();
        }
    }

}
