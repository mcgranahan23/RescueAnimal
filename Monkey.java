
public class Monkey extends RescueAnimal {
    // Instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;
    // Constructor
    public Monkey(String name, String species, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, String tailLength,
                  String height, String bodyLength, String animalType) {

        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAnimalType(animalType);
    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }

    // Mutator Method
    public void setSpecies(String mSpecies) {
        species = mSpecies;
    }

    public String getTailLength() {
        return tailLength;
    }


    public void setTailLength(String tLength) {
        tailLength = tLength;
    }
    public String getHeight() {
        return height;
    }


    public void setHeight(String mHeight) {
        height = mHeight;
    }
    public String getBodyLength() {
        return bodyLength;
    }


    public void setBodyLength(String bLength) {
        bodyLength = bLength;
    }






}
