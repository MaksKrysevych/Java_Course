package advanced.practice6.factory.plot;

public interface PlotFactory {
    Plot plot();
}

class PlotFactoryImplementation implements PlotFactory {
    Plot plot;

    public PlotFactoryImplementation(String story, Named hero, Named beloved, Named villain) {
        story = story.replace("%0", hero.name());
        story = story.replace("%1", beloved.name());
        story = story.replace("%2", villain.name());
        this.plot = new PlotImplementation(story);
    }

    public PlotFactoryImplementation(String story, Named[] heroes, Named beloved, Named villain) {
        String heroesDescribe = "";
        for (int i = 0; i < heroes.length; i++) {
            if (i == 0)
                heroesDescribe += "brave " + heroes[i].name();
            else heroesDescribe += ", brave " + heroes[i].name();
        }

        story = story.replace("%0", heroesDescribe);
        story = story.replace("%1", beloved.name());
        story = story.replace("%2", villain.name());
        this.plot = new PlotImplementation(story);
    }

    @Override
    public Plot plot() {
        return plot;
    }
}

