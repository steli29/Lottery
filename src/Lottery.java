import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


public class Lottery {
    List<Integer> userPicks = new ArrayList<>();
    List<Integer> firstDrawOfNumbers = new ArrayList<>();
    List<Integer> secondDrawOfNumbers = new ArrayList<>();
    List<Integer> thirdDrawOfNumbers = new ArrayList<>();

    private JPanel firstRow;
    private JPanel secondRow;
    private JPanel thirdRow;
    private JPanel fourthRow;
    private JPanel fifthRow;
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
    private JCheckBox number1;
    private JCheckBox number2;
    private JCheckBox number9;
    private JCheckBox number3;
    private JCheckBox number4;
    private JCheckBox number5;
    private JCheckBox number6;
    private JCheckBox number8;
    private JCheckBox number7;
    private JCheckBox number41;
    private JCheckBox number46;
    private JCheckBox number45;
    private JCheckBox number44;
    private JCheckBox number43;
    private JCheckBox number42;
    private JCheckBox number47;
    private JCheckBox number10;
    private JButton натиснетеТукЗаДаButton;
    private JCheckBox number48;
    private JCheckBox number49;


    public static void numberGenerator(List<Integer> number) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            number.add(rand.nextInt(49) + 1);
            for (int j = i; j >= 0; j--) {
                if (number.get(i) == number.get(j)) {
                    number.remove(i);
                    number.add(rand.nextInt(49) + 1);
                }
            }
        }
    }

    public static String getYourPrize(List<Integer> firstDraw, List<Integer> secondDraw, List<Integer> thirdDraw, List<Integer> userNumbers) {
        int counter, maxCounter = 0;
        String prize;
        counter = checkIfCounterIsBigger(firstDraw, userNumbers);
        if (counter > maxCounter) {
            maxCounter = counter;
        }
        counter = checkIfCounterIsBigger(secondDraw, userNumbers);
        if (counter > maxCounter) {
            maxCounter = counter;
        }
        counter = checkIfCounterIsBigger(thirdDraw, userNumbers);
        if (counter > maxCounter) {
            maxCounter = counter;
        }
        prize = counterOfNumbers(maxCounter);
        return prize;
    }

    public static int checkIfCounterIsBigger(List<Integer> drawing, List<Integer> numbersOfClient) {
        int counter = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbersOfClient.get(i) == drawing.get(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String counterOfNumbers(int counter) {
        String prize;
        switch (counter) {
            case 1:
                prize = "You guessed 1 number and win 3€";
                break;
            case 2:
                prize = "You guessed 2 numbers and win 10€";
                break;
            case 3:
                prize = "You guessed 3 numbers and win 50€";
                break;
            case 4:
                prize = "You guessed 4 numbers and win 500€";
                break;
            case 5:
                prize = "You guessed 5 numbers and win 1000€";
                break;
            case 6:
                prize = "Congratulations! You guessed all the numbers and win the grand prize 1 000 000€ ";
                break;
            default:
                prize = "You don't win anything.0 guessed numbers.Next time you will be lucky";
        }
        return prize;
    }

    public Lottery() {

        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(1);
            }
        });
        number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(2);
            }
        });
        number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(3);
            }
        });
        number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(4);
            }
        });
        number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(5);
            }
        });
        number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(6);
            }
        });
        number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(7);
            }
        });
        number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(8);
            }
        });
        number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(9);
            }
        });
        number10.addActionListener(new ActionListener() {
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
        number48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(48);
            }
        });
        number49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPicks.add(49);
            }
        });
        натиснетеТукЗаДаButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberGenerator(firstDrawOfNumbers);
                numberGenerator(secondDrawOfNumbers);
                numberGenerator(thirdDrawOfNumbers);
                JOptionPane.showMessageDialog(null, "First draw " + firstDrawOfNumbers + '\n' + "Second draw " + secondDrawOfNumbers + '\n'
                        + "Third draw " + thirdDrawOfNumbers + '\n' + getYourPrize(firstDrawOfNumbers, secondDrawOfNumbers, thirdDrawOfNumbers, userPicks));
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