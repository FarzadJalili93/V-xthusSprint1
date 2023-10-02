 class Palmer extends Växt{
     public Palmer(String plantName, Double plantHeight) {
         super(plantName, plantHeight);
     }


     public double water() {
         return 0.5 * plantHeight;
     }
     @Override
     public WaterType getWaterType() {
         return WaterType.KRANVATTEN;
     }
 }
