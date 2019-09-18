import java.util.LinkedList;

class Earthquake2 {
	Earthquake2() {
	}

	// checks whether a datum is a date
	boolean isDate(double anum) {
		return (int) anum > 10000000;
	}

	// extracts the month from an 8-digit date
	int extractMonth(double dateNum) {
		return ((int) dateNum % 10000) / 100;
	}

	/**
	 * dailMaxForMonth, iterates through a list of data and dates and extracts the
	 * maximum data for the desired month.
	 * 
	 * @param data,  list of type double containing earthquake data.
	 * @param month, integer representing month for which we want the max data.
	 * @return a list of MaxHzReport with maximum data for the desired month.
	 */
	public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {

		LinkedList<MaxHzReport> result = new LinkedList<MaxHzReport>();

		for (int i = 0; i < data.size(); i++) {
			double curDat = data.get(i);

			if (isDate(curDat)) {// if date
				if (extractMonth(curDat) == month) {// if correct month
					double max = 0.0;
					int j=i+1;
					while(j<data.size()) {
						if (!(isDate(data.get(j)))) {
							if (data.get(j) > max) {
								max = data.get(j);
							}
							j++;
						} 
						else {
							i = j - 1;
							break;
						}

					}
					result.add(new MaxHzReport(curDat, max));

				} 
			}
		}

		return result;
	}

}
