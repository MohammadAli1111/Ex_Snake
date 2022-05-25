/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_snake;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Mohammad
 */
public class MyPlayer {
    public static void play(String filename)
{
    try
    {
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(new File(filename)));
        clip.start();
    }
    catch (Exception exc)
    {
        exc.printStackTrace(System.out);
    }
}
}
