package com.company;

import static com.company.Functionable.*;

public class Main {

    public static void main(String[] args) {

        HomeElectricalAppliances homeElectricalAppliances=new HomeElectricalAppliances("electrolamp Sony","notebook Asus",100,170);
        homeElectricalAppliances.onOfElectroLamp(true);
        homeElectricalAppliances.electrocityOrBattery(true);
        homeElectricalAppliances.onOfNotebook(true);
        System.out.println(homeElectricalAppliances.allCon());
        System.out.println(homeElectricalAppliances);



    }
}
