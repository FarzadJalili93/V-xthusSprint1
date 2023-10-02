import java.util.Scanner;

public class VäxthotellGreenest {
    public static void main(String[] args) {

        Växt[] växter = {
                new Palmer("Laura", 5.0),
                new KöttätandeVäxt("Meatloaf", 0.7),
                new Kaktus("Igge", 0.2),
                new Palmer("Olof", 1.0)
        };


        findPlant(växter);


    }


    private static void findPlant(Växt[] växter) {
        System.out.println("Vilken växt ska få mat? "); //recuirsive KOLLA DET HÄR
        Scanner scanner = new Scanner(System.in);
        String växtNamn = scanner.nextLine();

        boolean foundPlant = false;
        for (Växt växt : växter) {
            if (växtNamn.equalsIgnoreCase(växt.getPlantName())) {
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
