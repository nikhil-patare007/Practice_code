import javax.swing.JOptionPane;
public class Board {
    private String board [][];
    private int blankX,blankY;

    public Board(){
        this.board=new String[3][3];
    }



    public void setBoard(String[][] board){
        System.out.println("\nEnter one tile as a -.i.e  Blank tile\n");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                board[i][j] = JOptionPane.showInputDialog("Enter the tile as [" + i + "][" + j + "] :");

                if (board[i][j].equals("-")) {
                    blankX = i;
                    blankY = j;
                }
            }

        }
    }

    public void initBoard(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                this.board[i][j]=board[i][j];
            }
        }
    //public String[][] getBoard() {return board;}

    }
public void setBlankX(int x){
        blankX=x;
}

public void setBlankY(int y){
        blankY=y;
    }

public void swap(int i1,int j1,int i2,int j2){
        String temp=board[i1][j1];
        board[i1][j1]=board[i2][j2];
        board[i2][j2]=temp;
}

    public void display(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print("\t"+board[i][j]);
            }
            System.out.println();
        }
    }

    public Board nextMove(int gn, Board goal){
        Board temp=new Board();
        Board next =new Board();
        int minFn=999;
        System.out.println("\nPossible moves are:");
        if(blankY>0){
            temp.setBoard(board);
            temp.swap(blankX,blankY,blankX,blankY-1);
            int fn=(temp.getHn(goal) + gn);
            System.out.println("\nFor Fn "+fn+" :");
             temp.display();
             if (fn<minFn){
                 next.setBoard(temp.board);
                 next.setBlankX(blankX);
                 next.setBlankY(blankY-1);
             }
        }

        if(blankY<2){
            temp.setBoard(board);
            temp.swap(blankX,blankY,blankX,blankY+1);
            int fn=(temp.getHn(goal)+gn);
            System.out.println("\nFor Fn "+fn+" :");
            temp.display();
            if (fn<minFn){
                next.setBoard(temp.board);
                next.setBlankX(blankX);
                next.setBlankY(blankY+1);
            }
        }

        if(blankX>0){
            temp.setBoard(board);
            temp.swap(blankX,blankY,blankX-1,blankY);
            int fn=(temp.getHn(goal)+gn);
            System.out.println("\nFor Fn "+fn+" :");
            temp.display();
            if (fn<minFn){
                next.setBoard(temp.board);
                next.setBlankX(blankX-1);
                next.setBlankY(blankY);
            }
        }
        if(blankX < 2){
            temp.setBoard(board);
            temp.swap(blankX,blankY,blankX+1,blankY);
            int fn=(temp.getHn(goal)+gn);
            System.out.println("\nFor Fn "+fn+" :");
            temp.display();
            if (fn<minFn){
                next.setBoard(temp.board);
                next.setBlankX(blankX+1);
                next.setBlankY(blankY);
            }
        }
    return next;
    }

       public boolean equals(Board b){
           for (int i = 0; i <3 ; i++) {
               for (int j = 0; j <3 ; j++) {
                   if(!this.board[i][j].equals(b.board[i][j])){
                       return false;
                   }
               }
           }
           return true;
       }

         public int getHn(Board goal){

        int hn=0;
             for (int i = 0; i <3 ; i++) {
                 for (int j = 0; j <3 ; j++) {
                     if(!this.board[i][j].equals(goal.board[i][j])){
                         hn++;
                     }
                 }
             }
             return hn;

         }

}
