package com.company;

public class KitchenAppliances extends HomeElectricalAppliances{
    private String electricKettle;
    private String blender;
    private int consumptionElectricKettle=2000;
    private int consumptionBlender=250;

    KitchenAppliances(String electricKettle, String blender) {
        super(electricKettle, blender);
    }

}
