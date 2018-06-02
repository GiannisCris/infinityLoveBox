import javax.swing.*;
import java.awt.*;

public class infinityLoveBox {
    private static void boxGUI() {
        //set frame layout
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("infinityLove");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,2));


        //add label
        JLabel jLabel = new JLabel("Are you ZhangYan?");
        frame.add(jLabel);


        //creat yes and no button
        JButton yesButton = new JButton("yes");
        JButton noButton = new JButton("no");


        //add yesbutton and yesbutton_actionlistener
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

            //click yesbutton in the first dialog
            if (resbonse1 == JOptionPane.YES_OPTION) {
                int resbonse2 = JOptionPane.showOptionDialog(null, "Ohh, do you love him?", "infinityLove",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (resbonse2 == JOptionPane.NO_OPTION) {
                    JOptionPane.showOptionDialog(null, "please click yes", "tips",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, null, null);
                }

                //click yesbutton in the second dialog
                if (resbonse2 == JOptionPane.YES_OPTION) {
                    int resbonse3 = JOptionPane.showOptionDialog(null, "Then is the love deep?", "infinityLove",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, null, null);
                    if (resbonse3 == JOptionPane.NO_OPTION) {
                        JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, null, null);
                    }

                    //click yesbutton in the third dialog
                    if (resbonse3 == JOptionPane.YES_OPTION) {
                        int resbonse4 = JOptionPane.showOptionDialog(null, "Do you want him to find you?", "infinityLove",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, null, null);

                        if (resbonse4 == JOptionPane.NO_OPTION) {
                            JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, null, null);
                        }

                        //click yesbutton in the fourth dialog
                        if (resbonse4 == JOptionPane.YES_OPTION) {
                            int resbonse5 = JOptionPane.showOptionDialog(null, "Can I find you the next national day?", "infinityLove",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, null, null);

                            if (resbonse5 == JOptionPane.NO_OPTION) {
                                JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, null, null);
                            }

                            //click yesbutton in the fifth dialog
                            if (resbonse5 == JOptionPane.YES_OPTION) {
                                JOptionPane.showOptionDialog(null, "You are my lover\n" +
                                                "You are the one that I won't share\n" +
                                                "Wherever I go\n" +
                                                "whoever I know" +
                                                "However the times flow" +
                                                "You are one piece of my heart\n" +
                                                "You are the one I don't wanna lose\n" +
                                                "So baby you must listen to me\n" +
                                                "For example:\n" +
                                                "Don't be thinner\n"+
                                                "You have to eat every meal during a day\n" +
                                                "You have to sleep earlier\n" +
                                                "You can not eat spicy\n" +
                                                "Do not eat cold just like ice cream during the period\n" +
                                                "I love you forever\n" +
                                                "FUCK THE DIRTY WORLD!!!", "LOVE YOU FOREVER♥♥♥♥",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, null, null);
                            }
                        }

                    }
                }
            }
        });

        //add nobutton and nobutton_actionlistener
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






















