import javax.swing.*;
import java.awt.*;

public class infinityLoveBox {
    private static void boxGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("infinityLove");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,2));



        JLabel jLabel = new JLabel("Are you ZhangYan?");
        frame.add(jLabel);



        JButton yesButton = new JButton("yes");
        JButton noButton = new JButton("no");


        frame.add(yesButton);
        yesButton.addActionListener(e -> {
            int resbonse1 = JOptionPane.showOptionDialog(null, "Do you know Cui Zigang?", "infinityLove",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, null, null);
            if (resbonse1 == JOptionPane.NO_OPTION) {
                JOptionPane.showOptionDialog(null, "please click yes", "tips",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, null, null);
            }

            if (resbonse1 == JOptionPane.YES_OPTION) {
                int resbonse2 = JOptionPane.showOptionDialog(null, "Ohh, do you love him?", "infinityLove",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (resbonse2 == JOptionPane.NO_OPTION) {
                    JOptionPane.showOptionDialog(null, "please click yes", "tips",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, null, null);
                }

                if (resbonse2 == JOptionPane.YES_OPTION) {
                    int resbonse3 = JOptionPane.showOptionDialog(null, "Then is the love deep?", "infinityLove",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, null, null);
                    if (resbonse3 == JOptionPane.NO_OPTION) {
                        JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, null, null);
                    }

                    if (resbonse3 == JOptionPane.YES_OPTION) {
                        JOptionPane.showOptionDialog(null, "You are my lover\n" +
                                        "You have to eat every meal during a day\n" +
                                        "You have to sleep earlier\n" +
                                        "You can not eat spicy\n" +
                                        "Do not eat cold during the period\n" +
                                        "I love you forever\n" +
                                        "FUCK THE DIRT WORLD!!!", "LOVE YOU FOREVER♥♥♥♥",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, null, null);
                    }
                }
            }
        });

        frame.add(noButton);
        noButton.addActionListener(e -> JOptionPane.showOptionDialog(null, "please click yes", "tips",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, null, null));


        frame.setSize(300, 800);
        frame.setVisible(true);

    }













    public static void main(String[] args) {
        SwingUtilities.invokeLater(infinityLoveBox::boxGUI);
    }
}

