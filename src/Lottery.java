import jdk.nashorn.internal.scripts.JO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


public class Lottery {
    List<Integer> userPicks = new ArrayList<>();
    List<Integer> lotteryNumbers = new ArrayList<>();

    private JPanel panel1;
    private JTextArea виеИграетеЛото6TextArea;
    private JCheckBox number11;
    private JCheckBox number16;
    private JCheckBox number13;
    private JCheckBox number15;
    private JCheckBox number12;
    private JCheckBox number14;
    private JCheckBox number17;
    private JCheckBox number18;
    private JCheckBox number19;
    private JCheckBox number20;
    private JPanel first;
    private JPanel fourth;
    private JPanel third;
    private JPanel second;
    private JCheckBox number21;
    private JCheckBox number30;
    private JCheckBox number29;
    private JCheckBox number28;
    private JCheckBox number22;
    private JCheckBox number23;
    private JCheckBox number24;
    private JCheckBox number25;
    private JCheckBox number26;
    private JCheckBox number27;
    private JCheckBox number31;
    private JCheckBox number36;
    private JCheckBox number32;
    private JCheckBox number35;
    private JCheckBox number33;
    private JCheckBox number34;
    private JCheckBox number40;
    private JCheckBox number39;
    private JCheckBox number37;
    private JCheckBox number38;
    private JCheckBox a1CheckBox1;
    private JCheckBox a2CheckBox;
    private JCheckBox a9CheckBox;
    private JCheckBox a3CheckBox;
    private JCheckBox a4CheckBox;
    private JCheckBox a5CheckBox;
    private JCheckBox a6CheckBox;
    private JCheckBox a8CheckBox;
    private JCheckBox a7CheckBox;
    private JCheckBox number41;
    private JCheckBox number46;
    private JCheckBox number45;
    private JCheckBox number44;
    private JCheckBox number43;
    private JCheckBox number42;
    private JCheckBox number47;
    private JCheckBox a10CheckBox;
    private JPanel empty;
    private JPanel space;
    private JButton натиснетеТукЗаДаButton;

    public static void numberGenerator(List<Integer> number) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            number.add(rand.nextInt(47) + 1);
            for (int j = i; j >= 0; j--) {
                if (number.get(i) == number.get(j)) {
                    number.remove(i);
                    number.add(rand.nextInt(47) + 1);
                }
            }
        }
    }

    public static String getYourPrize(List<Integer> arrayList, List<Integer> list) {
        int counter = 0;
        String prize;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (list.get(i) == arrayList.get(j)) {
                    counter++;
                }
            }
        }
        switch (counter) {
            case 1:
                prize = "You win 3€";
                break;
            case 2:
                prize = "You win 10€";
                break;
            case 3:
                prize = "You win 50€";
                break;
            case 4:
                prize = "You win 500€";
                break;
            case 5:
                prize = "You win 1000€";
                break;
            case 6:
                prize = "Congratulations! You win the grand prize 1 000 000€ ";
                break;
            default:
                prize = "You don't win anything.Next time you will be lucky";
        }
        return prize;
    }


    public Lottery() {

        a1CheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(1);
            }
        });
        a2CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(2);
            }
        });
        a3CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(3);
            }
        });
        a4CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(4);
            }
        });
        a5CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(5);
            }
        });
        a6CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(6);
            }
        });
        a7CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(7);
            }
        });
        a8CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(8);
            }
        });
        a9CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(9);
            }
        });
        a10CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(10);
            }
        });
        number11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(11);
            }
        });
        number12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(12);
            }
        });
        number13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(13);
            }
        });
        number14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(14);
            }
        });
        number15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(15);
            }
        });
        number16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(16);
            }
        });
        number17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(17);
            }
        });
        number18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(18);
            }
        });
        number19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(19);
            }
        });
        number20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(20);
            }
        });
        number21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(21);
            }
        });
        number22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(22);
            }
        });
        number23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(23);
            }
        });
        number24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(24);
            }
        });
        number25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(25);
            }
        });
        number26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(26);
            }
        });
        number27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(27);
            }
        });
        number28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(28);
            }
        });
        number29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(29);
            }
        });
        number30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(30);
            }
        });
        number31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(31);
            }
        });
        number32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(32);
            }
        });
        number33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(33);
            }
        });
        number34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(34);
            }
        });
        number35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(35);
            }
        });
        number36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(36);
            }
        });
        number37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(37);
            }
        });
        number38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(38);
            }
        });
        number39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(39);
            }
        });
        number40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(40);
            }
        });
        number41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(41);
            }
        });
        number42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(42);
            }
        });
        number43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(43);
            }
        });
        number44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(44);
            }
        });
        number45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(45);
            }
        });
        number46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(46);
            }
        });
        number47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(47);
            }
        });
        натиснетеТукЗаДаButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberGenerator(lotteryNumbers);
                JOptionPane.showMessageDialog(null, "Your numbers are" + userPicks + '\n' + "The winning numbers are" + lotteryNumbers + '\n' + getYourPrize(lotteryNumbers, userPicks));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Toto");
        frame.setContentPane(new Lottery().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}