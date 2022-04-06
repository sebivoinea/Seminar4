package main;

import prototype.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a1 = new Autobuz("Gigel");
        Autobuz a2 = (Autobuz) a1.copiaza();
        a2.setNumeSofer("Andrei");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
