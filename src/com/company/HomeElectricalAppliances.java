package com.company;

import java.util.Objects;

public class HomeElectricalAppliances implements Functionable {

    private String electroLamp;
    private String notebook;
    private int consumptionElectroLamp;
    private int consumptionNotebook;
    boolean switchOn;
    boolean switchOn1;

    boolean runsOnElectricityOrLamp;

    private int allConsumption;

    public HomeElectricalAppliances(String electroLamp, String notebook, int consumptionElectroLamp, int consumptionNotebook) {
        this.electroLamp = electroLamp;
        this.notebook = notebook;
        this.consumptionElectroLamp = consumptionElectroLamp;
        this.consumptionNotebook = consumptionNotebook;
    }


    public HomeElectricalAppliances(String electricKettle, String blender) {

    }


    public boolean onOfElectroLamp(boolean switchOn) {
        if (switchOn == true) {
            System.out.println(electroLamp + " switched ON");

        } else {
            System.out.println(electroLamp + " switched OFF");
        }
        return switchOn;
    }

    public boolean onOfNotebook(boolean switchOn1) {
        if (switchOn1 == true) {
            System.out.println(notebook + " switched ON");
        } else {
            System.out.println(notebook + " switched OFF");
        }
        return switchOn1;
    }

    public boolean electrocityOrBattery(boolean runsOnElectricityOrBattery) {
        if (runsOnElectricityOrBattery == true && onOfNotebook(true)) {
            consumptionNotebook = 170;
        } else consumptionNotebook = 0;
        return runsOnElectricityOrBattery;
    }

    public   int allCon() {
        if (electrocityOrBattery(true)==true) {
            allConsumption = consumptionNotebook+consumptionElectroLamp;
            System.out.println(allConsumption);
        } else allConsumption = 0;
        System.out.println(allConsumption);
        return allConsumption;
    }

    @Override
    public String toString() {
        return "HomeElectricalAppliances{" +
                "electroLamp='" + electroLamp + '\'' +
                ", notebook='" + notebook + '\'' +
                ", consumptionElectroLamp=" + consumptionElectroLamp +
                ", consumptionNotebook=" + consumptionNotebook +
                ", allConsumption=" + allConsumption +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeElectricalAppliances)) return false;
        HomeElectricalAppliances that = (HomeElectricalAppliances) o;
        return consumptionElectroLamp == that.consumptionElectroLamp && consumptionNotebook == that.consumptionNotebook && allConsumption == that.allConsumption && Objects.equals(electroLamp, that.electroLamp) && Objects.equals(notebook, that.notebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(electroLamp, notebook, consumptionElectroLamp, consumptionNotebook, allConsumption);
    }
}
