package advanced.practice6.startegy.cards;

import advanced.practice6.factory.plot.Named;

public interface Card extends Named {
}

class CardImplementation implements Card {

    private String name;

    CardImplementation(final String name) {
        this.name = name;
    }

    CardImplementation(final int name) {
        this(Integer.toString(name));
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

