public class score {
private int points;
private int rankings;

public PointsPanel(int points, int rankings) {
    this.points = points;
    this.rankings = rankings;
}

public int getPoints() {
    return points;
}

public int getRankings() {
    return rankings;
}

public void setPoints(int points) {
    this.points = points;
}

public void setRankings(int rankings) {
    this.rankings = rankings;
}
  
public void printInformation() {
    System.out.println("Points: " + points);
    System.out.println("Rankings: " + rankings);
}  
