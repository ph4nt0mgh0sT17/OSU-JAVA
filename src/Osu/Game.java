package Osu;

public class Game {

	private String mName;
	private String mGenre;
	private String mPlatform;

	private int mRating;
	private String mAward;

	public Game(String name, String genre, String platform, int rating, String award) {
		mName = name;
		mGenre = genre;
		mPlatform = platform;

		if (award == null) {
			mAward = "";
		}

		else {
			mAward = award;
		}

		mRating = rating;

	}

	@Override
	public String toString() {
		if (mAward != "") {
			return String.format("Game %s; Genre: %s; Platform: %s; Rating: %d; Award: %s", mName, mGenre, mPlatform, mRating, mAward);
		}

		else {
			return String.format("Game %s; Genre: %s; Platform: %s; Rating: %d", mName, mGenre, mPlatform, mRating);
		}
	}
}
