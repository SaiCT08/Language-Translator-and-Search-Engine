package dragonshoutproject;

import java.io.FileNotFoundException;

/**
 *
 * @author Sai Thupakula 2B
 */
public class ProjectRunner 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        DragonTranslator translate = new DragonTranslator();
        StartPage startFrame = new StartPage();
        startFrame.setVisible(true);
    }
}
