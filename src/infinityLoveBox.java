import javax.swing.*;
import java.awt.*;

public class infinityLoveBox {
    private static void boxGUI() {

        //set frame layout
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("infinityLove");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));

        //add menubar
        JMenuBar jMenuBar = new JMenuBar();
        JMenu operationMenu = new JMenu("operation");
        JMenu helpMenu = new JMenu("help");
        JMenu versionMenu = new JMenu("version");
        jMenuBar.add(versionMenu);
        jMenuBar.add(operationMenu);
        jMenuBar.add(helpMenu);

        //add operationMenu Exit actionlistener
        //add operationMenu Open actionlistener
        JMenuItem operationExitMI = new JMenuItem("Exit");
        JMenuItem operationOpenMI = new JMenuItem("Open");

        operationMenu.add(operationOpenMI);
        operationOpenMI.addActionListener(e -> JOptionPane.showOptionDialog(null, "It's a trick,you fool!", "open what",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, null, null));

        operationMenu.add(operationExitMI);
        operationExitMI.addActionListener(e -> {
            int responseZero = JOptionPane.showOptionDialog(null, "Do you want close this infinityLoveBox?", "wait a minute",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (responseZero == JOptionPane.NO_OPTION) {
                JOptionPane.showOptionDialog(null, "I know that you wonna be close with me.", "tips",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, null, null);
            }

            //click yesbutton in the first dialog
            if (responseZero == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // add helpMenu Information actionlistener
        // add helpMenu Do actionlistener
        JMenuItem helpInformationMI = new JMenuItem("Information");
        JMenuItem helpDoMI = new JMenuItem("Do");

        helpMenu.add(helpDoMI);
        helpDoMI.addActionListener(e -> JOptionPane.showOptionDialog(null, "to show love to ZhangYan", "todo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, null, null));

        helpMenu.add(helpInformationMI);
        helpInformationMI.addActionListener(e -> JOptionPane.showOptionDialog(null,
                "program name:  infinityLoveBox \n"
                        + "information :  to Zhang Yan\n"
                        + " created by  :  Your husband ChrisTree\n"
                        +"\n"
                        +"Fuck the world\n"+"I love zhangyan forever\n",
                "infinityLoveBox information", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, null));

        //add versionMenu Version actionlistener
        //add versionMenu UpdateTime actionlistener
        JMenuItem versionVersionMI = new JMenuItem("Version");
        versionMenu.add(versionVersionMI);
        versionVersionMI.addActionListener(e -> JOptionPane.showOptionDialog(null, "version:0.6beta", "Version",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null));

        JMenuItem updateTimeVersionMI = new JMenuItem("Updatetime");
        versionMenu.add(updateTimeVersionMI);
        updateTimeVersionMI.addActionListener(e -> JOptionPane.showOptionDialog(null,
                "last updatetime : 06/20/2018", "UpdateTime", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, null));


        //set menubar
        frame.setJMenuBar(jMenuBar);
        frame.setSize(200, 100);
        frame.setVisible(true);



        //add label
        JLabel jLabel = new JLabel("Are you ZhangYan?");
        frame.add(jLabel);


        //creat yes and no button
        JButton yesButton = new JButton("yes");
        JButton noButton = new JButton("no");


        //add yesbutton and yesbutton_actionlistener
        frame.add(yesButton);
        yesButton.addActionListener(e -> {
            int responseOne = JOptionPane.showOptionDialog(null, "Do you know Cui Zigang?", "infinityLove",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, null, null);
            if (responseOne == JOptionPane.NO_OPTION) {
                JOptionPane.showOptionDialog(null, "please click yes", "tips",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, null, null);
            }

            //click yesbutton in the first dialog
            if (responseOne == JOptionPane.YES_OPTION) {
                int responseTwo = JOptionPane.showOptionDialog(null, "Ohh, do you love him?", "infinityLove",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (responseTwo == JOptionPane.NO_OPTION) {
                    JOptionPane.showOptionDialog(null, "please click yes", "tips",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, null, null);
                }

                //click yesbutton in the second dialog
                if (responseTwo == JOptionPane.YES_OPTION) {
                    int responseThree = JOptionPane.showOptionDialog(null, "Then is the love deep?", "infinityLove",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, null, null);
                    if (responseThree == JOptionPane.NO_OPTION) {
                        JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, null, null);
                    }

                    //click yesbutton in the third dialog
                    if (responseThree == JOptionPane.YES_OPTION) {
                        int responseFour = JOptionPane.showOptionDialog(null, "Do you want him to find you?", "infinityLove",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, null, null);

                        if (responseFour == JOptionPane.NO_OPTION) {
                            JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, null, null);
                        }

                        //click yesbutton in the fourth dialog
                        if (responseFour == JOptionPane.YES_OPTION) {
                            int responseFive = JOptionPane.showOptionDialog(null, "Can I find you the next national day?", "infinityLove",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, null, null);

                            if (responseFive == JOptionPane.NO_OPTION) {
                                JOptionPane.showOptionDialog(null, "please click yes", "tips",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, null, null);
                            }

                            //click yesbutton in the fifth dialog
                            if (responseFive == JOptionPane.YES_OPTION) {
                                JOptionPane.showOptionDialog(null,
                                        "You are my lover.\n" +
                                                "I love you.\n" +
                                                "There is only one reason.\n" +
                                                "YOU ARE THE REASON.\n\n" +
                                                "You are the one that I won't share.\n" +
                                                "Wherever I go.\n" +
                                                "Whoever I know.\n" +
                                                "However the times flow.\n" +
                                                "You are one piece of my heart.\n" +
                                                "You are the one I don't wanna lose.\n" +
                                                "I want to be with you forever\n\n" +
                                                "So baby you must listen to me.\n" +
                                                "For example:\n" +
                                                "Don't be thinner.\n" +
                                                "You have to eat every meal during a day.\n" +
                                                "You have to sleep earlier.\n" +
                                                "You can not eat spicy.\n" +
                                                "Do not eat cold just like ice cream during the period.\n" +
                                                "I love you forever.\n\n" +
                                                "Insist on loving you."+
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


        frame.setSize(400,400);
        frame.setVisible(true);
        //set the window in the center of screen
        frame.setLocationRelativeTo(null);

    }
    //main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(infinityLoveBox::boxGUI);
    }
}






















