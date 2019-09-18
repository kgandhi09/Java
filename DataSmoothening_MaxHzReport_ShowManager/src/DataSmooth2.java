import java.util.LinkedList;

class DataSmooth2 {
	DataSmooth2() {
	}

	/**runTime, a helper functions that calulates avg. run time of all episodes in a show.
	 * @param episodes, list of all episodes in a show
	 * @return a double of calculated average time.
	 */
	public double runTime(LinkedList<Episode> episodes) {
		double sum = 0.0;
		double result = 0.0;
		for (int i = 0; i < episodes.size(); i++) {

			sum = sum + episodes.get(i).runTime;

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

		double avgLength = 0.0;

		for (int i = 0; i < shows.size(); i++) {

			avgLength = this.runTime(shows.get(i).episodes);

			shows.get(i).setAvgLength(avgLength);

			result.add(shows.get(i).avgLength);
		}

		for (int i = 0; i < result.size(); i++) {

			if (!(i == 0) && !(i == result.size() - 1)) {

				finalResult = ((result.get(i + 1) + result.get(i) + result.get(i - 1)) / 3);
				FinalResult.add(finalResult);

			} else {
				FinalResult.add(result.get(i));
			}

		}

//		FinalResult.addFirst(result.get(0));
//
//		FinalResult.addLast(result.get(result.size() - 1));

		return FinalResult;

	}
}