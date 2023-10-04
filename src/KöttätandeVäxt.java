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
//Sammanfattningsvis representerar klassen KöttätandeVäxt en köttätande växt och ärver egenskaper
// från den övergripande Växt-klassen. Den specificerar sin egen logik för att beräkna mängden vatten
// som behövs och överskuggar metoden getWaterType för att specificera en särskild vattentyp
// för denna typ av växt (WaterType.PROTEINDRYCK).