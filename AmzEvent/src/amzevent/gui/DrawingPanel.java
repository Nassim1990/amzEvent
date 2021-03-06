  package amzevent.gui;  
 import amzevent.domain.drawing.ComposantesDeSalleDrawer;
 import java.awt.Dimension;
 import java.awt.Graphics;
 import java.io.Serializable;
 import javax.swing.JPanel;
 import javax.swing.border.BevelBorder;
  
 
  public class DrawingPanel extends javax.swing.JPanel
  {
     public Dimension initialDimension;
     private MainWindow mainWindow;
 
     public DrawingPanel()
     {
     }
 
     public DrawingPanel(MainWindow mainWindow) 
     {
         this.mainWindow = mainWindow;
         setBorder(new javax.swing.border.BevelBorder(BevelBorder.LOWERED));
         int width = (int) mainWindow.getSize().width/2;
         setPreferredSize(new Dimension(width,1));
         int height = (int)(width*0.5);
         initialDimension = new Dimension(width,height);
         initialDimension = new Dimension(600,300);
         
         setVisible(true);
         
     }
 
     @Override
     protected void paintComponent(Graphics g)
     {
        if (mainWindow != null)
        {
            super.paintComponent(g); 
            ComposantesDeSalleDrawer mainDrawer = new ComposantesDeSalleDrawer(mainWindow.controller,initialDimension);
            mainDrawer.draw(g);
        }
     }
 
     public MainWindow getMainWindow()
     {
         return mainWindow;
     }
 
     public void setMainWindow(MainWindow mainWindow)
     {
         this.mainWindow = mainWindow;
     }
 
     public Dimension getInitialDimension()
     {
         return initialDimension;
     }
 
     public void setInitialDimension()
     {
     }
  }