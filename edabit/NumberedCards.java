public class NumberedCard {
  public static boolean winRound(int[] you, int[] opp) {
		return getMaxComb(you) > getMaxComb(opp);
	}
	
	private static int getMaxComb(int[] arr) {
		Arrays.sort(arr);
		// The info says that there are five number always
		return Integer.parseInt("" + arr[4] + arr[3]);
	}
}
