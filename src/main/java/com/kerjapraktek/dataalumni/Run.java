package com.kerjapraktek.dataalumni;

import com.kerjapraktek.dataalumni.view.main.MainFrame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alee.laf.WebLookAndFeel;

public class Run {

    public static void main(String[] args) {
        WebLookAndFeel.install ();
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ac.registerShutdownHook();
        MainFrame bean = ac.getBean(MainFrame.class);
        bean.setVisible(true);
    }

}
