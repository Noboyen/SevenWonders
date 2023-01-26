package com.example.sevenwonders;



public class GameMove {

    public static class BuildWonderFragUsingCardsGameMode extends GameMove {
        public final WonderFragment wonderFragment;
        public final ImmutableMaterialCardByTypeCounts cardsUsed;

        public BuildWonderFragUsingCardsGameMode(WonderFragment wonderFragment, ImmutableMaterialCardByTypeCounts cardsUsed) {
            this.wonderFragment = wonderFragment;
            this.cardsUsed = cardsUsed;
        }
    }
}
