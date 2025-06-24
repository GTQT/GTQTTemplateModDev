package gtqt.example.api.unification;


import gtqt.example.api.unification.materials.*;

public class GTQTExampleMaterials {

    public GTQTExampleMaterials() {
    }

    public static void register() {

        ElementMaterials.register();
        FirstDegreeMaterials.register();
        SecondDegreeMaterials.register();
        HigherDegreeMaterials.register();
        UnknownCompositionMaterials.init();
        MaterialPropertyAddition.init();
        MaterialFlagAddition.init();
    }

}
