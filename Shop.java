package DZ6;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements ICreatePhone {

    private ArrayList<Telefon> listTelefon;

    @Override
    public ArrayList<Telefon> create(ArrayList<Telefon> listTelefon) {

        Telefon nokia = new Telefon("Nokia", "3310", 6.14, 4500, "Android", 12000);
        Telefon samsung = new Telefon("Samsung", "5460", 5.5, 3000, "Android", 22000);
        Telefon apple = new Telefon("Apple", "13Pro", 6.14, 2500, "iOS", 100000);
        Telefon oppo = new Telefon("Oppo", "120+", 5.45, 6000, "Android", 54000);

        listTelefon.add(nokia);
        listTelefon.add(samsung);
        listTelefon.add(apple);
        listTelefon.add(oppo);

        return listTelefon;
    }

}



