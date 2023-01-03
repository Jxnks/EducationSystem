import java.lang.reflect.Array;
import java.util.ArrayList;

public class ElectricalClasses extends Classes {
    private ArrayList<Students> classList;

    public ElectricalClasses() {
        this.classList = new ArrayList<>();
    }
    @Override
    public void levelSelector(Grades grades) {
        super.levelSelector(grades);

    }

    public void add(Students student) {
        this.classList.add(student);
    }
}
