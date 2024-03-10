package pharmacy;
import pharmacy.impl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        ArrayList<MedicineComponent> medList = new ArrayList<>();
        ArrayList<Medicine> medList = new ArrayList<>();
        MedicineComponent asitr = new Asitromin("Asitro", 50, 70);
        MedicineComponent penicilinium = new Penicilinium("Penicil", 30, 25);
        MedicineComponent vetbic = new Vetbicid("Vetbic", 40, 30);
        MedicineComponent vetbic1 = new Vetbicid1("Vetbic1", 275, 317);

        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();
        Medicine medicine4 = new Medicine();

        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

        medicine2.addComponent(asitr).addComponent(penicilinium).addComponent(asitr).addComponent(penicilinium).addComponent(vetbic).addComponent(asitr).
                addComponent(penicilinium);

        medicine3.addComponent(vetbic1);

        medicine4.addComponent(asitr).addComponent(penicilinium);

        medList.add(medicine2);
        medList.add(medicine1);
        medList.add(medicine3);
        medList.add(medicine4);

        for(Medicine i: medList){
            System.out.println(i);
        }


        System.out.println("------------Сортировка по общей силе компонентов--------------------");

        Collections.sort(medList);

        for(Medicine i: medList){
            System.out.println(i);
        }

        System.out.println("--------------Сортировка по общему весу компонентов------------------");

        Collections.sort(medList, (med1, med2) -> (int) (med1.getAllWeight() - med2.getAllWeight()));

        for(Medicine i: medList){
            System.out.println(i);
        }

        System.out.println("----------------Сортировка по размеру листа компонентов----------------");

        Collections.sort(medList, (med1, med2) -> (med1.getSize() - med2.getSize()));

        for(Medicine i: medList){
            System.out.println(i);
        }
    }
}
