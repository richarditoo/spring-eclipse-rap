package com.example.rap;

import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class AppEntryPoint implements EntryPoint {

    @Override
    public int createUI() {

        System.out.println("AppEntryPoint executado!");

        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("RAP com Spring Boot");
        shell.setSize(400, 200);

        Label label = new Label(shell, SWT.NONE);
        label.setText("Olá! Este é um app RAP com Spring Boot.");
        label.setBounds(50, 50, 300, 20);

        shell.open();
       /* while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose(); */
        return 0;
    }
}
