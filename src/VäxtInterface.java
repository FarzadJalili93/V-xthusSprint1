public interface VäxtInterface { 

    double water(); //metoden är declarerad utan kropps vilket innebär att den är abstrakt och måste implementeras i varje class som implementera växtinferface.
    //den här metoden ska returnera ett double värde i vårat fall är det vätske behovet för våra växter.
   WaterType getWaterType();  // också abstrakt och ska implementeras i andra classer. Den returnera ett objekt av typ ¨WaterType" vilket är vilken sort av vätska får våra växter.
   // Vi använder oss av interfacet är för att alla klasser som implementera interfacet måste implementera våra två metoder.
}


