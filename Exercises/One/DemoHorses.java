package One;

/**
 * Created by jc321013 on 17/09/16.
 */
public class DemoHorses
{
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("BlackCaviar");
        horse1.setColor("black");
        horse1.setBirthYear(2016);
        horse2.setName("dave");
        horse2.setColor("pink");
        horse2.setBirthYear(2016);
        horse2.setRaces(7);
        System.out.println(horse1.getName() + " color is " +
                horse1.getColor() + " and raced in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " +
                horse2.getColor() + " and raced in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has raced " + horse2.getRaces() + " races.");
    }
}
