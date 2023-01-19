import java.sql.SQLOutput;
import java.util.List;

public class BoardDisplayer {

    public void BoardDisplayer() {

    }

    RowReturner returner = new RowReturner();

    public void display(List spots) {
        String formattedFirstRow = spots.get(0) + " | " + spots.get(1) + " | " + spots.get(2) + "\n"
                + spots.get(3) + " | " + spots.get(4) + " | " + spots.get(5) + "\n"
                + spots.get(6) + " | " + spots.get(7) + " | " + spots.get(8);
        System.out.print(formattedFirstRow);
        //System.out.println(String.join(" | ", returner.firstRow(spots)) + " | " + String.join(" | ", returner.secondRow(spots)) + " | " + String.join(" | ", returner.thirdRow(spots)));
    }
}
