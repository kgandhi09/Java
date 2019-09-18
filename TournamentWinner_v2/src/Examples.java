import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class Examples {

	public Examples() {

		listRugbyMatches1.add(rugbyMatch1);

		listRugbyMatches2.add(rugbyMatch1);
		listRugbyMatches2.add(rugbyMatch2);

		listRoboticsMatch1.add(roboticsMatch1);

		listRoboticsMatch2.add(roboticsMatch1);
		listRoboticsMatch2.add(roboticsMatch2);
		listRoboticsMatch2.add(roboticsMatch3);

		rugbyContestantList1.add(team_rugby_A);
		rugbyContestantList1.add(team_rugby_B);
		rugbyContestantList1.add(team_rugby_C);

		absRoundList1.add(initRound1);
		absRoundList1.add(initRound2);
		
		absRoundList2.add(initRound3);
		absRoundList2.add(initRound4);
		absRoundList2.add(advRound1);
		
		absRoundList3.add(initRound1);
		absRoundList3.add(initRound2);
		absRoundList3.add(initRound3);
		absRoundList3.add(initRound4);
		absRoundList3.add(advRound1);
		absRoundList3.add(advRound2);
		
	}

	RugbyTeam team_rugby_A = new RugbyTeam("U.S", "Blue", true, 5, 6);
	RugbyTeam team_rugby_B = new RugbyTeam("Japan", "Red", false, 0, 5);
	RugbyTeam team_rugby_C = new RugbyTeam("U.S", "Red", false, 5, 5);

	RoboticsTeam team_robotics_A = new RoboticsTeam("WPI", "Mechanical Arm", 1);
	RoboticsTeam team_robotics_B = new RoboticsTeam("UMass", "Blows Bubbles", 12);
	RoboticsTeam team_robotics_C = new RoboticsTeam("WPI", "Mechanical Arm", 12);

	RugbyResult rugby_result_1 = new RugbyResult(team_rugby_A, team_rugby_B, 50, 51);
	RugbyResult rugby_result_2 = new RugbyResult(team_rugby_A, team_rugby_B, 60, 51);
	RugbyResult rugby_result_3 = new RugbyResult(team_rugby_A, team_rugby_B, 50, 59);
	RugbyResult rugby_result_4 = new RugbyResult(team_rugby_A, team_rugby_B, 156, 159);
	RugbyResult rugby_result_5 = new RugbyResult(team_rugby_B, team_rugby_C, 150, 150);

	RoboticsResult robo_result_1 = new RoboticsResult(team_robotics_A, team_robotics_B, 14, 5, false, 15, 6, false);
	RoboticsResult robo_result_2 = new RoboticsResult(team_robotics_B, team_robotics_C, 15, 7, false, 13, 6, false);
	RoboticsResult robo_result_3 = new RoboticsResult(team_robotics_A, team_robotics_C, 15, 7, false, 15, 4, false);
	RoboticsResult robo_result_4 = new RoboticsResult(team_robotics_A, team_robotics_C, 15, 9, false, 15, 4, false);
	RoboticsResult robo_result_5 = new RoboticsResult(team_robotics_A, team_robotics_C, 16, 7, false, 16, 7, false);
	RoboticsResult robo_result_6 = new RoboticsResult(team_robotics_A, team_robotics_C, 16, 8, false, 16, 8, false);

	Match rugbyMatch1 = new Match(team_rugby_A, team_rugby_B, rugby_result_1);
	Match rugbyMatch2 = new Match(team_rugby_A, team_rugby_C, rugby_result_2);

	Match roboticsMatch1 = new Match(team_robotics_A, team_robotics_B, robo_result_1);
	Match roboticsMatch2 = new Match(team_robotics_B, team_robotics_C, robo_result_2);
	Match roboticsMatch3 = new Match(team_robotics_A, team_robotics_C, robo_result_3);

	LinkedList<Match> listRugbyMatches1 = new LinkedList<Match>();
	LinkedList<Match> listRugbyMatches2 = new LinkedList<Match>();
	LinkedList<Match> listRoboticsMatch1 = new LinkedList<Match>();
	LinkedList<Match> listRoboticsMatch2 = new LinkedList<Match>();

	LinkedList<IContestant> rugbyContestantList1 = new LinkedList<IContestant>();

	LinkedList<AbsRound> absRoundList1 = new LinkedList<AbsRound>();
	LinkedList<AbsRound> absRoundList2 = new LinkedList<AbsRound>();
	LinkedList<AbsRound> absRoundList3 = new LinkedList<AbsRound>();

	InitRound initRound1 = new InitRound(listRugbyMatches1);
	InitRound initRound2 = new InitRound(listRugbyMatches2);
	InitRound initRound3 = new InitRound(listRoboticsMatch1);
	InitRound initRound4 = new InitRound(listRoboticsMatch2);

	AdvancedRound advRound1 = new AdvancedRound(listRugbyMatches1, rugbyContestantList1);
	AdvancedRound advRound2 = new AdvancedRound(listRugbyMatches2, rugbyContestantList1);

	Tournament tournament1 = new Tournament(absRoundList1);
	Tournament tournament2 = new Tournament(absRoundList2);
	

	@Test
	public void TestIfgetMatchWinnersWorks() {
		LinkedList<IContestant> winnerList1 = new LinkedList<IContestant>();
		winnerList1.add(team_rugby_B);
		assertEquals(initRound1.getMatchWinners(), winnerList1);

		LinkedList<IContestant> winnerList2 = new LinkedList<IContestant>();
		winnerList2.add(team_rugby_B);
		winnerList2.add(team_rugby_A);
		assertEquals(initRound2.getMatchWinners(), winnerList2);

		LinkedList<IContestant> winnerList3 = new LinkedList<IContestant>();
		winnerList3.add(team_robotics_B);
		assertEquals(initRound3.getMatchWinners(), winnerList3);

		LinkedList<IContestant> winnerList4 = new LinkedList<IContestant>();
		winnerList4.add(team_robotics_B);
		winnerList4.add(team_robotics_B);
		winnerList4.add(team_robotics_A);

		assertEquals(initRound4.getMatchWinners(), winnerList4);

	}

	@Test
	public void TestIfgetNumWinnersWorks() {
		assertEquals(initRound1.getNumWinners(), 1);
		assertEquals(initRound2.getNumWinners(), 2);
		assertEquals(initRound3.getNumWinners(), 1);
		assertEquals(initRound4.getNumWinners(), 3);
	}

	@Test
	public void TestIfIsWinnerWorksForAdvanced() {

		assertEquals(advRound1.isWinner(team_rugby_B), true);
		assertEquals(advRound1.isWinner(team_rugby_A), false);
		assertEquals(advRound1.isWinner(team_rugby_C), false);

		assertEquals(advRound2.isWinner(team_rugby_B), true);
		assertEquals(advRound2.isWinner(team_rugby_A), true);
		assertEquals(advRound2.isWinner(team_rugby_C), false);

	}

	@Test
	public void TestIfIsWinnerWorksForInit() {

		assertEquals(initRound3.isWinner(team_robotics_B), true);

		assertEquals(initRound4.isWinner(team_robotics_B), true);
		assertEquals(initRound4.isWinner(team_robotics_A), true);

	}

	@Test
	public void TestIfFinalWinnersIsValidWorks() {

		assertEquals(tournament1.finalWinnerIsValid(team_rugby_B), true);
		assertEquals(tournament1.finalWinnerIsValid(team_rugby_A), true);
		assertEquals(tournament1.finalWinnerIsValid(team_rugby_C), false);
		
		assertEquals(tournament2.finalWinnerIsValid(team_robotics_B), true);
		assertEquals(tournament2.finalWinnerIsValid(team_robotics_A), true);
		assertEquals(tournament2.finalWinnerIsValid(team_robotics_C), false);
		
	}

}
