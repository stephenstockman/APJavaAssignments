/**
 * This is the GUI interfae for instructions
 * It includes a method to open and close the instructions GUI
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class insGUI extends JFrame
{
    private JLabelGUI welLabel;
    private JLabelGUI simLabel;
    private JLabelGUI youLabel;
    private JLabelGUI easyLabel;
    private JLabelGUI medLabel;
    private JLabelGUI hardLabel;
    private JLabelGUI newLabel;
    private JLabelGUI exitLabel;
    private JButtonGUI okButton;

    public insGUI() 
    {
        this.setTitle("instructions");
        this.setSize(500,400);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(220,220,220));

        welLabel = new JLabelGUI("Welcome to WordGuess!");
        welLabel.setBounds(5,5,500,35);

        simLabel = new JLabelGUI("Similar to Hangman, this game challenges you to guess a hidden word byy uncovering letters one at a time.");
        simLabel.setBounds(5,55,500,35);

        youLabel = new JLabelGUI("You will be allowed a certain number of incorrect quesses, based on the skill level you have chosen:");
        youLabel.setBounds(5,105,500,35);

        easyLabel = new JLabelGUI("EASY 15 incorrect guesses allowed.");
        easyLabel.setBounds(25,155,500,35);

        medLabel = new JLabelGUI("MEDIUM 10 incorrect guesses allowed.");
        medLabel.setBounds(25,180,500,35);

        hardLabel = new JLabelGUI("HARD 5 incorrect guesses allowed.");
        hardLabel.setBounds(25,205,500,35);

        newLabel = new JLabelGUI("You may restart with a new word at any time by pressing the [New Puzzle] button.");
        newLabel.setBounds(5,255,500,35);

        exitLabel = new JLabelGUI("To exit the game, simply close the window.");
        exitLabel.setBounds(5,305,500,35);

        okButton = new JButtonGUI("ok");
        okButton.setBounds(200,360,90,35);

        okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    okPressed(evt);
                }
            });

        okButton.addKeyListener(new KeyAdapter() {

                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_ENTER){
                        if(gameGUI.open == false)
                        {
                            gameGUI gamegui = new gameGUI();
                            gamegui.init();
                        }
                        setVisible(false);
                    }
                }
            });

        contentPane.add(easyLabel);
        contentPane.add(exitLabel);
        contentPane.add(hardLabel);
        contentPane.add(medLabel);
        contentPane.add(newLabel);
        contentPane.add(okButton);
        contentPane.add(simLabel);
        contentPane.add(welLabel);
        contentPane.add(youLabel);
        this.add(contentPane);
    }
    /**
     * sets JFrame settings and makes it visible
     */
    public void init()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    /**
     * @param evt an ActionEvent that signals that the ok button was pressed
     * opens gamegui when ok is pressed
     */
    private void okPressed (ActionEvent evt) {
        if(gameGUI.open == false)
        {
            gameGUI gamegui = new gameGUI();
            gamegui.init();
        }
        this.setVisible(false);
    }
}