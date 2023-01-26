package Console;

public class WonderFragment {

    public final Wonder wonder; // implicit parent

    // example: images/wonders/alexandrie/piece-back-alexandrie-1.png
    public final String frontImageResource;
    public final String backImageResource;

    public final int materialRequiredCount;
    public final boolean sameMaterial;
    public final boolean triggerEffect;
    public final int trophyCount;
    public final int heightLevel;

    public WonderFragment(Wonder wonder, String frontImageResource, String backImageResource, int materialRequiredCount, boolean sameMaterial, boolean triggerEffect, int trophyCount, int heightLevel) {
        this.wonder = wonder;
        this.frontImageResource = frontImageResource;
        this.backImageResource = backImageResource;
        this.materialRequiredCount = materialRequiredCount;
        this.sameMaterial = sameMaterial;
        this.triggerEffect = triggerEffect;
        this.trophyCount = trophyCount;
        this.heightLevel = heightLevel;
    }
}