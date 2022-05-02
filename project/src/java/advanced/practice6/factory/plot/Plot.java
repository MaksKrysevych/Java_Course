package advanced.practice6.factory.plot;

public interface Plot {
}


class PlotImplementation implements Plot {
    String story;

    public PlotImplementation(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return story;
    }
}
