package Three;
import java.util.*;

/**
 * Created by jc321013 on 17/09/16.
 */

public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(00);
        item1.setDescription("10 litre tank");
        item1.setPrice(10);
        item2.setInvoiceNumber(11);
        item2.setDescription("fish bowl");
        item2.setPrice(20);
        pet1.setInvoiceNumber(22);
        pet1.setDescription("cat");
        pet1.setPrice(100);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoiceNumber(22);
        pet2.setDescription("dog");
        pet2.setPrice(120);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}