
public class Vehicle
{
    private String manufacturer;
    private int cylinders;
    private Person owner = new Person();

    // Constructors.
    // Default: no parameters are specified.
    // All other constructors: at least a manufacturer's or owner's
    // name is required.

    public Vehicle()
    {
        manufacturer = "None";
        cylinders = 0;
        owner.setName("None");
    }

    public Vehicle (String aBrand)
    {
        manufacturer = aBrand;
        cylinders = 0;
        owner.setName("None");
    }

    public Vehicle (String aBrand, int banger)
    {
        manufacturer = aBrand;
        cylinders = banger;
        owner.setName("None");
    }

    public Vehicle (Person theOwner)
    {
        manufacturer = "None";
        cylinders = 0;
        owner.setName(theOwner.getName());
    }

    public Vehicle (Person theOwner, int banger)
    {
        manufacturer = "None";
        cylinders = banger;
        owner.setName(theOwner.getName());
    }

    public Vehicle (Person theOwner, String brand)
    {
        manufacturer = brand;
        cylinders = 0;
        owner.setName(theOwner.getName());
    }

    public Vehicle (Person theOwner, String brand, int banger)
    {
        manufacturer = brand;
        cylinders = banger;
        owner.setName(theOwner.getName());
    }

    // Methods to write values:

    // Write all values

    public void writeOutput()
    {
        System.out.println("Owner: " + owner.getName());
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number of cylinders: " + cylinders);
    }

    public void writeOwnerName()
    {
        System.out.println("Owner: " + owner.getName());
    }

    public void writeManufacturer()
    {
        System.out.println("Manufacturer: " + manufacturer);
    }

    public void writeCylinders()
    {
        System.out.println("Number of cylinders: " + cylinders);
    }

    // Methods to change values of parameters.

    public void set(Person newOwner, String newBrand, int newCylinders)
    {
        owner.setName(newOwner.getName());
        manufacturer = newBrand;
        cylinders = newCylinders;
    }

    public void setOwner(Person newOwner)
    {
        owner.setName(newOwner.getName());
    }

    public void setManufacturer(String newBrand)
    {
        manufacturer = newBrand;
    }

    public void setCylinders(int newCylinders)
    {
        cylinders = newCylinders;
    }

    // Methods to return parameter values.

    public Person getOwner()
    {
        return owner;
    }

    public String getOwnerName()
    {
        return owner.getName();
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    // equals method

    public boolean equals(Vehicle otherVehicle)
    {
        return(owner.hasSameName(otherVehicle.getOwner())
            && cylinders == otherVehicle.getCylinders()
            && manufacturer.equalsIgnoreCase(
                                otherVehicle.getManufacturer()));
    }
}
