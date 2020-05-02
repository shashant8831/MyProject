package in.co.collection;

public class Score implements Comparable<Score> {
 private int wins, losses;
 public Score(int w, int 1)
 
 { wins = w; losses = 1; }
 public int getWins() { return wins; }
 public int getLosses() { return losses; }
 public String toString() {
 return "< + wins + "," + losses + >";
 }
@Override
public int compareTo(Score o) {
	// TODO Auto-generated method stub
	return 0;
}
9. // insert code here
10. }

