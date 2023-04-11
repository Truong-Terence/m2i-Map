package org.example;

import java.util.HashMap;

import static org.example.Region.*;

public class Main {
    public static void main(String[] args) {
//        a)
        HashMap<User, String> notebook = new HashMap<User, String>();
        User boris = new User("Boris", Region.FRANCE);
        User arthur = new User("Arthur", INDONESIE);
        notebook.put(boris, "0680000000");
        notebook.put(arthur, "0607070606");
        notebook.put(new User("Thibault", MARTINIQUE), "0605000005");
        notebook.put(new User("Estelle", POLYNESIE), "0700000700");

//        b)
        System.out.println("Téléphone d'Arthur : " + notebook.get(arthur));
//        c)
        for (HashMap.Entry<User, String> entry : notebook.entrySet()) {
            User user = entry.getKey();
            System.out.println("Nom : " + user.getFirstName() + " => Téléphone : " + entry.getValue());
        }
//        d)
        notebook.put(boris, "0799999907");
            System.out.println("\nCarnet à jour :");
        for (HashMap.Entry<User, String> entry : notebook.entrySet()) {
            User user = entry.getKey();
            System.out.println("Nom : " + user.getFirstName() + " => Téléphone : " + entry.getValue());
        }
//        e)
        DisplayNotebook(notebook);
    }
    public static void DisplayNotebook(HashMap<User, String> notebook) {
        System.out.println("\nCarnet à jour :");
        for (HashMap.Entry<User, String> hm : notebook.entrySet()) {
            User user = hm.getKey();
            String numero = hm.getValue();
            numero = formatNum(numero);
            System.out.println("Nom : " + user.getFirstName() + " => Téléphone : " + user.getRegion() + "(" + numero.charAt(0) + ")" + numero.substring(1, 14));
        }
    }

    public static String formatNum(String numero) {
        StringBuilder sb = new StringBuilder(numero);
        for (int i = 2; i < sb.length(); i += 3) {
            sb.insert(i, ".");
        }
        return sb.toString();
    }
}