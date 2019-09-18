import java.util.LinkedList;

class ShowManager1 {

	ShowManager1() {
	}

	/**
	 * cleanList, cleans the list of shows which are not special
	 * 
	 * @param shows, list of all shows
	 * @return a cleaned list of all shows which are only non-special
	 */
	public LinkedList<Show> cleanList(LinkedList<Show> shows) {
		LinkedList<Show> result = new LinkedList<Show>();

		for (Show aShow : shows) {
			if (!(aShow.isSpecial)) {
				result.add(aShow);
			}
		}

		return result;
	}

	/**
	 * organizeShows, organizes all non-special shows according to their broadcast
	 * timing.
	 * 
	 * @param shows, list of all shows.
	 * @return a ShowSummary report organizing non-special shows on their broadcast
	 *         time.
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows) {
		ShowSummary result = new ShowSummary();
		LinkedList<Show> cleanedList = this.cleanList(shows);

		for (Show aShow : cleanedList) {

			if ((aShow.broadcastTime >= 600) && (aShow.broadcastTime < 1700)) {
				result.daytime.add(aShow);

			} else if ((aShow.broadcastTime >= 1700) && (aShow.broadcastTime <= 2200)) {
				result.primetime.add(aShow);

			} else if (((aShow.broadcastTime >= 2200) && (aShow.broadcastTime < 2400)
					&& ((aShow.broadcastTime >= 2400) && (aShow.broadcastTime < 100)))) {
				result.latenight.add(aShow);
			}
		}

		return result;
	}

}
