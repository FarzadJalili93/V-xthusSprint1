import java.util.Scanner;

public class VäxthotellGreenest {
    public static void main(String[] args) {

        Växt[] växter = {    //en array som innehåller olika typer av växter med specifika namn och hur mycket vatten som behövs
                new Palmer("Laura", 5.0),
                new KöttätandeVäxt("Meatloaf", 0.7),
                new Kaktus("Igge", 0.2),
                new Palmer("Olof", 1.0)
        };


        findPlant(växter);


    }


    private static void findPlant(Växt[] växter) {  //den här metoden tar arrayen av Växt objects som paramter som tillåter användaren att skriva in namnet på en växt och få information om den.
        System.out.println("Vilken växt ska få mat? "); //recuirsive KOLLA DET HÄR
        Scanner scanner = new Scanner(System.in); //den använder en scanner för att läsa input för växtNamn
        String växtNamn = scanner.nextLine();

        boolean foundPlant = false; // den itarerar sedan igenom arrayen av växter och kollar ifall input matchar några växter i ett case sensisite sätt
        for (Växt växt : växter) {  // om den hittar en matchiung så skrivs ut information om plantan som hur mycket OCH vilket typ av vätska den ska få.
            if (växtNamn.equalsIgnoreCase(växt.getPlantName())) { // om den inte hittar någon matchnings så ber den användaren att skriva in på nytt och använder en recursive funktion (findplant) för att retrya.
                System.out.println(växt.getPlantName() + " Ska få :" + växt.water() + " liter vätska.");

                WaterType WaterType = växt.getWaterType();
                System.out.println("Ge växten " + WaterType + ".");

                foundPlant = true;
                System.out.println();
                break;

            }

        }
        if (!foundPlant) {
            System.out.println("Angiven växt hittades ej, ange ny växt");
            findPlant(växter);
        }
        scanner.close();
    }
}
