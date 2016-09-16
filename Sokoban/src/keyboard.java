import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public abstract class keyboard implements KeyListener{
	public void keyPressed(KeyEvent e) {
    int keycode = e.getKeyCode();
    
    if(keycode == KeyEvent.VK_R){
        //resetLevel();
    }
    
    if(keycode == KeyEvent.VK_W){
        //pullBox(DIRECTION.NORTH);
    }
    if(keycode == KeyEvent.VK_A){
        //pullBox(DIRECTION.WEST);
    }
    if(keycode == KeyEvent.VK_S){
        //pullBox(DIRECTION.SOUTH);
    }
    if(keycode == KeyEvent.VK_D){
        //pullBox(DIRECTION.EAST);
    }
    
    
    if (keycode == KeyEvent.VK_UP) {
        //movePlayer(DIRECTION.NORTH);
    }
    if (keycode == KeyEvent.VK_DOWN) {
        //movePlayer(DIRECTION.SOUTH);
    }   
    if (keycode == KeyEvent.VK_LEFT) {
        //movePlayer(DIRECTION.WEST);
    }
    if (keycode == KeyEvent.VK_RIGHT) {      
        //movePlayer(DIRECTION.EAST);
    }
  }
}
