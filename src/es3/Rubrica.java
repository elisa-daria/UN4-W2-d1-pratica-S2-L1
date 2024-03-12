package es3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

    static Map<String,String>rubrica=new HashMap<>();

    public Rubrica() {
    }

    //first method adding Contacts
    static void addContact(String name,String phoneN){
        rubrica.put(name,phoneN);
    }

    //second method removing Contact by name
    static void removeContact(String name){
        rubrica.remove(name);
    }
    //third method finding a Contact by phone-number
    static void findContactByPhone(String phoneN) {
        String contact;
        for (String name : rubrica.keySet()) {
            if (phoneN.equals(rubrica.get(name))) {
                contact = name;
                System.out.println("il contatto del numero è: "+contact);
            }
        }
    }
    //fourth method finding a Contact by name
    static void findContactByName(String name) {
        String contact= rubrica.get(name);
                System.out.println("il numero di "+name+" è: "+contact);
    }

    //fifth method print contacts
    static void printThemAll(){
        for(String name: rubrica.keySet()){
            System.out.println("Contatto: "+name+" Numero: "+rubrica.get(name));
        }
    }


        public static void main (String[]args){
            addContact("Elisa", "123456789");
            addContact("Ciaone", "789456123");
            addContact("Jane Doe","7888888888");
            addContact("John Doe","888888888");
            System.out.println(rubrica.toString());
            removeContact("Ciaone");
            System.out.println(rubrica.size());
            findContactByPhone("123456789");
           findContactByName("Elisa");
           printThemAll();



        }
    }
