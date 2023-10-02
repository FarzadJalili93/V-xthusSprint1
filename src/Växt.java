abstract class Växt implements VäxtInterface {
    protected String plantName; //protected gör så att externa källor inte kan komma åt variablerna.
    protected Double plantHeight;

    public Växt(String plantName, Double plantHeight) {
        this.plantName = plantName;
        this.plantHeight = plantHeight;
    }
    public String getPlantName() {
        return plantName;
    }


    public WaterType getWaterType() {
        return WaterType.VANLIGT_VATTEN;
    }
}
