package gtqt.example.api.unification.materials;

public class SecondDegreeMaterials {
    //第二类材料
    //通常为混合物品或者由不同化合物组成的符合化合物

    private static int startId = 2000;
    private static final int END_ID = startId + 2000;

    public SecondDegreeMaterials() {
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void register() {

    }
}
