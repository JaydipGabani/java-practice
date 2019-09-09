import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="PlaySoundApplet" width=300 height=300></applet>*/
public class PlaySoundApplet extends Applet 
implements ActionListener{
   Button play,stop;
   AudioClip audioClip;
   public void init(){
      play = new Button("  Play in Loop  ");
      add(play);
      play.addActionListener(this);
      stop = new Button("  Stop  ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "Roar.mp3");
   }
   public void actionPerformed(ActionEvent ae){
      Button source = (Button)ae.getSource();
      if (source.getLabel() == "  Play in Loop  "){
         audioClip.play();
      }  
      else if(source.getLabel() == "  Stop  "){
         audioClip.stop();
      }
   }
}