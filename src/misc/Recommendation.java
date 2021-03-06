package misc;

import java.text.DecimalFormat;

public class Recommendation implements Comparable<Recommendation> {
	public int movieID, userID;
	public double movieRating, trustValue, watchability, averageRating, quality;

	public Recommendation(int movieID, int userID, double movieRating, double trustValue, double watchability) {
		this.movieID = movieID;
		this.userID = userID;
		this.movieRating = movieRating;
		this.trustValue = trustValue;
		this.watchability = watchability;
	}

	@Override
	public int compareTo(Recommendation r) {
		return Double.compare(r.watchability, watchability);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		// +(date+16) + "\t"
		return movieID + "\t" + movieRating + "\t" + userID + "\t" + df.format(trustValue);
	}

}
