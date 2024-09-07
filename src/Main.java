import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy bird");//creates a frame and adds a tile to the frame
       // frame.setVisible(true);//to make the frame visible
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);//to place the window at the centre of our screen
        frame.setResizable(false);//frame cannot be resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to terminate the program when the user click on close icon

        FlappyBird flappyBird = new FlappyBird();//instance of FlappyBird
        frame.add(flappyBird);//attaches the flappyBird component to the JFrame
        frame.pack();//the frame will be resized to match the preferred sizes of its components
        frame.setVisible(true);//to make the frame visible
    }
}