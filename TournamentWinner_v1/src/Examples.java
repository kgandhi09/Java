import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Examples {

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
	
	IContestant contestant1;
	IContestant contestant2;
	IContestant contestant3;
	
	
	IResult result1;
	IResult result2;
	IResult result3;
	
	Match match1 = new Match(contestant1, contestant2, result1);
	

	@Test
	public void TestIFRugbyTeamWorks() {
		
		assertEquals(team_rugby_A.country, team_rugby_C.country);
		assertEquals(team_rugby_B.jersey_color, team_rugby_C.jersey_color);
		assertEquals(team_rugby_B.intimidation_ritual, team_rugby_C.intimidation_ritual);
		assertEquals(team_rugby_A.wins, team_rugby_C.wins);
		assertEquals(team_rugby_B.losses, team_rugby_C.losses);
	}
	
	@Test
	public void TestIfRoboticsTeamWorks() {
		
		assertEquals(team_robotics_A.school, team_robotics_C.school);
		assertEquals(team_robotics_A.special_feature, team_robotics_C.special_feature);
		assertEquals(team_robotics_B.rank, team_robotics_C.rank);
		
		
	}
	
	@Test
	public void TestIfRugbyResultsWork() {
		
		assertEquals(rugby_result_1.team1, team_rugby_A);
		assertEquals(rugby_result_1.team2, rugby_result_2.team2);
		assertEquals(rugby_result_1.team1points, rugby_result_3.team1points, 0);
		assertEquals(rugby_result_1.team2point, rugby_result_2.team2point, 0);
		
	}
	
	@Test
	public void TestIfRoboticsResultsWork() {
		
		assertEquals(robo_result_1.team1, robo_result_3.team1);
		assertEquals(robo_result_2.team2, robo_result_3.team2);
		assertEquals(robo_result_2.team1points, robo_result_3.team1points, 0);
		assertEquals(robo_result_2.team1tasks, robo_result_3.team1tasks);
		assertEquals(robo_result_2.team1fell, robo_result_3.team1fell);
		assertEquals(robo_result_1.team2points, robo_result_3.team2points, 0);
		assertEquals(robo_result_1.team2tasks, robo_result_2.team2tasks);
		assertEquals(robo_result_2.team2fell, robo_result_3.team2fell);

	}
	
	@Test
	public void TestIfisValidRugbyWorks() {
		
		new RugbyResult(team_rugby_A, team_rugby_B, 50, 51);
		
		assertEquals(rugby_result_1.isValid(), true);
		assertEquals(rugby_result_4.isValid(), false);
		assertEquals(rugby_result_5.isValid(), false);
	}
	
	@Test
	public void TestIfisValidRoboticsWorks1() {
		
		new RugbyResult(team_rugby_A, team_rugby_B, 50, 51);
		
		assertEquals(robo_result_1.isValid(), true);
		assertEquals(robo_result_4.isValid(), false);
		assertEquals(robo_result_5.isValid(), true);
		assertEquals(robo_result_6.isValid(), false);
	}
	
	@Test
	public void TestIfRoboGetScoreWorks1() {
		assertEquals(robo_result_1.getScore(14, 5, false), 19, 0);
		assertEquals(robo_result_1.getScore(14, 5, true), 14, 0);
		
	}
	
	@Test
	public void TestIfgetWinnerRugbyWorks() {
		
		assertEquals(rugby_result_1.getWinner(), team_rugby_B);
		assertEquals(rugby_result_2.getWinner(), team_rugby_A);
		
		
	}
	
	@Test
	public void TestIfgetWinnerRoboticsWork() {
		
		assertEquals(robo_result_1.getWinner(), team_robotics_B);
		assertEquals(robo_result_2.getWinner(), team_robotics_B);
		
	}
	
	
}
