import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    RowReturner rowReturner = new RowReturner();

    public List<String> firstRow() {
        return rowReturner.firstRow(this.spots);
    }

    public List<String> secondRow() {
        return rowReturner.secondRow(this.spots);
    }

    public List<String> thirdRow() {
        return rowReturner.thirdRow(this.spots);
    }

    // Poor code — can you improve this?
    public void display() {
        BoardDisplayer boardDisplayer = new BoardDisplayer();

        boardDisplayer.display(this.spots);

        /*String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
            + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
            + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);

         */
    }
}
