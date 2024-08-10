package Instance_Of_Operator;

import Section2_3.MountainBike;
import Section2_3.Bicicle;
import Section2_3.RoadBike;

public class InstanceOfTester

{
    public static void main(String[] args)

    {
        // MountainBike mb = new MountainBike();
        // RoadBike rb = new RoadBike();
        // Bicicle mb2 = new MountainBike();
        // Bicicle rb3 = new RoadBike();

        Bicicle[] bikes = new Bicicle[5];
        bikes[0] = new MountainBike("MD001", "CarbonIron", "MetalRadius", 20, 28, 25.0, "Soft");
        bikes[1] = new RoadBike("RB001", "Slim Carbon Iron", "Plastic Radius", 22, 24, 30.0, "PLug-in");

        for (Bicicle temp : bikes)

        {
            if (temp instanceof RoadBike) {

                System.out.println(temp);
            }
        }

    }

}
