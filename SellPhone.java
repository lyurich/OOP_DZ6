package DZ6;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SellPhone implements ISellPhone {

    public static ArrayList<Telefon> sell(ArrayList<Telefon> listTelefon) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();

        ArrayList<Telefon> templist = new ArrayList<>();

        for (Telefon telefon : listTelefon) {
            if (!buyPhone.equals(telefon.getNameFactory())) {
                templist.add(telefon);
            }
        }
        listTelefon.clear();
        listTelefon.addAll(templist);
        return listTelefon;
    }
}
