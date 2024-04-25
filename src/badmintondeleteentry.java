import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class badmintondeleteentry extends JFrame implements ActionListener {
    Border border=BorderFactory.createEmptyBorder();
    ImageIcon close=new ImageIcon("closebutton.png");
    Image closee=close.getImage().getScaledInstance(20,15,Image.SCALE_SMOOTH);
    ImageIcon lines=new ImageIcon("lines.png");
    Image liness=lines.getImage().getScaledInstance(300,250,Image.SCALE_SMOOTH);


    JTextField name=new JTextField();
    JTextField title=new JTextField();
    JTextField course=new JTextField();
    JTextField id=new JTextField();
    JTextField time=new JTextField();
    String[] combo={"Reserved","In Use"};
    JComboBox status=new JComboBox(combo);



    JLabel leftlabel=new JLabel();
    JLabel righlabel=new JLabel();
    JLabel namelabel=new JLabel();
    JLabel courselabel=new JLabel();
    JLabel idlabel=new JLabel();
    JLabel timelabel=new JLabel();
    JLabel statuslabel=new JLabel();
    JLabel statusright=new JLabel();



    JButton closebutton=new JButton();
    JButton login=new JButton();
    badmintondeleteentry(){
        textfields();
        textfieldlabels();
        labels();
        frame();
    }
    protected void textfields(){
        login.setBounds(10,400,300,30);
        login.setText("Delete Data");
        login.setFocusable(false);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Calibri",Font.BOLD,20));
        login.setOpaque(true);
        login.setBackground(new Color(250, 151, 57));
        login.setBorder(border);
        login.addActionListener(this);


//        name.setText("Enter Data here: ");
        name.setBounds(5,100,400,30);
        name.setBackground(new Color(13,36,51));
        name.setOpaque(false);
        name.setCaretColor(Color.white);
        name.setEditable(true);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Calibri",Font.BOLD,20));
        name.setBorder(border);

//        course.setText("Enter Data here: ");
        course.setBounds(5,160,400,30);
        course.setBackground(new Color(13,36,51));
        course.setOpaque(false);
        course.setCaretColor(Color.white);
        course.setEditable(true);
        course.setForeground(Color.WHITE);
        course.setFont(new Font("Calibri",Font.BOLD,20));
        course.setBorder(border);

//        id.setText("Enter Data here: ");
        id.setBounds(5,220,400,30);
        id.setBackground(new Color(13,36,51));
        id.setOpaque(false);
        id.setCaretColor(Color.white);
        id.setEditable(true);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Calibri",Font.BOLD,20));
        id.setBorder(border);

//        time.setText("Enter Data here: ");
        time.setBounds(5,283,400,30);
        time.setBackground(new Color(13,36,51));
        time.setOpaque(false);
        time.setCaretColor(Color.white);
        time.setEditable(true);
        time.setForeground(Color.WHITE);
        time.setFont(new Font("Calibri",Font.BOLD,20));
        time.setBorder(border);

        status.setVisible(true);
        status.setSelectedIndex(0);
        status.setBounds(5,0,290,27);
        status.setBackground(new Color(13,36,51));
        status.setOpaque(true);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Calibri",Font.BOLD,20));
        status.setBorder(border);



        title.setText("Delete Data Entry");
        title.setBounds(50,10,400,40);
        title.setBackground(new Color(13,36,51));
        title.setEditable(false);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("SDRoboticsDemo",Font.BOLD,26));
        title.setBorder(border);
    }
    protected void textfieldlabels(){
        namelabel.setBounds(40,100,100,30);
        namelabel.setText("Name : ");
        namelabel.setBackground(new Color(250,151,47));
        namelabel.setOpaque(true);
        namelabel.setForeground(Color.WHITE);
        namelabel.setFont(new Font("Inter",Font.BOLD,20));


        courselabel.setBounds(40,165,100,30);
        courselabel.setText("Course : ");
        courselabel.setBackground(new Color(250,151,47));
        courselabel.setOpaque(true);
        courselabel.setForeground(Color.WHITE);
        courselabel.setFont(new Font("Inter",Font.BOLD,20));


        idlabel.setBounds(40,225,100,30);
        idlabel.setText("CMS ID : ");
        idlabel.setBackground(new Color(250,151,47));
        idlabel.setOpaque(true);
        idlabel.setForeground(Color.WHITE);
        idlabel.setFont(new Font("Inter",Font.BOLD,20));


        timelabel.setBounds(40,287,200,30);
        timelabel.setText("Current Time : ");
        timelabel.setBackground(new Color(250,151,47));
        timelabel.setOpaque(true);
        timelabel.setForeground(Color.WHITE);
        timelabel.setFont(new Font("Inter",Font.BOLD,20));


        statuslabel.setBounds(40,350,200,30);
        statuslabel.setText("Set Status : ");
        statuslabel.setBackground(new Color(250,151,47));
        statuslabel.setOpaque(true);
        statuslabel.setForeground(Color.WHITE);
        statuslabel.setFont(new Font("Inter",Font.BOLD,20));

        statusright.setBounds(0,345,300,30);
        statusright.setBackground(new Color(13,36,51));
        statusright.setOpaque(true);
        statusright.setForeground(Color.WHITE);
        statusright.setFont(new Font("Calibri",Font.BOLD,20));
        statusright.setBorder(border);
        statusright.add(status);
    }
    protected void labels(){

        lines.setImage(liness);
        righlabel.setBounds(200,0,500,500);
        righlabel.setBackground(new Color(13,36,51));
        righlabel.setOpaque(true);
        righlabel.setIcon(lines);
        righlabel.add(title);
        righlabel.add(name);
        righlabel.add(course);
        righlabel.add(id);
        righlabel.add(time);
        righlabel.add(statusright);
        righlabel.add(login);



        leftlabel.setBounds(0,0,200,500);
        leftlabel.setBackground(new Color(250,151,47));
        leftlabel.setOpaque(true);
        leftlabel.add(namelabel);
        leftlabel.add(courselabel);
        leftlabel.add(idlabel);
        leftlabel.add(timelabel);
        leftlabel.add(statuslabel);
    }
    protected void frame(){
        closebutton.setBounds(670,5,20,15);
        closebutton.setBackground(Color.WHITE);
        closebutton.setOpaque(false);
        closebutton.setFocusable(false);
        closebutton.setBorder(border);
        close.setImage(closee);
        closebutton.setIcon(close);
        closebutton.addActionListener(this);



        this.setSize(700,500);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(closebutton);
        this.add(leftlabel);
        this.add(righlabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==closebutton){
            this.dispose();
        }
        if(e.getSource()==login){
            String a=name.getText();
            String b=course.getText();
            String c=id.getText();
            String d=time.getText();
            String f=(String) status.getSelectedItem();


            if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || f.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all required data");
            }
            else{
                DBHandler dbHandler = new DBHandler();

                try {
                    if(f == "Reserved")
                    {
                        f = "Reserver";
                    }

                    if (f == "In Use")
                    {
                        f = "Lender";
                    }
                    dbHandler.modifyRecord("Rackets",f,"","","","");
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null," Record has been deleted.");
                this.dispose();}
        }
    }
}
