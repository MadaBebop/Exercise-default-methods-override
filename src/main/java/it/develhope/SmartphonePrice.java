package it.develhope;

import java.util.HashMap;

public class SmartphonePrice implements Cloneable{
    //Variabili
    String priceType;
    int priceInEuros;

    //Costruttore
    public SmartphonePrice(String priceType, int priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }


    @Override
    public String toString() {
        return "\nSP----> PriceType: " + priceType + ", PriceInEuros: " + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if( !(obj instanceof SmartphonePrice) || obj == null) {   //vediamo se non sono identici o null
            return false;
        }
        return ((SmartphonePrice) obj).priceType == priceType && ((SmartphonePrice) obj).priceInEuros == priceInEuros;  // Controlliamo le due variabili di smartphonePrice
    }

    @Override
    public int hashCode() {
        //Sempre hashcode personale (Algoritmo uguale a quello di Smartphone)
        int result = 17;
        result = 31 * result + priceType.hashCode();
        result = 31 * result + priceInEuros;
        return result;
    }

}
