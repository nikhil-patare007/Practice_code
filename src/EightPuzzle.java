public class EightPuzzle {

private int gn=0;
private Board start;
private Board goal;

public void initStart(){
    System.out.println("\nEnter the start board");
    start=new Board();
    start.initBoard();
    System.out.println("\nthe given start board is ");
    start.display();

}

    public void initGoal(){
        System.out.println("\nEnter the goal board");
        goal=new Board();
        goal.initBoard();
        System.out.println("\nthe given goal board is ");
        goal.display();

    }

public void solve(){
    Board current=start;
    while(true){
        System.out.println("\nBoard after "+gn+" moves :");
        current.display();
        if(current.equals(goal)){
            System.out.println("\n Goal state is achieved..");
            return;
        }
    gn++;
        current=current.nextMove(gn,goal);
    }
}

    public static void main(String[] args) {
        EightPuzzle e=new EightPuzzle();
        e.initStart();
        e.initGoal();
        System.out.println("\n Board solved as");
        e.solve();
    }
}
