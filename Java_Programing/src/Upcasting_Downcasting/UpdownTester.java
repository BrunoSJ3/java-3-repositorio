package Upcasting_Downcasting;

import Section2_3.Bicicle;
import Section2_3.MountainBike;

public class UpdownTester

{
    public static void main(String[] args)

    {
        // upper casting
        Bicicle mb = (Bicicle) new MountainBike("MD001", "CarbonIron", "MetalRadius", 20, 28, 25.0, "Soft");

        System.out.println(mb);

        // downcasting
        System.out.println(((MountainBike) mb).getSuspensionType());
    }
}
