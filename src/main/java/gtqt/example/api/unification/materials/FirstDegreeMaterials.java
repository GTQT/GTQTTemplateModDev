package gtqt.example.api.unification.materials;

public class FirstDegreeMaterials {
    //第一类材料
    //通常为基本元素组成的化合物，其组分为已注册的单质

    private static int startId = 200;
    private static final int END_ID = startId + 1800;

    public FirstDegreeMaterials() {
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
