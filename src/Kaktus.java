class Kaktus extends Växt{
    public Kaktus(String plantName, Double plantHeight) {
        super(plantName, plantHeight);
    }

    @Override
    public double water() {
        return 0.02; // 2 cl = 0.02liter
    }
    @Override
    public WaterType getWaterType() {
        return WaterType.MINERALVATTEN;
    }
}
