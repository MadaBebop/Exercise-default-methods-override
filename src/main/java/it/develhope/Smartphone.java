package it.develhope;

public class Smartphone implements Cloneable {
    String brandName;
    String modelName;
    int batterymAh;

    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    //Constructor vuoto
    public Smartphone() {}

    //Constructor
    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        //SmartphonePrice details
        return "Brand Name: " + brandName +
                " Model Name: " + modelName +
                " Battery: " + batterymAh +
                producerPrice.toString() +
                retailPrice.toString();
    }

    @Override
    public int hashCode() {
        //We create our personal hash code
        //The 17 and 31 hash code idea is from the classic Java book – effective Java : item 9
        int result = 17;
        result = 31 * result + brandName.hashCode();
        result = 31 * result + batterymAh;
        result = 31 * result + modelName.hashCode();
        return result;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if( !(obj instanceof Smartphone) || obj == null) {   //35-38 vediamo se non sono identici o null
            return false;
        }

        Smartphone tmp = (Smartphone)obj;
        //Controlliamo se sono uguali oltre che identici
        return brandName == tmp.brandName &&
                modelName == tmp.modelName &&
                batterymAh == tmp.batterymAh &&
                producerPrice.equals(tmp.producerPrice) &&
                retailPrice.equals(tmp.retailPrice);
        }


    //Overload (L'esercizio dice: the return value is a Smartphone object. Quindi non effettuiamo un override)
    protected Smartphone clone() throws CloneNotSupportedException {
        //Creiamo l'oggetto Smartphone
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        //Diamo gli stessi dati di quello precedente
        clonedSmartphone.brandName = brandName;
        clonedSmartphone.modelName = modelName;
        clonedSmartphone.batterymAh = batterymAh;
        //Ritorniamo l'oggetto clonedSmartphone
        return clonedSmartphone;
    }

}
