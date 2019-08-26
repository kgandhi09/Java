import java.util.LinkedList;

class ShowManager2 {

	ShowManager2() {
	}

	/**
	 * isValid, filters out the list of shows which are not special
	 * 
	 * @param shows, list of all shows
	 * @return a cleaned list of all non-special shows.
	 */
	public LinkedList<Show> isValid(LinkedList<Show> shows) {
		LinkedList<Show> result = new LinkedList<Show>();

		for (int i = 0; i < shows.size(); i++) {

			if (!(shows.get(i).isSpecial)) {
				result.add(shows.get(i));
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

		for (int i = 0; i < shows.size(); i++) {

			if ((shows.get(i).broadcastTime >= 600) && (shows.get(i).broadcastTime < 1700)) {
				result.daytime.add(shows.get(i));

			} else if ((shows.get(i).broadcastTime >= 1700) && (shows.get(i).broadcastTime < 2200)) {
				result.primetime.add(shows.get(i));

			} else if (((shows.get(i).broadcastTime >= 2200) && (shows.get(i).broadcastTime < 2400))
					&& ((shows.get(i).broadcastTime >= 2400) && (shows.get(i).broadcastTime < 100))) {
				result.latenight.add(shows.get(i));
			}

		}

		result.daytime = this.isValid(result.daytime);
		result.primetime = this.isValid(result.primetime);
		result.latenight = this.isValid(result.latenight);

		return result;

	}

}
