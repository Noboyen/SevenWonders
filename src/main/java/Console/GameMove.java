package Console;


import lombok.AllArgsConstructor;


public class GameMove {
    @AllArgsConstructor
    public static class BuildWonderFragUsingCardsGameMode extends GameMove {
        public final WonderFragment wonderFragment;
        public final ImmutableMaterialCardByTypeCounts cardsUsed;
    }
}
