/*
* Truck Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-25
*/

/**
 * Truck Class.
 */
public class Truck extends Vehicle {
    /**
     * License Plate.
     */
    private String licensePlate;

    /**
     * Vehicle constructor.
     *
     * @param colour - the colour
     * @param licensePlate - the license Plate
     * @param maxSpeed - the maximum speed of the vehicle
     * @param numTires - the number of tires.
     */
    public Truck(
        String colour,
        String licensePlate,
        int maxSpeed,
        int numTires) {
        super(colour, maxSpeed, numTires);
        this.licensePlate = licensePlate;
    }

    /**
     * The status() function.
     *
     * <p>
     * Shows the status and properties of the vehicle
     * </p>
     */
    public void status() {
        System.out.println(
            String.format("%s\n%s\n%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(super.getSpeed()),
                "       --> MaxSpeed: " + String.valueOf(super.getMaxSpeed()),
                "       --> License Plate: " + this.licensePlate,
                "       --> Color: " + super.getColor(),
                "       --> Number of tires: " + super.getTires())
        );
    }

    /**
     * The getLicense() function.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * The setLicensePlate() function.
     *
     * @param licensePlate - The license plate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * The provideAir() function.
     *
     * @param airPressure - the air pressure.
     */
    public void provideAir(int airPressure) {
        super.setSpeed(super.getSpeed() - airPressure / 2);

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
