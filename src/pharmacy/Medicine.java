package pharmacy;

import java.util.*;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components;
    private int index;
    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public float getAllWeight() {
        float allWeight = 0;
        for (Medicine it = this; it.hasNext(); ) {
            MedicineComponent i = it.next();
            allWeight += i.getWeight();
        }
        return allWeight;
    }

    public int getAllPower() {
        int allPower = 0;
        for (Medicine it = this; it.hasNext(); ) {
            MedicineComponent i = it.next();
            allPower += i.getPower();
        }
        return allPower;
    }

    public int getSize() {
        int size = 0;
        for (Medicine it = this; it.hasNext(); ) {
            MedicineComponent i = it.next();
            size += 1;
        }
        return size;
    }

    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return components.size() > index;
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine o) {
        return Integer.compare(this.getAllPower(), o.getAllPower());
    }

}
