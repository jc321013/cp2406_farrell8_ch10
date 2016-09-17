package Two;

/**
 * Created by jc321013 on 17/09/16.
 */
public class DemoCandles {

        public static void main(String args[])
        {
            Candle aCandle = new Candle();
            ScentedCandle aScentedCandle = new ScentedCandle();
            aCandle.setColor("yellow");
            aCandle.setHeight(1);
            aScentedCandle.setColor("pink");
            aScentedCandle.setScent("lavander");
            aScentedCandle.setHeight(6);
            System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
                    " candle costs $" + aCandle.getPrice());
            System.out.println("The " + aScentedCandle.getHeight() + " inch " +
                    aScentedCandle.getScent() +
                    " " + aScentedCandle.getColor() +
                    " candle costs $" + aScentedCandle.getPrice());
        }
    }


