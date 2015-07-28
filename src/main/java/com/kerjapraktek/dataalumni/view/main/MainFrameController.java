package com.kerjapraktek.dataalumni.view.main;

import javax.swing.JFrame;
import org.springframework.stereotype.Controller;

@Controller
public class MainFrameController {

    public void setFullscreenWindow(JFrame jframe) {
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void setCenteredWindow(JFrame jframe) {
        jframe.setLocationRelativeTo(null);
    }
}
