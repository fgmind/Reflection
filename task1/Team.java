package task1;

public class Team {
	
    private String teamName;
    private int teamWin;
    private int teamDraw;
    private int teamLoss;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;    
    private int teamPoints;
   
    



    
    public Team(String name,int win, int draw, int loss, int gFor, int gAgainst, int points){

        this.setTeamName(name);
        this.updateTeamResult(win, draw, loss, gFor, gAgainst, points);
        this.teamWin = win;;
        this.teamDraw = draw;
        this.teamLoss = loss;
        this.goalsFor = gFor;
        this.goalsAgainst = gAgainst;
        this.goalDifference = gFor - gAgainst;
//        this.teamPoints = points;
    }
    
    public void updateTeamResult(int win, int draw, int loss, int gFor, int gAgainst, int points){
    	 teamWin += win;
    	 teamDraw += draw;
    	 teamLoss += loss;
    	 goalsFor += gFor;
    	 goalsAgainst += gAgainst;
    	 goalDifference += (gFor - gAgainst);
    }
    


//  Constructors
    
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setTeamWin(int teamWin) {
		this.teamWin = teamWin;
	}
	public void setTeamDraw(int teamDraw) {
		this.teamDraw += teamDraw;
	}
	public void setTeamLoss(int teamLoss) {
		this.teamLoss += teamLoss;
	}
	public void setGoalsFor(int goalsFor) {
		this.goalsFor += goalsFor;
	}
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst += goalsAgainst;
	}
	public void setGoalDifference() {
		goalDifference += (goalsFor - goalsAgainst);
	}
    
//  Getters
	public String getTeamName() {
		return teamName;
	}
	public int getTeamWin() {
		return teamWin;
	}
	public int getTeamDraw() {
		return teamDraw;
	}
	public int getTeamLoss() {
		return teamLoss;
	}
	public int getGoalsFor() {
		return goalsFor;
	}
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	public int getGoalDifference() {
		return goalDifference;
	}
	public int getTeamPoints() {
		return teamPoints;
	}



}

