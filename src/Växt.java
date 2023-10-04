abstract class Växt implements VäxtInterface {
    protected String plantName; //protected gör så att externa källor inte kan komma åt variablerna.
    protected Double plantHeight;

    public Växt(String plantName, Double plantHeight) {
        this.plantName = plantName;
        this.plantHeight = plantHeight;
    }
    public String getPlantName() { // method som returnera plantname variablen, tillåter andra
        // klasser/subklasser att använda plant namn.
        return plantName;
    }


    public WaterType getWaterType() { // method som returnera default vatten typen för växten.
        // subklasser kan overrida detta med sina specifika vattentyper
        return WaterType.VANLIGT_VATTEN;
    }
}

// Sammanfattningsvis är klassen Växt en basklass som representerar en växt. Den har skyddade instansvariabler
// för växtens namn och höjd, en konstruktor för att initialisera dessa variabler och
// metoder för att hämta växtens namn och standardvattentyp. Metoden getWaterType returnerar
// en standardvattentyp (WaterType.VANLIGT_VATTEN), men subklasser kan åsidosätta denna metod för att
// ange olika vattentyper baserat på växttypen.