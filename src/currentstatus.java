import org.checkerframework.checker.units.qual.C;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class currentstatus extends JFrame implements ActionListener {
    public static String std,std1,std2,std3;
    public static String crs,crs1,crs2,crs3;
    public static String tim,tim1,tim2,tim3;
    public static String stat,stat1,stat2,stat3;
    public static String[] dbData = new String[12];




    JButton closebutton=new JButton();
    Border border=BorderFactory.createEmptyBorder();
    ImageIcon close=new ImageIcon("closebutton.png");
    Image closee=close.getImage().getScaledInstance(20,15,Image.SCALE_SMOOTH);


    JLabel leftlabel=new JLabel();
    JLabel righlabel=new JLabel();
    JLabel badmintonlabel=new JLabel();
    JLabel basketballlabel=new JLabel();
    JLabel volleyballlabel=new JLabel();
    JLabel tabletennislabel=new JLabel();



    JTextField title=new JTextField();
    JTextField name=new JTextField();
    JTextField name1=new JTextField();
    JTextField name2=new JTextField();
    JTextField name3=new JTextField();
    JTextField course=new JTextField();
    JTextField course1=new JTextField();
    JTextField course2=new JTextField();
    JTextField course3=new JTextField();
    JTextField status=new JTextField();
    JTextField status1=new JTextField();
    JTextField status2=new JTextField();
    JTextField status3=new JTextField();
    JTextField time=new JTextField();
    JTextField time1=new JTextField();
    JTextField time2=new JTextField();
    JTextField time3=new JTextField();



    JLabel headings=new JLabel();
    currentstatus() throws InterruptedException, IOException {
        textfields();
//        textfieldlabels();
        labels();
        frame();
    }
    protected void textfields() throws IOException, InterruptedException {

        String[] data = {"Rackets","Volleyball","Football","TableTennis"};

        for (int i=0; i<1; i++) {
            DBHandler.readCategoryChild(data);
            crs = dbData[i];
            tim = dbData[i + 1];
            std = dbData[i + 2];

            crs1 = dbData[i + 3];
            tim1 = dbData[i + 4];
            std1 = dbData[i + 5];



            crs2 = dbData[i + 6];
            tim2 = dbData[i + 7];
            std2 = dbData[i + 8];

            crs3 = dbData[i + 9];
            tim3 = dbData[i + 10];
            std3 = dbData[i + 11];
        }




        name.setBounds(5,145,200,30);
        name.setText(std);
        name.setBackground(new Color(13,36,51));
        name.setOpaque(false);
        name.setEditable(false);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Calibri",Font.BOLD,18));
        name.setBorder(border);


        name1.setBounds(5,220,200,30);
        name1.setText(std1);
        name1.setBackground(new Color(13,36,51));
        name1.setOpaque(false);
        name1.setEditable(false);
        name1.setForeground(Color.WHITE);
        name1.setFont(new Font("Calibri",Font.BOLD,18));
        name1.setBorder(border);

        name2.setBounds(5,300,200,30);
        name2.setText(std2);
        name2.setBackground(new Color(13,36,51));
        name2.setOpaque(false);
        name2.setEditable(false);
        name2.setForeground(Color.WHITE);
        name2.setFont(new Font("Calibri",Font.BOLD,18));
        name2.setBorder(border);

        name3.setBounds(5,380,200,30);
        name3.setText(std3);
        name3.setBackground(new Color(13,36,51));
        name3.setOpaque(false);
        name3.setEditable(false);
        name3.setForeground(Color.WHITE);
        name3.setFont(new Font("Calibri",Font.BOLD,18));
        name3.setBorder(border);


        course.setBounds(135,145,225,30);
        course.setText(crs);
        course.setBackground(new Color(13,36,51));
        course.setOpaque(false);
        course.setEditable(false);
        course.setForeground(Color.WHITE);
        course.setFont(new Font("Calibri",Font.BOLD,18));
        course.setBorder(border);

        course1.setBounds(135,220,225,30);
        course1.setText(crs1);
        course1.setBackground(new Color(13,36,51));
        course1.setOpaque(false);
        course1.setEditable(false);
        course1.setForeground(Color.WHITE);
        course1.setFont(new Font("Calibri",Font.BOLD,18));
        course1.setBorder(border);

        course2.setBounds(135,300,225,30);
        course2.setText(crs2);
        course2.setBackground(new Color(13,36,51));
        course2.setOpaque(false);
        course2.setEditable(false);
        course2.setForeground(Color.WHITE);
        course2.setFont(new Font("Calibri",Font.BOLD,18));
        course2.setBorder(border);

        course3.setBounds(135,380,225,30);
        course3.setText(crs3);
        course3.setBackground(new Color(13,36,51));
        course3.setOpaque(false);
        course3.setEditable(false);
        course3.setForeground(Color.WHITE);
        course3.setFont(new Font("Calibri",Font.BOLD,18));
        course3.setBorder(border);

        status.setBounds(280,145,100,30);
        if(crs.isEmpty() || std.isEmpty() || tim.isEmpty()){
            status.setText("");
        }
        else{
        status.setText("In Use");}
        status.setBackground(Color.white);
        status.setOpaque(false);
        status.setEditable(false);
        status.setForeground(Color.white);
        status.setFont(new Font("Calibri",Font.BOLD,18));
        status.setBorder(border);

        status1.setBounds(280,220,100,30);
        if(crs1.isEmpty() || std1.isEmpty() || tim1.isEmpty()){
            status1.setText("");
        }
        else{
            status1.setText("Reservation");}
        status1.setBackground(Color.white);
        status1.setOpaque(false);
        status1.setEditable(false);
        status1.setForeground(Color.white);
        status1.setFont(new Font("Calibri",Font.BOLD,18));
        status1.setBorder(border);

        status2.setBounds(280,300,100,30);
        if(crs2.isEmpty() || std2.isEmpty() || tim2.isEmpty()){
            status2.setText("");
        }
        else{
            status2.setText("In Use");}
        status2.setBackground(Color.white);
        status2.setOpaque(false);
        status2.setEditable(false);
        status2.setForeground(Color.white);
        status2.setFont(new Font("Calibri",Font.BOLD,18));
        status2.setBorder(border);

        status3.setBounds(280,380,100,30);
        if(crs3.isEmpty() || std3.isEmpty() || tim3.isEmpty()){
            status3.setText("");
        }
        else{
            status3.setText("Reservation");}
        status3.setBackground(Color.white);
        status3.setOpaque(false);
        status3.setEditable(false);
        status3.setForeground(Color.white);
        status3.setFont(new Font("Calibri",Font.BOLD,18));
        status3.setBorder(border);

        time.setBounds(450,145,300,30);
        time.setText(tim);
        time.setBackground(new Color(13,36,51));
        time.setOpaque(false);
        time.setEditable(false);
        time.setForeground(Color.WHITE);
        time.setFont(new Font("Calibri",Font.BOLD,18));
        time.setBorder(border);

        time1.setBounds(450,220,300,30);
        time1.setText(tim1);
        time1.setBackground(new Color(13,36,51));
        time1.setOpaque(false);
        time1.setEditable(false);
        time1.setForeground(Color.WHITE);
        time1.setFont(new Font("Calibri",Font.BOLD,18));
        time1.setBorder(border);

        time2.setBounds(450,300,300,30);
        time2.setText(tim2);
        time2.setBackground(new Color(13,36,51));
        time2.setOpaque(false);
        time2.setEditable(false);
        time2.setForeground(Color.WHITE);
        time2.setFont(new Font("Calibri",Font.BOLD,18));
        time2.setBorder(border);

        time3.setBounds(450,380,300,30);
        time3.setText(tim3);
        time3.setBackground(new Color(13,36,51));
        time3.setOpaque(false);
        time3.setEditable(false);
        time3.setForeground(Color.WHITE);
        time3.setFont(new Font("Calibri",Font.BOLD,18));
        time3.setBorder(border);

    }
//    protected void textfieldlabels(){
//        badmintonlabel.setBounds(5,140,200,30);
//        badmintonlabel.setText("1- Badminton ");
//        badmintonlabel.setBackground(new Color(250,151,47));
//        badmintonlabel.setOpaque(true);
//        badmintonlabel.setForeground(Color.WHITE);
//        badmintonlabel.setFont(new Font("Inter",Font.BOLD,20));
//
//
//        basketballlabel.setBounds(5,220,200,30);
//        basketballlabel.setText("2- Volleyball ");
//        basketballlabel.setBackground(new Color(250,151,47));
//        basketballlabel.setOpaque(true);
//        basketballlabel.setForeground(Color.WHITE);
//        basketballlabel.setFont(new Font("Inter",Font.BOLD,20));
//
//
//        volleyballlabel.setBounds(5,300,200,30);
//        volleyballlabel.setText("3- BasketBall ");
//        volleyballlabel.setBackground(new Color(250,151,47));
//        volleyballlabel.setOpaque(true);
//        volleyballlabel.setForeground(Color.WHITE);
//        volleyballlabel.setFont(new Font("Inter",Font.BOLD,20));
//
//
//        tabletennislabel.setBounds(5,380,200,30);
//        tabletennislabel.setText("4- Table tennis ");
//        tabletennislabel.setBackground(new Color(250,151,47));
//        tabletennislabel.setOpaque(true);
//        tabletennislabel.setForeground(Color.WHITE);
//        tabletennislabel.setFont(new Font("Inter",Font.BOLD,20));
//
//
//
//    }

    protected void labels(){
        headings.setBounds(5,80,500,30);
        headings.setBackground(new Color(13,36,51));
        headings.setOpaque(true);
        headings.setText("Name            Course             Status              Time" );
        headings.setForeground(Color.WHITE);
        headings.setFont(new Font("Calibri",Font.BOLD,25));

        title.setText("Current Status");
        title.setBounds(50,10,400,40);
        title.setBackground(new Color(13,36,51));
        title.setEditable(false);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("SDRoboticsDemo",Font.BOLD,26));
        title.setBorder(border);


        righlabel.setBounds(50,0,650,500);
        righlabel.setBackground(new Color(13,36,51));
        righlabel.setOpaque(true);
        righlabel.add(title);
        righlabel.add(headings);
        righlabel.add(name);
        righlabel.add(course);
        righlabel.add(name1);
        righlabel.add(course1);
        righlabel.add(name2);
        righlabel.add(course2);
        righlabel.add(name3);
        righlabel.add(course3);
        righlabel.add(time);
        righlabel.add(time1);
        righlabel.add(time2);
        righlabel.add(time3);
        righlabel.add(status);
        righlabel.add(status1);
        righlabel.add(status2);
        righlabel.add(status3);



        leftlabel.setBounds(0,0,50,500);
        leftlabel.setBackground(new Color(250,151,47));
        leftlabel.setOpaque(true);
//        leftlabel.add(badmintonlabel);
//        leftlabel.add(basketballlabel);
//        leftlabel.add(volleyballlabel);
//        leftlabel.add(tabletennislabel);
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
    }
}
