import java.util.LinkedList;

class DataSmooth1 {
	DataSmooth1() {
	}

/**runTime, a helper functions that calulates avg. run time of all episodes in a show.
 * @param episodes, list of all episodes in a show
 * @return a double of calculated average time.
 */
	public double runTime(LinkedList<Episode> episodes) {
		double result = 0;
		double sum = 0;

		for (Episode anEpisode : episodes) {

			sum = sum + anEpisode.runTime;

			result = sum / episodes.size();
		}

		return result;

	}
	
	/**dataSmooth, smoothens the data for avg calcuated run time in shows
	 * @param shows, list of all showws 
	 * @return a double type of smoothened data list 
	 */

	public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
		LinkedList<Double> result = new LinkedList<Double>();
		LinkedList<Double> FinalResult = new LinkedList<Double>();

		double finalResult = 0.0;

		for (Show aShow : shows) {

			aShow.setAvgLength(this.runTime(aShow.episodes));

			result.add(aShow.avgLength);

		}

		for (int i = 1; i < result.size() - 1; i++) {

			finalResult = ((result.get(i + 1) + result.get(i) + result.get(i - 1)) / 3);
			FinalResult.add(finalResult);

		}

		FinalResult.addFirst(result.get(0));

		FinalResult.addLast(result.get(result.size() - 1));

		return FinalResult;

	}

}