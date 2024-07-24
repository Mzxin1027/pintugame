import com.ma.ui.GameJFrame;
import com.ma.ui.LoginJFrame;
import com.ma.ui.RegisterJFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //程序启动入口
      new LoginJFrame();
      new GameJFrame();
      new RegisterJFrame();
    }
}
