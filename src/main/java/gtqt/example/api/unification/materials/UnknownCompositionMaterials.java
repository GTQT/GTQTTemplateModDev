package gtqt.example.api.unification.materials;

public class UnknownCompositionMaterials {
    //无组分材料
    //无任何前置的材料可以写在这里

    private static int startId = 8000;
    private static final int END_ID = startId + 2000;

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void init() {

    }
}
