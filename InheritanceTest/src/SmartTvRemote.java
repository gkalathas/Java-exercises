public interface SmartTvRemote extends TvRemote {
    @Override
    default void powerOn() {
        System.out.println("Tv opened");
    }

    @Override
    default void powerDown() {
        System.out.println("Tv closed");
    }

    @Override
    default void volumeUp() {
        System.out.println("volume increased");
    }

    @Override
    default void volumeDown() {
        System.out.println("volume decreased");
    }
    void openNetflix();
    void browseInternet();
    void youTubeVideos();
}
