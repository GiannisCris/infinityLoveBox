import javax.swing.*;

public class selection {
    protected int response;

    public void yesSelection(String string1) {
        response = JOptionPane.showOptionDialog(null, string1, "infinityLove",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showOptionDialog(null, "please click yes", "tips",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, null, null);
        }
        //出现死循环了，下次使用设计模式解决！工厂模式或者抽象工厂模式。2018年7月10号更新，尝试优化infinityLoveBox失败，无法给yesSelection方法给与两个参数。
        if (response == JOptionPane.YES_OPTION) {
            yesSelection(string1);
        }
    }
}

