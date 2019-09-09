import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
class audio{
	public static void main(String s[]){
try{
    AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(AudioSystem.getResource("H:/java/Roar.mp3"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
}
catch(Exception ex)
{}
}
}