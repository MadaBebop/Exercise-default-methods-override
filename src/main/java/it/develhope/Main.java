package it.develhope;

public class Main {
    public static void main(String[] args) {
        //Creo 4 smartphonePrice:
        //Producer
        SmartphonePrice p1 = new SmartphonePrice("Dollar", 250);
        SmartphonePrice p2 = new SmartphonePrice("Dollar", 350);
        //Retail
        SmartphonePrice r1 = new SmartphonePrice("Sterlin", 100);
        SmartphonePrice r2 = new SmartphonePrice("Franch", 150);

        //Creo 2 smartphone:
        //Producer
        Smartphone producer = new Smartphone("Nokia", "Aqua", 120, p1, p2);
        //Retail
        Smartphone retail = new Smartphone("Motorola", "Motor", 100, r1, r2);

        //Stampa dettagli degli smartphone
        System.out.println(producer.toString());
        System.out.println(retail.toString());

        //Stampa uguaglianza
        System.out.println("\nSono uguali i due telefoni?");
        System.out.println(producer.equals(retail));

        System.out.println("________________________________________________________\n");

        //Creiamo il clone
        Smartphone clone;
        try {
            clone = new Smartphone();
            clone = producer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.out); //?non sono sicuro
            //System.out.println("Stack trace: " + e.getMessage());
            throw new RuntimeException(e);
        }

        //Print Dettagli clone
        System.out.println(clone.toString());

        //Sono i due oggetti producer e cloned uguali?
        System.out.println("\nSono clone (di producer) e producer uguali?");
        System.out.println( producer.equals(clone));

    }
}