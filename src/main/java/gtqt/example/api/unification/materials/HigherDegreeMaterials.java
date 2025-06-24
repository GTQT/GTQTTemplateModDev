package gtqt.example.api.unification.materials;

public class HigherDegreeMaterials {
    //第三类材料
    //通常为需求前两类化合物组成的复合化合物或者混合物

    private static int startId = 4000;
    private static final int END_ID = startId + 2000;

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void register() {

    }
}
