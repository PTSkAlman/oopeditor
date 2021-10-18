import javax.swing.*;

public class NotepadController {

    private NotepadModel model;
    private NotepadView view;

    public NotepadController() {
        model = new NotepadModel();
        view = new NotepadView();

        JFrame frame = new JFrame("Notepad");
        frame.add(view.getMenuBar());
        frame.setContentPane(view.getNotepadPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        NotepadController controller = new NotepadController();

    }

}
