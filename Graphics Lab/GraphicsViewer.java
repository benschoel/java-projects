// GraphicsLab

import java.awt.*;
import java.applet.*;

public class GraphicsViewer extends Applet{

    public void paint(Graphics g){
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);

        // Draw bottom-right corner

        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            x1 += width / 50;
            y2 -= height / 50;
        }

        x1 = 10;
        y2 = 640;

        for(int i = 0; i < 51; i++){
            g.drawLine(x2, y1, x1, y2);
            x2 -= width / 50;
            y2 -= height / 50;
        }

        x2 = 990;
        y2 = 10;
        y1 = 10;

        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            y1 += height / 50;
            x2 -= width / 50;
        }

        x2 = 990;
        y1 = 10;

        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            y2 += height / 50;
            x1 += width / 50;
        }

        int initialWidth = width;
        int initialHeight = height;
        
        width = 490;
        height = 315;
        x1 = 10 + (initialWidth / 4);
        y1 = 640 - (initialHeight / 4);
        x2 = 990 - (initialWidth / 4);
        y2 = 640 - (initialHeight / 4);
        g.drawRect(10 + (980 / 4),10 + (630 / 4),width,height);
        
        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            x1 += width / 50;
            y2 -= height / 50;
        }
        
        x1 = 10 + (initialWidth / 4);
        y1 = 640 - (initialHeight / 4);
        x2 = 990 - (initialWidth / 4);
        y2 = 640 - (initialHeight / 4);
        
        for(int i = 0; i < 51; i++){
            g.drawLine(x2, y1, x1, y2);
            x2 -= width / 50;
            y2 -= height / 50;
        }
        
        x1 = 10 + (initialWidth / 4);
        y1 = 10 + (initialHeight / 4);
        x2 = 990 - (initialWidth / 4);
        y2 = 10 + (initialHeight / 4);
        
        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            y1 += height / 50;
            x2 -= width / 50;
        }
        
        x1 = 10 + (initialWidth / 4);
        y1 = 10 + (initialHeight / 4);
        x2 = 990 - (initialWidth / 4);
        y2 = 10 + (initialHeight / 4);
        
        for(int i = 0; i < 51; i++){
            g.drawLine(x1, y1, x2, y2);
            y2 += height / 50;
            x1 += width / 50;
        }
        

    }
}