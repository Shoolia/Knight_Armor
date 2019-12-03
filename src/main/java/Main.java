import controller.Ammunition;
import controller.Controller;
import model.Model;
import view.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);

        controller.processUser();

    }
}
