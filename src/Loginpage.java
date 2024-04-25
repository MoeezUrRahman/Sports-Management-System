import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Loginpage extends JFrame implements ActionListener {
    ImageIcon close=new ImageIcon("closebutton.png");
    Image closee=close.getImage().getScaledInstance(20,15,Image.SCALE_SMOOTH);
    ImageIcon right=new ImageIcon("right1.png");
    Image right1=right.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);
    ImageIcon admin=new ImageIcon("admin.png");
    Image adm=admin.getImage().getScaledInstance(180,150,Image.SCALE_SMOOTH);



    JLabel lefttoplabel=new JLabel("NUST Sports Management System");
    JLabel righttoplabel=new JLabel();
    JLabel rightlabel=new JLabel();
    JLabel leftlabel=new JLabel();
    JLabel insider=new JLabel();





    JButton closebutton=new JButton();
    Border border=BorderFactory.createEmptyBorder();
    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();
    JButton login=new JButton();
    
            Loginpage(){
                textpassfields();
                righttoplabel();
                lefttoplabel();
                rightlabel();
                leftlabel();
                frame();
            }
            protected void textpassfields(){
                username.setBounds(130,203,220,30);
                username.setForeground(Color.white);
                username.setCaretColor(Color.white);
                username.setFont(new Font("Calibri",Font.PLAIN,16));
                username.setOpaque(false);
                username.setBackground(new Color(188, 183, 183));
                username.setBorder(border);


                password.setBounds(135,405,220,30);
                password.setForeground(Color.white);
                password.setCaretColor(Color.white);
                password.setFont(new Font("Calibri",Font.PLAIN,16));
                password.setOpaque(false);
                password.setBackground(new Color(188, 183, 183));
                password.setBorder(border);


                login.setBounds(100,480,300,40);
                login.setText("Login");
                login.setFocusable(false);
                login.setForeground(Color.WHITE);
                login.setFont(new Font("Calibri",Font.PLAIN,20));
                login.setOpaque(true);
                login.setBackground(new Color(250, 151, 57));
                login.setBorder(border);
                login.addActionListener(this);

            }
            protected void righttoplabel(){
                //---------------CLOSEBUTTON-----------
                closebutton.setBounds(420,0,20,15);
                closebutton.setBackground(Color.WHITE);
                closebutton.setOpaque(false);
                closebutton.setFocusable(false);
                closebutton.setBorder(border);
                close.setImage(closee);
                closebutton.setIcon(close);
                closebutton.addActionListener(this);



                righttoplabel.setBounds(450,0,450,30);
                righttoplabel.setBackground(new Color(13,36,51));
                righttoplabel.setOpaque(true);
                righttoplabel.setForeground(Color.WHITE);
                righttoplabel.setFont(new Font("Calibri Light",Font.PLAIN,14));
                righttoplabel.add(closebutton);
            }

    protected void lefttoplabel() {
        lefttoplabel.setBounds(0,0,450,30);
        lefttoplabel.setBackground(new Color(250, 151, 57));
        lefttoplabel.setOpaque(true);
        lefttoplabel.setForeground(new Color(13,36,51));
        lefttoplabel.setFont(new Font("Calibri Light",Font.PLAIN,14));
    }

    protected void rightlabel(){
        rightlabel.setBounds(450,30,450,570);
        rightlabel.setBackground(new Color(13,36,51));
        rightlabel.setOpaque(true);
        rightlabel.setHorizontalAlignment(JLabel.CENTER);
        right.setImage(right1);
        rightlabel.setIcon(right);
        rightlabel.add(username);
        rightlabel.add(password);
        rightlabel.add(login);
            }
    protected void leftlabel(){
                insider.setBounds(100,100,300,300);
        admin.setImage(adm);
        insider.setBackground(new Color(250, 151, 57));
        insider.setOpaque(false);
        insider.setText("Admin Login");
        insider.setForeground(Color.white);
        insider.setFont(new Font("Times new Roman",Font.BOLD,40));
        insider.setIconTextGap(50);
        insider.setHorizontalTextPosition(JLabel.CENTER);
        insider.setVerticalTextPosition(JLabel.BOTTOM);
        insider.setIcon(admin);




                leftlabel.setBounds(0,30,450,570);
                leftlabel.setBackground(new Color(250, 151, 57));
                leftlabel.setOpaque(true);
                leftlabel.add(insider);


            }
    protected void frame(){
                this.setSize(900,600);
                this.setUndecorated(true);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.add(leftlabel);
                this.add(rightlabel);
                this.add(lefttoplabel);
                this.add(righttoplabel);
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==closebutton){
            this.dispose();
        }
        if(e.getSource()==login){
            String ID="admin@nust.pk";
            String pas="123";
            String usernamee=username.getText();
            String passworde=password.getText();
            if(ID.equals(usernamee) && pas.equals(passworde)){
                this.dispose();
                new Homepage();
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect ID or Password");
            }
        }
    }

}
