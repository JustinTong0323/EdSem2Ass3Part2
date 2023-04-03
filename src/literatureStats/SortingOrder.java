package literatureStats;

public enum SortingOrder {
    // 01/04/2023 order and some values updated
    NORMAL(false),
    DESCENDING(true),
    ASCENDING(false),
    REVERSED(true),
    NOT_REVERSED(false);
    final boolean reversed = false; // TODO: Initialise this elsewhere

    /**
     * TODO: constructor.
     *  Ensure the class variable is initialised.
     *
     *  @param reversed
     */
    SortingOrder(boolean reversed) {
    }

    /**
     * TODO: isReversed() checks whether the named sort order is reversed
     *
     * @return
     */
    public boolean isReversed() {
        return false;
    }
}
