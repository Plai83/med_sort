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
        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
        medicine2.addComponent(asitr).addComponent(penicilinium);
        medicine3.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic).addComponent(asitr).
                addComponent(penicilinium);
        medList.add(medicine1);
        medList.add(medicine2);
        medList.add(medicine3);

        for(Medicine i: medList){
            System.out.println(i);
        }

        Collections.sort(medList);
        for(Medicine i: medList){
            System.out.println(i);
        }
    }
}
