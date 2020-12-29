package winorlose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroVsVillain {

	static int remainingStrOfPlayer;
	static int finishedPlayers;
	static int finishedVillains;

	public static void main(String[] args) {
		int t = 1;
		int noOfPlayers = 6;
		int[] stOfVil = { 112, 243, 512, 343, 90, 478 };
		int[] stOfPlayers = { 500, 789, 234, 400, 452, 150 };

		List stOfPlyrs = new ArrayList();
		stOfPlyrs.add(789);
		stOfPlyrs.add(500);
		stOfPlyrs.add(452);
		stOfPlyrs.add(400);
		stOfPlyrs.add(234);
		stOfPlyrs.add(150);

		List stOfVils = new ArrayList();
		stOfVils.add(90);
		stOfVils.add(112);
		stOfVils.add(243);
		stOfVils.add(343);
		stOfVils.add(478);
		stOfVils.add(512);

		String winOrLose = result(stOfPlyrs, stOfVils);
		System.out.println(winOrLose);
	}

	public static String result(List stOfPlayer, List stOfVils) {
		String result = null;
		Iterator itr = stOfPlayer.iterator();
		while (itr.hasNext()) {
			Integer stOfPlyr = (Integer) itr.next();
			calculateStrengths(stOfVils, finishedPlayers, finishedVillains, stOfPlyr);
			List stOfVilsNew = stOfVils.subList(finishedVillains, stOfVils.size());
			if ((finishedVillains == 6) && (finishedPlayers < stOfPlayer.size()))
				result = "WIN";
			else
				result = "LOSE";
		}
		return result;
	}

	private static void calculateStrengths(List stOfVils, int finPlyrs, int finVills, Integer stOfPlyr) {
		for (Object stOfVil : stOfVils) {
			if (stOfPlyr > 0 && (int) stOfPlyr > (int) stOfVil) {
				stOfPlyr = (int) stOfPlyr - (int) stOfVil;
				finVills++;
			} else {
				finPlyrs++;
				finishedPlayers = finPlyrs;
				finishedVillains = finVills;
				break;
			}
		}
	}
}
