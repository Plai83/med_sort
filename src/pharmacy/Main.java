package pharmacy;
import pharmacy.impl.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MedicineComponent asitr = new Asitromin("Asitro", 50, 70);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
//        Medicine medicine1 = new Medicine();
        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
        for (MedicineComponent component: medicine1) {
            System.out.println(component);
        }

//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }
    }
}
