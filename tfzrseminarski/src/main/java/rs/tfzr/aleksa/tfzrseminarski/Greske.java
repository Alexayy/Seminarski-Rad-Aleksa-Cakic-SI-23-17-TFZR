package rs.tfzr.aleksa.tfzrseminarski;

public class Greske {
    public static int promenljiva1 = 10;
    public static int getPromenljiva2 = promenljiva1/0;

    public int printuj() {
        System.out.print(getPromenljiva2);
        return getPromenljiva2;
    }

    int aleksa = 5 + 4 * 3 / 2;
    int aleksa2 = (5 + 4) * (3 / 2);
    int aleksa3 = (5 + 4) * (3 / 2);
    int aleksa4 = (5 + (4 * 3) / 2);

    public void logickaGreksa() {
        System.out.println("Aleksa: " + aleksa + " // ");
        System.out.println("Aleksa2: " + aleksa2 + " // ");
        System.out.println("Aleksa3: " + aleksa3 + " // ");
        System.out.println("Aleksa4: " + aleksa4 + " // ");
    }

    def Sintaksicka_Greksa
            python_kod.os("sintaksa pythona")
            mesano.SaJsSintaksom(data => {
                Console.witeline("C#");
            }).then(uradiOvo, odbiOno);
}
