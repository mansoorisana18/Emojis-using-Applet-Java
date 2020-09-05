import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Emojis.class" width=800 height=660>
</applet>
*/
public class Emojis extends Applet implements ActionListener
{	
   TextField name,logid,psswrd,ent;    //declaring variables for textfields,labels,buttons & strings
   Label wlc,n1,l1,p1,chsemj;
   Button login,go,hppy,sad,smile,wink,cry,surp,ang;
   String msg = " ", wlcmsg=" ";
   int opt=0;

   public void init()
   {
       setLayout(null);  
       wlc = new Label("Welcome to FaceEmoji   *_*",Label.CENTER); //creating label for heading wlc 
       wlc.setBounds(210,2,400,35); 
       Font a= new Font("Arial",Font.BOLD,30);
       wlc.setFont(a);
       wlc.setBackground(Color.orange);

       n1 = new Label("Enter Name:",Label.CENTER); //creating label for name
       n1.setBounds(244,62,125,30);
       Font b= new Font("Arial",Font.BOLD,20);
       n1.setFont(b);
       n1.setBackground(Color.orange);

       name = new TextField(30);        //creating textfield for entering name
       name.setBounds(375,62,170,30);
       Font v= new Font("Times New Roman",Font.PLAIN,16);
       name.setFont(v);

       l1 = new Label("Login ID:",Label.CENTER);  //creating label for login id
       l1.setBounds(80,100,120,30);
       Font c= new Font("Arial",Font.BOLD,20);
       l1.setFont(c);
       l1.setBackground(Color.orange);
       
       logid = new TextField(20);       //creating textfield for entering login id
       logid.setBounds(204,100,160,30);
       Font w= new Font("Times New Roman",Font.PLAIN,16);
       logid.setFont(w);

       p1 = new Label("Password:",Label.CENTER);  //creating label for password
       p1.setBounds(430,100,120,30);
       Font d= new Font("Arial",Font.BOLD,20);
       p1.setFont(d);
       p1.setBackground(Color.orange);
       
       psswrd = new TextField(20);      //creating textfield for password
       psswrd.setEchoChar('*');
       psswrd.setBounds(554,100,150,30);
       Font x= new Font("Times New Roman",Font.PLAIN,16);
       psswrd.setFont(x);
       
       login = new Button("Login");            //creating button login
       login.setBounds(353,140,80,40);
       Font e= new Font("Arial",Font.BOLD,20);
       login.setFont(e);       

       chsemj = new Label("Click on GO to choose your emoji ->>",Label.CENTER);  //creating label to indicate choose emoji
       chsemj.setBounds(160,280,360,30);
       Font f= new Font("Arial",Font.BOLD,20);
       chsemj.setFont(f);
       chsemj.setBackground(Color.orange);

       go = new Button("GO");       //creating go button
       go.setBounds(525,280,60,30);
       Font g= new Font("Arial",Font.BOLD,15);
       go.setFont(g);

       ent = new TextField(20);       //creating textfield for displaying you enter successfully
       ent.setBounds(328,320,170,24);
       Font y= new Font("Times New Roman",Font.PLAIN,16);
       ent.setFont(y);

       add(wlc);   //adding label welcome
       add(n1);    //adding label enter name
       add(name);  //adding textfield for name
       add(l1);    //adding label login ID
       add(logid); //adding textfield for loginid
       add(p1);    //adding label password
       add(psswrd);//adding textfield for password
       add(login); //adding button login
       
       login.setEnabled(false);      //disabling the login button
       name.addActionListener(this);
       logid.addActionListener(this);
       psswrd.addActionListener(this);
       
       add(chsemj);//adding label choose emoji
       add(go);    //adding button go
       go.setEnabled(false);   //disabling the go button
       ent.setEditable(false); //setting the textfield as uneditable
       add(ent);   //adding textfield you enter successfully

       login.addActionListener(this);    //to recieve action events from login button
       go.addActionListener(this);       //to recieve action events from go button

       hppy =new Button("Happy") ;       //creating button Happy
       hppy.setBounds(90,355,75,40);
       Font h= new Font("Arial",Font.BOLD,20);
       hppy.setFont(h);

       sad = new Button("Sad");         //creating button Sad
       sad.setBounds(175,355,75,40);
       Font i= new Font("Arial",Font.BOLD,20);
       sad.setFont(i);    

       smile = new Button("Smile");     //creating button Smile
       smile.setBounds(260,355,75,40);
       Font j= new Font("Arial",Font.BOLD,20);
       smile.setFont(j);

       wink = new Button("Wink");      //creating button Wink
       wink.setBounds(345,355,75,40);
       Font k= new Font("Arial",Font.BOLD,20);
       wink.setFont(k);

       cry = new Button("Cry");       //creating button cry
       cry.setBounds(430,355,75,40);
       Font l= new Font("Arial",Font.BOLD,20);
       cry.setFont(l); 

       surp = new Button("Surprised");  //creating button Surprised
       surp.setBounds(515,355,100,40);
       Font m= new Font("Arial",Font.BOLD,20);
       surp.setFont(m);

       ang = new Button("Angry");      //creating button Angry
       ang.setBounds(625,355,75,40);
       Font n= new Font("Arial",Font.BOLD,20);
       ang.setFont(n);    

       add(hppy); //adding buttons to choose different emojis
       add(sad);
       add(smile);
       add(wink);
       add(cry);
       add(surp);
       add(ang);
       hppy.setEnabled(false);  //disabling the buttons
       sad.setEnabled(false);
       smile.setEnabled(false);
       wink.setEnabled(false);
       cry.setEnabled(false);
       surp.setEnabled(false);
       ang.setEnabled(false);
      
       hppy.addActionListener(this);    //to receieve action events from button happy
       sad.addActionListener(this);     //to receieve action events from button sad
       smile.addActionListener(this);   //to receieve action events from button smile
       wink.addActionListener(this);    //to receieve action events from button wink
       cry.addActionListener(this);     //to receieve action events from button cry
       surp.addActionListener(this);    //to receieve action events from button surprised
       ang.addActionListener(this);     //to receieve action events from button angry
   }
   public void actionPerformed(ActionEvent ae)
   {    
       if(name.getText().length()>0 && logid.getText().length()>0 && psswrd.getText().length()>0) //if all three text fields are filled then enable the login button
         login.setEnabled(true); 
       String str = ae.getActionCommand();   //to get command name of action event 
       if(ae.getSource()==login)     
       {
          wlcmsg = "Welcome "+name.getText()+ "!";  //if login button is pressed display wlcmsg
          go.setEnabled(true);
       }
       if(ae.getSource()==go) //if the source of event is GO button then set this text in textfield ent
       {
          ent.setText("You Enter Successfully!");   
	  hppy.setEnabled(true);   //enabling emoji buttons
	  sad.setEnabled(true);
	  smile.setEnabled(true);
	  wink.setEnabled(true);
	  cry.setEnabled(true);
	  surp.setEnabled(true);
	  ang.setEnabled(true);
       }
       if(str.equals("Happy"))
       {
          opt=1;
          msg = "HAPPY...";
          setBackground(Color.pink);  //if Happy button is pressed display msg and set background pink
       }
       else if(str.equals("Sad"))
       {
          opt=2;
	  msg = "SAD...";
	  setBackground(Color.lightGray); //if Sad button is pressed display msg and set background light gray
       }
       else if(str.equals("Smile"))
       {
          opt=3;
          msg = "SMILE...";
          setBackground(Color.orange);  //if Smile button is pressed display msg and set background orange
       }
       else if(str.equals("Wink"))
       {
          opt=4;
	  msg = "WINK...";
          setBackground(Color.green); //if Wink button is pressed display msg and set background green
       }
       else if(str.equals("Cry"))
       {
          opt=5;
          msg = "CRY...";
          setBackground(Color.cyan);  //if Cry button is pressed display msg and set background cyan
       }
       else if(str.equals("Surprised"))
       {
          opt=6;
          msg = "SURPRISED...";
          setBackground(Color.magenta); //if Surprised is pressed display msg and set background magenta
       }
       else if(str.equals("Angry"))
       {
          opt=7;
          msg = "ANGRY...";
          setBackground(Color.yellow);  //if Angry is pressed display msg and set background yellow
       }
       repaint(); //to repaint the component
   }
   public void paint(Graphics g) 
   {   
          Font o= new Font("Arial",Font.ITALIC,30);
          g.setFont(o);
          g.drawString(wlcmsg,180,235);  //displaying message welcome and name
         
          switch(opt)
          {
             case 1:
		//Happy Face
                Font p= new Font("Arial",Font.BOLD,30);
                g.setFont(p);
                g.drawString(msg,340,440);  //displaying message happy

                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face
		
		g.setColor(Color.black);
		g.drawArc(344,502,45,27,0,180);     //left eye
		g.setColor(Color.black); 
		g.drawArc(418,502,45,27,0,180);   //right eye

		int ab[]={383,403,423};
		int ba[]={563,536,563};

		g.setColor(Color.red);     
		g.fillPolygon(ab,ba,3);      //nose

		g.setColor(Color.black);
		g.fillArc(360,560,90,60,0,-180); //mouth
                break;

	     case 2:
                //Sad Face
                Font q= new Font("Arial",Font.BOLD,30);
                g.setFont(q);
                g.drawString(msg,360,440);   //displaying message Sad
               
                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face

                g.setColor(Color.black);
		g.drawArc(344,502,45,27,0,-180);     //left eye
		
                g.setColor(Color.black); 
		g.drawArc(418,502,45,27,0,-180);   //right eye

                int bc[]={383,403,423};
		int cb[]={560,533,560};
                             
                g.setColor(Color.red);     
		g.fillPolygon(bc,cb,3);      //nose
                             
                g.setColor(Color.black);
		g.drawArc(353,577,98,68,0,180); //mouth
                break;

	     case 3:
		//Smile Face
                Font r= new Font("Arial",Font.BOLD,30);
                g.setFont(r);
                g.drawString(msg,340,440);   //displaying message Smile
              
                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face
		g.setColor(Color.black);
		g.fillOval(350,490,20,45);   //left eye
	
		g.setColor(Color.black);
		g.fillOval(430,490,20,45);  //right eye

		int cd[]={383,403,423};
		int dc[]={573,546,573};

		g.setColor(Color.red);     
		g.fillPolygon(cd,dc,3);      //nose

		g.setColor(Color.black);
		g.drawArc(353,555,98,68,0,-180); //mouth
                break;

             case 4:
      		//Wink Face
                Font s= new Font("Arial",Font.BOLD,30);
                g.setFont(s);
                g.drawString(msg,340,440);    //displaying message Wink

                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face

                g.setColor(Color.black);
		g.drawArc(344,508,45,27,0,180);     //left eye
		
                g.setColor(Color.white);
		g.fillOval(420,490,35,45);  //right eye

		g.setColor(Color.black); 
		g.fillOval(428,502,20,27);   //right eyeball

                int de[]={383,403,423};
		int ed[]={560,533,560};

		g.setColor(Color.red);     
		g.fillPolygon(de,ed,3);      //nose
 
                g.setColor(Color.black);
		g.drawArc(353,555,98,68,0,-180); //mouth
                break;

             case 5:
		//Cry Face
                Font t= new Font("Arial",Font.BOLD,30);
                g.setFont(t);
                g.drawString(msg,355,440);     //displaying message Cry

                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face

                g.setColor(Color.black);
		g.drawArc(340,502,45,27,0,180);     //left eye
		
                g.setColor(Color.black); 
		g.drawArc(416,502,45,27,0,180);   //right eye
                
                g.setColor(Color.blue);
                g.fillRect(355,504,15,140);       //left tears
                 
                g.setColor(Color.blue);
                g.fillRect(431,504,15,140);      //right tears
                
                int ef[]={383,403,423};
		int fe[]={560,533,560};

		g.setColor(Color.red);     
		g.fillPolygon(ef,fe,3);      //nose
 
                g.setColor(Color.black);
		g.fillArc(385,575,38,38,0,360); //mouth
                break;

	     case 6:
                //Surprised Face
                Font u= new Font("Arial",Font.BOLD,30);
                g.setFont(u);
                g.drawString(msg,310,440);    //displaying message Surprised
 
                g.setColor(Color.yellow);
		g.fillOval(300,450,200,200); //face
		g.setColor(Color.white);
		g.fillOval(350,490,35,45);   //left eye
	
		g.setColor(Color.black);
		g.fillOval(358,502,20,27);     //left eyeball

		g.setColor(Color.white);
		g.fillOval(420,490,35,45);  //right eye

		g.setColor(Color.black); 
		g.fillOval(428,502,20,27);   //right eyeball

		int fg[]={383,403,423};
		int gf[]={563,536,563};

		g.setColor(Color.red);     
		g.fillPolygon(fg,gf,3);      //nose

		g.setColor(Color.black);
		g.fillArc(380,575,48,48,0,360); //mouth
		break;

             case 7:
                //Angry Face
                Font v= new Font("Arial",Font.BOLD,30);
                g.setFont(v);
                g.drawString(msg,340,440);     //dispalying message Angry
                
                g.setColor(Color.red);
		g.fillOval(300,450,200,200); //face

                g.setColor(Color.black);
		g.fillOval(370,520,15,30);   //left eye
	
		g.setColor(Color.black);
                g.drawLine(365,500,385,515); //left eyebrow

                g.setColor(Color.black);
		g.fillOval(415,520,15,30);  //right eye

                g.setColor(Color.black);
                g.drawLine(415,515,435,500); //right eyebrow

                int gh[]={383,403,423};
		int hg[]={560,533,560};

		g.setColor(Color.red);     
		g.fillPolygon(gh,hg,3);      //nose
 
                g.setColor(Color.black);
		g.drawArc(383,577,30,25,0,170); //mouth
                break;
            }
   }
}

