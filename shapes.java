package com.anna.msccs;
import java.applet.*;
import java.awt.*;

public class  shapes extends Applet
{
    public void paint(Graphics g)
    {	
        g.drawLine(20, 20, 400, 20);
        g.fillRect(20, 40, 200, 40);
        g.fillOval(20, 100, 200, 200);

   }
}