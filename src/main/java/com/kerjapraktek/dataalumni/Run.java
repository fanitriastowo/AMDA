package com.kerjapraktek.dataalumni;

import com.kerjapraktek.dataalumni.view.main.MainFrame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ac.registerShutdownHook();
        MainFrame bean = ac.getBean(MainFrame.class);
        bean.setVisible(true);
    }

}
