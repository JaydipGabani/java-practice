import java.applet.*;
/*<applet code="SoundApplet" width=300 height=300></applet>*/

public class SoundApplet extends Applet {

   public void init() {

      super.init();

      AudioClip gong = getAudioClip(getDocumentBase(), "def.wav");
      gong.play();

   }

}

