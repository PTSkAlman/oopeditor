import javax.swing.*;

public class NotepadView {
    private JTextArea textArea;
    private JPanel notepadPanel;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu();
    private JMenuItem file = new JMenuItem("File");
    private JMenuItem edit = new JMenuItem("Edit");

    public NotepadView() {
        menu.add(file);
        menu.add(edit);
        menuBar.add(menu);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JPanel getNotepadPanel() {
        return notepadPanel;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
