/**
 * This is the GUI interface for the main hangman game
 * It includes methods for updating and interacting with the GUI
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class gameGUI extends JFrame
{
    private JLabelGUI dashLabel;
    private JLabelGUI availLabel;
    private JLabelGUI guessLabel;
    private JLabelGUI incLabel;
    private JLabelGUI entLabel;
    private JLabelGUI skillLabel;
    private GuessText guessText;
    private JCheckBoxGUI easyCheck;
    private JCheckBoxGUI medCheck;
    private JCheckBoxGUI hardCheck;
    private JButtonGUI insButton;
    private JButtonGUI newButton;
    private JButtonGUI subButton;
    private ButtonGroup bg;

    /**gameGUI is open or not*/
    static public boolean open =false;
    
    static private int incG =15;
    static private int curIncG=0;
    static private String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static private String guessList="";
    static private String curGuess="";
    static private String yourWord="";
    static private String dashWord="";
    static private boolean gameOver=false;
    static private List<String> list = new ArrayList<String>();

    public gameGUI()
    {
        this.setTitle("game");
        this.setSize(500,300);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,300));
        contentPane.setBackground(new Color(220,220,220));

        dashLabel = new JLabelGUI("Your word: ");
        dashLabel.setBounds(5,5,483,31);

        availLabel = new JLabelGUI("Available letters: " + alphabet);
        availLabel.setBounds(5,46,492,27);

        guessLabel = new JLabelGUI("Guessed letters:");
        guessLabel.setBounds(5,86,484,21);

        incLabel = new JLabelGUI("Incorrect guesses: " + curIncG + " of " + incG);
        incLabel.setBounds(5,125,478,15);

        entLabel = new JLabelGUI("Enter your guess: ");
        entLabel.setBounds(5,154,106,31);

        skillLabel = new JLabelGUI("Skill Level:");
        skillLabel.setBounds(5,197,90,35);

        guessText = new GuessText();
        guessText.setBounds(104,153,280,30);

        guessText.addKeyListener(new KeyAdapter() {

                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_ENTER){
                        subClick();
                    }
                }
            });
        bg = new ButtonGroup();
        easyCheck = new JCheckBoxGUI("Easy");
        bg.add(easyCheck);
        easyCheck.setBounds(5,222,90,35);
        easyCheck.setSelected(true);
        easyCheck.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    easyClick();
                }
            });

        medCheck = new JCheckBoxGUI("Medium");
        bg.add(medCheck);
        medCheck.setBounds(5,244,90,35);
        medCheck.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    medClick();
                }
            });

        hardCheck = new JCheckBoxGUI("Hard");
        bg.add(hardCheck);
        hardCheck.setBounds(5,267,90,35);
        hardCheck.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    hardClick();
                }
            });

        insButton = new JButtonGUI("Instructions");
        insButton.setBounds(272,267,113,28); 
        insButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    insClick();
                }
            });

        newButton = new JButtonGUI("New Puzzle");
        newButton.setBounds(385,268,110,27);
        newButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    newClick();
                }
            });

        subButton = new JButtonGUI("Submit");
        subButton.setBounds(386,156,100,26);
        subButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    subClick();
                }
            });

        contentPane.add(availLabel);
        contentPane.add(dashLabel);
        contentPane.add(easyCheck);
        contentPane.add(entLabel);
        contentPane.add(guessLabel);
        contentPane.add(guessText);
        contentPane.add(hardCheck);
        contentPane.add(incLabel);
        contentPane.add(insButton);
        contentPane.add(medCheck);
        contentPane.add(newButton);
        contentPane.add(skillLabel);
        contentPane.add(subButton);
        try
        {
            reset();
        }catch(Exception e){}
        this.add(contentPane);
    }

    /**
     * sets details to the JFrame and makes it visible
     */
    public void init()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    /**
     * selects a random word from a list
     * 
     * @return a string that contains the randomly selected word
     * @throws IOException-if file not present
     */
    private String randWord() throws IOException
    {
        String word="";
        Scanner fileReader = new Scanner(new File("words.txt"));
        String text = fileReader.nextLine();
        String[] sArr = text.split(" ");
        for(String s:sArr){
            gameGUI.list.add(s);
        }
        Random r = new Random();
        word = gameGUI.list.get(r.nextInt(gameGUI.list.size()));
        return word;
    }

    /**
     * resets all variables
     * 
     * @throws IOException-if file not present
     */
    private  void reset() throws IOException
    {
        yourWord=randWord();
        dashWord="";
        for(int i=0; i < yourWord.length();i++)
        {
            dashWord+="-";
        }
        alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        curIncG=0;
        gameOver=false;
        guessList="";
        update();

    }

    /**
     * updates all JLabels with latest Data
     */
    private void update()
    {
        dashLabel.setText("Your word: " +dashWord);
        guessLabel.setText("Guessed letters:" +guessList);
        guessText.setText("");
        availLabel.setText("Available letters: " + alphabet);
        incLabel.setText("Incorrect guesses: "+curIncG+" of "+incG);
    }

    /**
     * creates an instance of the instruction GUI and inits it
     */
    private void insClick () {
        insGUI insgui = new insGUI();
        insgui.init();
        open=true;

    }

    /**
     * changes checkbox display and sets cap to guesses to 15
     */
    private void easyClick () 
    {
        easyCheck.select(bg,easyCheck);
        incG=15;
        incLabel.setText("Incorrect guesses: "+curIncG+" of "+incG);
    }

    /**
     * changes checkbox display and sets cap to guesses to 10
     */
    private void medClick () 
    {
        medCheck.select(bg,medCheck);
        incG=10;
        incLabel.setText("Incorrect guesses: "+curIncG+" of "+incG);
    }

    /**
     * changes checkbox display and sets cap to guesses to 5
     */
    private void hardClick () 
    {
        hardCheck.select(bg,hardCheck);
        incG=5;
        incLabel.setText("Incorrect guesses: "+curIncG+" of "+incG);
    }

    /** 
     * resets all variables
     */
    private void newClick () {
        try
        {
            reset();
        }catch(Exception e){}
    }

    /** 
     * input sanitization for guesses
     * updates all the variables associated with dynamic labels
     * tests the condition for winning/losing
     */
    private void subClick () {
        if((alphabet.indexOf(guessText.getText().toUpperCase()) != -1) && (gameOver==false) && ((guessText.getText().toUpperCase().compareTo("")) != 0) && (guessText.getText().length() == 1))
        {
            curIncG++;
            curGuess = guessText.getText().toUpperCase();
            guessList+=curGuess;

            for (int index = yourWord.indexOf(curGuess);index >= 0;index = yourWord.indexOf(curGuess, index + 1))
            {
                dashWord = dashWord.substring(0,index)+yourWord.charAt(index)+dashWord.substring(index+1);
            }

            if( dashWord.indexOf("-") == -1)
            {
                JOptionPane.showMessageDialog(new JFrame(),"You Win");
                gameOver=true;
            }
            else if(curIncG >= incG)
            {
                JOptionPane.showMessageDialog(new JFrame(),"You Lose");
                gameOver=true;
            }
            alphabet = alphabet.substring(0,alphabet.indexOf(curGuess))+alphabet.substring(alphabet.indexOf(curGuess)+1);
            update();
        }
        else
        {
            if((guessText.getText().toUpperCase().compareTo("")) == 0 && (gameOver==false))
            {
                JOptionPane.showMessageDialog(new JFrame(),"No letter entered");
            }
            if(guessText.getText().length() !=1 && (gameOver == false))
            {
                JOptionPane.showMessageDialog(new JFrame(),"Only guess one letter at a time please");
            }
            else if(gameOver==false)
            {
                JOptionPane.showMessageDialog(new JFrame(),"Not available to be guessed");
            }
            else
            {
                JOptionPane.showMessageDialog(new JFrame(),"Game is Over please select new puzzle");
            }
        }
    }

}