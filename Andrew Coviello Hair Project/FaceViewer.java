import javax.swing.JFrame;

public class FaceViewer
{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(632, 352);
        frame.setTitle("Graphics2D Hair Reference");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}