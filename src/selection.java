import javax.swing.*;

public class selection {
    protected int response;

    public void yesSelection(String string1 , String string2) {
        response = JOptionPane.showOptionDialog(null, string1, "infinityLove",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showOptionDialog(null, "please click yes", "tips",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, null, null);
        }
        if (response == JOptionPane.YES_OPTION) {
            yesSelection()
        }
    }
}

