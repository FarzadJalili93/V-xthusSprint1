 class KöttätandeVäxt extends Växt{
     public KöttätandeVäxt(String plantName, Double plantHeight) {
         super(plantName, plantHeight);
     }

     @Override
     public double water() {
         double baseProtein = 0.1;
         double extraProtein = 0.2 * plantHeight;
         return baseProtein + extraProtein;
     }
     @Override
     public WaterType getWaterType() {
         return WaterType.PROTEINDRYCK;
     }
 }
