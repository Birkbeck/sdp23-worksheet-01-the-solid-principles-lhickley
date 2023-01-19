import java.util.ArrayList;
import java.util.List;

public class RowReturner {

    public RowReturner() {

    }

    public List<String> firstRow(List<String> spots) {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(spots.get(0));
        firstRow.add(spots.get(1));
        firstRow.add(spots.get(2));
        return firstRow;
    }

    public List<String> secondRow(List<String> spots) {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(spots.get(3));
        secondRow.add(spots.get(4));
        secondRow.add(spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow(List<String> spots) {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(spots.get(6));
        thirdRow.add(spots.get(7));
        thirdRow.add(spots.get(8));
        return thirdRow;
    }
}
