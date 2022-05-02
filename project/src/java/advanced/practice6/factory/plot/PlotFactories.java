package advanced.practice6.factory.plot;

public class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return new PlotFactoryImplementation("%0 is great. %0 and %1 love each other. %2 interferes with their happiness but loses in the end."
                ,hero ,beloved ,villain);
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        String str = "%0 feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - %1. "+
                "%0 stands up against it, but with no success at first.But putting self together and help of friends, "+
                "including spectacular funny %2 restore the spirit and %0 overcomes the crisis and gains gratitude and respect";

        return new PlotFactoryImplementation(str
                ,hero,epicCrisis,funnyFriend);
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {


        String str = "%1 threatens the world. " +
                "But %0 on guard. So, no way that intrigues of %2 overcome the willpower of inflexible heroes";

        return new PlotFactoryImplementation(str, heroes, epicCrisis, villain);
    }
}
