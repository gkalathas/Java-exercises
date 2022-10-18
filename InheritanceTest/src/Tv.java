public class Tv implements SmartTvRemote{
    @Override
    public void openNetflix() {
        System.out.println("Watching cool movie");
    }

    @Override
    public void browseInternet() {
        System.out.println("Surfing on the internet");
    }

    @Override
    public void youTubeVideos() {
        System.out.println("Watching UH");
    }
}
