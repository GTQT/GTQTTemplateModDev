package gtqt.example.api.unification.materials;

public class ElementMaterials {
    //Elements文件中注册的元素符号在此处注册单质

    private static int startId = 0;
    private static final int END_ID = startId + 200;

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void register() {

    }
}
