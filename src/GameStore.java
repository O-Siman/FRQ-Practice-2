import java.util.ArrayList;

public class GameStore {
    private ArrayList<VideoGame> allVideoGames;

    public boolean isSimilar(String title, int category) {
        for (VideoGame videoGame : allVideoGames) {
            return videoGame.getTitle().equals(title) || videoGame.getCategory() == category;
        }
        return false;
    }

    public void updateList(VideoGame[] moreGames) {
        for (int i = 0; i < moreGames.length; i++) {
            VideoGame videoGame = moreGames[i];
            if (!isSimilar(videoGame.getTitle(), videoGame.getCategory())) {
                allVideoGames.add(videoGame);
                moreGames[i] = null;
            }
        }
    }

//    public double averagePriceOfCategory(int category) {
//
//    }
}
