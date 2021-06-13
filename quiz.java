import java.io.*;
public class quiz
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,n,A[];
        String nm;
        int sc=0;
        System.out.println("Enter no. of players ");
        n=Integer.parseInt(in.readLine());
        A=new int[n];
        for(i=0;i<n;i++)
        {	
            System.out.println("\f");
            System.out.println(" Enter Name of Player "+(i+1));
            nm=in.readLine();
            System.out.println(" WELCOME TO THE WORLD OF QUIZ!LET US SEE HOw FAR CAN YOU GO ");
            System.out.println(" ***************************************************************************************");
            System.out.println();
            System.out.println("==========================================================================================");
            System.out.println("1.***SPORTS***");
            System.out.println("2.***FOOD AND DRINK***");
            System.out.println("3.***MIXED BAG***");
            System.out.println("4.*** MUSIC AND MOVIES***");
            System.out.println();
            System.out.println("============================================================================================");
            System.out.println("+++++ ENTER YOUR CHOICE +++++");

            String x1= in.readLine();
            int choice= Integer.parseInt(x1);
            if(choice==1)
            {

                System.out.println(" GET READY FOR THE BRAIN STROM COMING!!!");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println();
                System.out.println("*** WHICH INDIAN CRICKETER IS POPULARLY KNOWN AS JAMMY ??? ***");	
                System.out.println("### 1. SACHIN TENDULKAR ###");
                System.out.println("### 2. SAURAV GANGULY ###");
                System.out.println("### 3.YUVRAJ SINGH ###");
                System.out.println("### 4.RAHUL DRAVID ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String n2=in.readLine();
                int v=Integer.parseInt(n2);
                if(v==4)
                {
                    System.out.println(nm+"^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println(nm+" YOUR SCORE IS =" +sc);
                }
                else
                {
                    System.out.println(nm+" SORRY! BETTER LUCK NEXT TIME! CORRECT ANSWER IS = RAHUL DRAVID");
                    sc=sc-10;
                }
                System.out.println("*** WHICH IS THE ONLY CRICKETER TO SCORE A FOUR HUNDRED NOT OUT??? ***");
                System.out.println("### 1. RICKY PONTING ###");
                System.out.println("### 2. JACQUES KALLIS ###");
                System.out.println("### 3. BRIAN LARA ###");
                System.out.println("### 4. CHRIS HARRIS ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String n1=in.readLine();
                int a=Integer.parseInt(n1);
                if(a==3)
                {
                    System.out.println(nm+" YOU ARE ON THE RIGHT TRACK ");
                    sc=sc+20;
                    System.out.println(" YOUR SCORE IS ="+sc); 
                }
                else 
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= BRAIN LARA");
                    sc=sc-10;
                }
                System.out.println("*** WHAT WOULD THE LETTERS PB NEXT TO AN ATHLETE'S NAME SIGNIFY??? ***");
                System.out.println("### 1. POST BOX ###");
                System.out.println("### 2. PERSONAL BEST ###");
                System.out.println(" ### 3. PIN BALL ###");
                System.out.println("### 4. PLAY BANNED ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String m1 = in.readLine();
                int k1= Integer.parseInt(m1);
                if(k1==2)
                {
                    System.out.println(nm+" YOU ARE ON TH RIGHT TRACK!!! ");
                    sc=sc+20;
                    System.out.println("your score is= "+ sc);
                }
                else 
                {
                    System.out.println(nm+"^^^^^^^^ SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= PERSONAL BEST");
                    sc=sc-10;
                }
                System.out.println("**** WHAT IS THE SHORTEST DISTANCE IN A TRACK & FIELD EVENT WHERE THE RUNNERS ARE ALLOWED TO BREAK LANES??? ****");
                System.out.println("### 1. 200 m ###");
                System.out.println("### 2. 800 m ###");
                System.out. println("### 3. 600 m ###");
                System.out.println("### 4. 400 m ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String s1= in.readLine();
                int r= Integer.parseInt(s1);
                if(r==2)
                {
                    System.out.println(nm+" YOU ARE ON THE RIGHT TRACK!!!");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS = "+sc);
                }
                else
                {
                    System.out.println(nm+"^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= 800 m ");
                    sc=sc-10;
                }
                System.out.println("*** THE STANDARD COLOURS OF WHICH SPORTING EVENT ARE GREEN AND PURPLE??? ***");
                System.out.println("### 1. DAVIS CUP ###");
                System.out.println("### 2. ASIA CUP ###");
                System.out.println("### 3. WIMBLEDON ###");
                System.out.println("### 4. EURO CUP ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String t1= in.readLine();
                int h1= Integer.parseInt(t1);
                if(h1==3)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println(" YOUR SCORE IS = "+ sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS = WIMBLEDON ^^^^^^^^");
                    sc=sc-10;
                }
                System.out.println("*** THE OLYMPIC GOLD MEDAL CONSISTS OF 5.2% OF WHICH METAL??? ***");
                System.out.println("### 1.GOLD ###");
                System.out.println("### 2.PLATINUM ###");
                System.out.println("### 3.SILVER ###");
                System.out.println("### 4.COPPER ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String b=in.readLine();
                int z=Integer.parseInt(b);
                if(z==1)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK!!! ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCET ANSWER IS = GOLD");
                    sc=sc-10;
                }
                System.out.println("*** WHICH OF THESE GAMES IS OFFICIALLY PLAYED BY GIRLS??? ***");
                System.out.println("### 1.VOLLEY BALL ###");
                System.out.println("### 2.NET BALL ###");
                System.out.println("### 3.BASE BALL ###");
                System.out.println("### 4.LAWN TENNIS ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String o=in.readLine();
                int g5=Integer.parseInt(o);
                if(g5==2)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK!!!^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = NET BALL");
                    sc=sc-10;
                }
                System.out.println("*** WHO WAS THE FIRST CRICKETER TO SCORE 1000 TEST RUNS, PLAY 100 TEST MATCHES & TAKE 100 TEST CATCHES??? ***");
                System.out.println("### 1.GARFIELD SOBERS ###");
                System.out.println("### 2.ALLAN DONALD ###");
                System.out.println("### 3.IAN CHAPPEL ###");
                System.out.println("### 4.KAPIL DEV ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String d8=in.readLine();
                int w0=Integer.parseInt(d8);
                if(w0==1)
                {
                    System.out.println("======== YOU ARE ON THE RIGHT TRACK ========");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS = "+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= GARFIELD SOBERS ^^^^^^^^");
                    sc=sc-10;
                }
                System.out.println("*** HOW MANY PLAYERS ARE THERE IN THE GAME OF BASKETBALL??? ***");
                System.out.println("### 1.FIVE(5)###");
                System.out.println("### 2.SIX(6)###");
                System.out.println("### 3.EIGHT(8)###");
                System.out.println("### 4.ELEVEN(11)###");
                System.out.println("^^^^^^^^ ENTER YOUR CHOICE ^^^^^^^^");
                String d=in.readLine();
                int w=Integer.parseInt(d);
                if(w==2)
                {
                    System.out.println("======== YOU ARE ON THE RIGHT TRACK ========");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS= "+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = SIX (6)^^^^^^^^");
                    sc=sc-10;
                }
                System.out.println("*** AT THE END OF THIS ROUND YOU HAVE FINALLY SCORED"+sc+"POINTS ***");
                if(sc<200)
                    System.out.println("&&& I AM SORRY! NO PRIZE FOR YOU! TRY AGAIN! &&&");
                else if(sc>=200 && sc<400)
                    System.out.println("&&& YOU HAVE WON A PRIZE! CONGRATULATIONS!");
                else if(sc>400 && sc<=500)
                {
                    System.out.println("&&& YOU HAVE WON SOMETHING......");
                    System.out.println(" LETS SEE......");
                    System.out.println("CONGRATULATIONS !!!! AND TRIBULATIONS YOU HAVE WON A LIFE IN THIS QUIZ GAME!! ITS GONNA HELP YOU! LUCKY YOU! I ENVY YOU!!!");
                }
            }

            else if(choice==2)
            {
                sc=0;
                System.out.println("*** WHAT IS COMMON TO THE FOLLOWING: BANGALPALLI,SAFEDA,CHAUSA,LANGDA,MALDA??? ***");
                System.out.println("### 1.APPLE ###");
                System.out.println("### 2.MANGO ###");
                System.out.println("### 3.BANANA ###");
                System.out.println("### 4.ORANGE ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String y=in.readLine();
                int e=Integer.parseInt(y);
                if(e==2)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = MANGO");
                    sc=sc-10;
                }
                System.out.println("*** WHICH IS THE MOST WIDELY CULTIVATED FRUIT IN THE WORLD??? ***");
                System.out.println("### 1.APPLE ###");
                System.out.println("### 2.LEMON ###");
                System.out.println("### 3.BANANA ###");
                System.out.println("### 4.GRAPES ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String c=in.readLine();
                int f=Integer.parseInt(c);
                if(f==1)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS = "+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE ANSWER IS= APPLE");
                    sc=sc-10;
                }
                System.out.println("*** AMERICANS CALL THIS EDIBLE OAT MEAL.HOW DO WE REFER TO IT??? ***");
                System.out.println("### 1.SOUP ###");
                System.out.println("### 2.SPROUTS ###");
                System.out.println("### 3.SALAD ###");
                System.out.println("### 4.PORRIDGE ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String q=in.readLine();
                int l=Integer.parseInt(q);
                if(l==4)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS= "+sc);
                }
                else
                {
                    System.out.println("SORRY!BETTERLUCK NEXT NEXT!THE ANSWER IS = PORRIDGE");
                    sc=sc-10;
                }
                System.out.println("*** WHICH COUNTRY IS CONSIDERED THE BIRTHPLACE OF PIZZA??? ***");
                System.out.println("### 1.FRANCE ###");
                System.out.println("### 2.ITALY ###");
                System.out.println("### 3.GERMANY ###");
                System.out.println("### 4.GREECE ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String p=in.readLine();
                int g=Integer.parseInt(p);
                if(g==2)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= ITALY");
                    sc=sc-10;
                }
                System.out.println("*** IF BOMBAY IS KNOWN FOR ITS HALWA AND CALCUTTA FOR ITS ROSSOGOLLAS,WHAT SWEET MEAT IS DELHI FAMOUS FOR??? ***");
                System.out.println("### 1.LADDOOS ###");
                System.out.println("### 2.PEDA ###");
                System.out.println("### 3.JALEBI ###");
                System.out.println("### 4.BURFI ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String j=in.readLine();
                int x=Integer.parseInt(j);
                if(x==1)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc=sc+20;
                    System.out.println("YOU ARE ON THE RIGHT TRACK ="+sc);
                }
                else
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME!THE ANSWER IS = LADDOOS!! ");
                    sc=sc-10;
                }
                System.out.println("*** WHICH FRUIT IS NORMALLY USED TO MAKE MEAT TENDER??? ***");
                System.out.println("### 1.BANANA ###");
                System.out.println("### 2.PAPAYA ###");
                System.out.println("### 3.APPLE ###");
                System.out.println("### 4.CHERRY ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String p7=in.readLine();
                int g6=Integer.parseInt(p7);
                if(g6==2)
                {
                    System.out.println("~~~~~~~~~~ YOU ARE ON THE RIGHT TRACK !!! ~~~~~~~~~~");
                    sc=sc+20;
                    System.out.println("YOUR SCORE ="+sc);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= PAPAYA!");
                    sc=sc-10;
                }
                System.out.println("*** WHICH IS THE ONLY FAMILY OF FOOD THAT DOES NOT RIPEN AFTER PLUCKING??? ***");
                System.out.println("### 1.LITCHI ###");
                System.out.println("### 2.ORANGE ###");
                System.out.println("### 3.STRAWBERRY ###");
                System.out.println("### 4.CHERRY ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v1=in.readLine();
                int ch=Integer.parseInt(v1);
                if(ch==2)
                {
                    System.out.println("~~~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~~~");
                    sc=sc+sc;
                    System.out.println("YOUR SCORE IS= "+sc);
                }
                else
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= ORANGE");
                    sc=sc-10;
                }
                System.out.println("*** THEY ARE CALLED GOLGUPPAS IN DELHI, PUCHKAS IN CLCUTTA.WHAT ARE THEY REFFERED TO AS IN MUMBAI??? ***");
                System.out.println("### 1.BHELPURI ###");
                System.out.println("### 2.ALOO CHAT ###");
                System.out.println("### 3.PANIPURI ###");
                System.out.println("### 4.CHANA BATURA ###");
                System.out.println("========== ENTER YOUR CHOICE ==========");
                String v2=in.readLine();
                int re=Integer.parseInt(v2);
                if(re==3)
                {
                    System.out.println("~~~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~~~");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS= "+sc);
                }
                else
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= PANIPURI");
                    sc=sc-10;
                }
                System.out.println("%%%%%%%% FINALLY AT THE END OF THIS ROUND="+sc+"POINTS%%%%%%%%");
                if(sc<200)
                    System.out.println("SORRY!I GOT NO PRIZE NO PRIZE FOR YOU!TRY AGAIN");
                else if(sc>=200 && sc<=400)
                    System.out.println("### YOU HAVE WON A PRIZE CONGRATULATIONS!!!###");
                else if(sc>400 && sc<=500)
                    System.out.println("### CONGRATULATIONS AND TRIBULATIONS !!! YOU WON A PRIZE!!!YOU GOT A LIFE IN THIS GAME!!!");
            }
            else if(choice==3)
            {
                sc=0;
                System.out.println("***'SOMETHING BEAUTIFUL FOR GOD' IS A BOOK BY MALCOLM MUGGERIDGE.WHO IS THE SUBJECT OF THE BOOK??? ***");
                System.out.println("### 1.MOTHER TERESA ###");
                System.out.println("### 2.ARUNDHATI ROY ###");
                System.out.println("### 3.AMELIYA ARHART ###");
                System.out.println("### 4.RABINDRANATH TAGORE ###");
                System.out.println("========== ENTER YOUR CHOICE ==========");
                String t1=in.readLine();
                int h1=Integer.parseInt(t1);
                if(h1==1)
                {
                    System.out.println("~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS="+sc);
                }
                else
                {
                    System.out.println(nm+"SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = MOTHER TERESA!");
                    sc=sc-10;
                }
                System.out.println("*** WHICH INDIAN HAS THE MOST NUMBER OF ROADS NAMED AFTER HIM??? ***");
                System.out.println("### 1.MAHATMA GANDHI ###");
                System.out.println("### 2.B.R.AMBEDKAR ###");
                System.out.println("### 3.SUBHAS CHANDRA BOSE ###");
                System.out.println("### 4.JAWAHARLAL NEHRU ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v2=in.readLine();
                int opt=Integer.parseInt(v2);
                if(opt==1)
                {
                    System.out.println("YOU ARE ON THE RIGHT TRACK!!! ");
                    sc=sc+20;
                    System.out.println("YOUR SCORE IS="+sc);
                }
                else
                {
                    System.out.println(nm+"SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS MAHATMA GANDHI!!!");
                    sc=sc-10;
                }
                System.out.println("*** IF AN ARMY OFFICER HAS THREE STARS ON HIS CAR PLATE, WHAT IS HIS RANK??? ***");
                System.out.println("### 1.CAPTAIN ###");
                System.out.println("### 2.BRIGADIER ###");
                System.out.println("### 3.LIEUTANT GENERAL ###");
                System.out.println("### 4.MAJOR ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String vv=in.readLine();
                int flag=Integer.parseInt(vv);
                if(flag==3)
                {
                    System.out.println(nm+"~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~");
                    sc=sc+50;
                    System.out.println("^^^^^^^^ YOUR SCORE ="+sc);
                }
                else
                {
                    System.out.println(nm+"^^^^^^ SORRY BETTER LUCK NEXT TIME!!! ^^^^^^ AND THE CORRECT ANSWER IS - LIEUTENANT GENERAL");
                    sc=sc-10;
                }
                System.out.println("****** WHO MADE THE DEBUT in ' SAAT HINDUSTANI ' ??? ******");
                System.out.println("#### 1.DHARMENDRA ####");
                System.out.println("#### 2.AMITABH BACHCHAN ####");
                System.out.println("#### 3.RAJESH KHANNA ####");
                System.out.println("#### 4.JITENDRA ####");
                System.out.println("========== ENTER YOUR CHOICE ========");
                String v4=in.readLine();
                int option= Integer.parseInt(v4);
                if (option==2)
                {
                    System.out.println(nm+"~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~");
                    sc=sc+20;
                    System.out.println(" YOUR SCORE="+sc);
                }
                else
                {
                    System.out.println(nm+"~~~~~~~~ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS AMITABH BACHCHAN! ~~~~~~~~");
                    sc=sc-10;
                }
                System.out.println("****** WHAT DID CHARLIE CHAPLIN ALWAYS CARRY IN HIS HAND ??? ******");
                System.out.println("#### 1.STICK ####");
                System.out.println("#### 2.BAG ####");
                System.out.println("#### 3.HAT ####");
                System.out.println("#### 4.CARTOON MASK ####");
                System.out.println("========= ENTER YOUR CHOICE ========");
                String v5=in.readLine();
                int max= Integer.parseInt(v5);
                if(max==1)
                {
                    System.out.println(nm+"~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~");
                    sc=sc+50;
                    System.out.println("YOUR SCORE IS="+sc);
                }
                else
                {
                    System.out.println("^^^^^ SORRY BETTER LUCK NEXT TIME CORRECT ANSWER IS STICK ^^^^^");    
                    sc=sc-10;
                }
                System.out.println("**** WHAT EVERYDAY KITCHEN ITEM CAN BE USED TO REMOVE BALL POINT STAINS???****");
                System.out.println("#### 1.WATER ####");
                System.out.println("#### 2.SALT ####");
                System.out.println("#### 3.SUGAR ####");
                System.out.println("#### 4.MILK ####");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v6=in.readLine();
                int min=Integer.parseInt(v6);
                if(min==4)
                {
                    System.out.println(nm+"~~~~ YOU ARE ON THE RIGHT TRACK!~~~~");
                    sc=sc+50;
                    System.out.println("~~~~ YPUR SCORE IS="+sc);
                }
                else
                {
                    System.out.println("^^^^^ SORRY BETTER LUCK NEXT TIME CORRECT ANSWER IS MILK ^^^^^");    
                    sc=sc-10;
                }
                System.out.println("**** THE COLOUR OF THE HIGHEST BELT IN KARATE IS BLACK. WHAT IS THE COLOUR OF THE SECOND HIGHEST BELT??? ****");
                System.out.println("#### 1.RED ####");
                System.out.println("#### 2.BLUE ####");
                System.out.println("#### 3.WHITE ####");
                System.out.println("#### 4.YELLOW ####");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v7=in.readLine();
                int abs=Integer.parseInt(v7);
                if(abs==4)
                {
                    Integer.parseInt("~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~");
                    sc=sc+50;
                    System.out.println("YOUR SCORE IS "+sc);
                }
                else
                {
                    System.out.println("^^^^^ SORRY BETTER LUCK NEXT TIME CORRECT ANSWER IS YELLOW ^^^^^");    
                    sc=sc-10;
                }
                System.out.println("**** WHICH RIVER IN EUROPE IS REFERRED TO AS 'W' ??? ****");
                System.out.println("#### 1.VOLGA ####");
                System.out.println("#### 2.RHINE ####");
                System.out.println("#### 3.SIENE ####");
                System.out.println("#### 4.DANUBE ####");
                System.out.println("======== ENTER YOUR CHOICE =========");
                String v9=in.readLine();
                int sm=Integer.parseInt(v9);
                if (sm==4)
                {
                    System.out.println(nm+"~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~");
                    sc=sc+50;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println(nm+"SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS DANUBE!!!");
                    sc=sc-10;
                }
                System.out.println("****** IF YOUR MOTHER WAS A HORTICULTURIST ,WHAT WOULD SHE BE INTERESTED IN??? *****");
                System.out.println("#### 1.FLOWERS AND GARDENING ####");
                System.out.println("#### 2.COSMETICS ####");
                System.out.println("#### 3.SPACE ####");
                System.out.println("#### 4.MEDICINE ####");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v11=in.readLine();
                int sg=Integer.parseInt(v11);
                if(sg==1)
                {
                    System.out.println("YOU ARE ON THE RIGHT TRACK!!!");
                    sc=sc+50;
                    System.out.println("YOUR SCORE = "+sc);
                }
                else
                {
                    System.out.println("^^^^^ SORRY BETTER LUCK NEXT TIME CORRECT ANSWER IS FLOWER AND GARDENING ^^^^^");    
                    sc=sc-10;
                }
                System.out.println("**** WHICH MEMBER OF THE CATS'S FAMILY IS THE GREATEST ENEMY OF THE SNAKE??? ####");
                System.out.println("#### 1.CAT ####");
                System.out.println("#### 2.LION ####");
                System.out.println("#### 3.LEOPARD ####");
                System.out.println("#### 4.MONGOOSE ####");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String v12=in.readLine();
                int sl=Integer.parseInt(v12);
                if(sl==4)
                {
                    System.out.println("~~~~~~~~ YOU ARE ON THE RIGHT TRACK ~~~~~~~~");
                    sc=sc+50;
                    System.out.println("YOUR SCORE IS ="+sc);
                }
                else
                {
                    System.out.println("^^^^^ SORRY BETTER LUCK NEXT TIME CORRECT ANSWER IS MONGOOSE ^^^^^");    
                    sc=sc-10;
                }
                System.out.println("###### FINALLY YOU HAVE SCORED ="+sc+"POINTS ######");
                if(sc<200)
                    System.out.println("### SORRY WE DONT HAVE PRIZE FOR YOU ###");
                else if(sc>=200 && sc<=400)
                    System.out.println("### CONGRATULATIONS! YOU HAVE WON A PRIZE! ###");
                else if(sc>400 && sc<=500)
                    System.out.println("### CONGRATULATIONS! YEAH!! YOU HAVE WON A PRIZE !!! ###");
            }

            else if(choice==4)
            {
                int sc1=0;
                System.out.println(" GET READY FOR THE CHALLENGE ITS COMING!!!");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println();
                System.out.println("*** WHICH ACTOR WON THE ACADEMY AWARD FOR BEST SUPPORTING ACTOR- 2008 ??? ***");
                System.out.println("### 1. HEATH LEDGER(THE DARK KNIGHT) ###");
                System.out.println("### 2. JOSH BROLINE(MILK) ###");
                System.out.println("### 3. ROBERT DOWNEY JR.(TOPIC THUNDER) ###");
                System.out.println("### 4. PHILLIP SEYMOUR HOFFMAN(DOUBT) ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String n22=in.readLine();
                int vIT=Integer.parseInt(n22);
                if(vIT==1)
                {
                    System.out.println(nm+"^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc1=sc1+20;
                    System.out.println(nm+" YOUR SCORE IS =" +sc1);
                }
                else
                {
                    System.out.println(nm+" SORRY! BETTER LUCK NEXT TIME! CORRECT ANSWER IS = HEATH LEDGER");
                    sc1=sc1-10;
                }
                System.out.println("*** WHICH ACTRESS WON THE ACADEMY AWARD FOR THE BEST ACTRESS FOR - 1998??? ***");
                System.out.println("### 1. KATE BLANCHET(ELIZABETH) ###");
                System.out.println("### 2. MERYL STREEP(ONE TRUE THING) ###");
                System.out.println("### 3. EMILY WATTSON(HILARY & JACKIE) ###");
                System.out.println("### 4. GOYNETH PALTROW( SHAKESPEARE IN LOVE) ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String n13=in.readLine();
                int aLT=Integer.parseInt(n13);
                if(aLT==4)
                {
                    System.out.println(nm+" YOU ARE ON THE RIGHT TRACK ");
                    sc1=sc1+20;
                    System.out.println(" YOUR SCORE IS ="+sc1); 
                }
                else
                {
                    System.out.println("SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= GOYNETH PALTROW");
                    sc1=sc1-10;
                }
                System.out.println("*** WHICH IS THE FIRST INDIAN MOVIE SUBMITTED FOR OSCAR??? ***");
                System.out.println("### 1. THE GUIDE ###");
                System.out.println("### 2. MOTHER INDIA ###");
                System.out.println("### 3. MADHUMATI ###");
                System.out.println("### 4. AAMRAPALI ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String mM1 = in.readLine();
                int kK1= Integer.parseInt(mM1);
                if(kK1==2)
                {
                    System.out.println(nm+" YOU ARE ON TH RIGHT TRACK!!! ");
                    sc1=sc1+20;
                    System.out.println("your score is= "+ sc1);
                }
                else 
                {
                    System.out.println(nm+"^^^^^^^^ SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= MOTHER INDIA");
                    sc1=sc1-10;
                }
                System.out.println("**** SATYAJIT RAY WON OSCAR IN THE YEAR _______??? ****");
                System.out.println("### 1. 1992 ###");
                System.out.println("### 2. 1994 ###");
                System.out. println("### 3. 1986 ###");
                System.out.println("### 4. 1990 ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String s167= in.readLine();
                int rR= Integer.parseInt(s167);
                if(rR==1)
                {
                    System.out.println(nm+" YOU ARE ON THE RIGHT TRACK!!!");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS = "+sc1);
                }
                else
                {
                    System.out.println(nm+"^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= 1992 ");
                    sc1=sc1-10;
                }
                System.out.println("*** FIRST INDIAN SOUND FILM WAS - _______??? ***");
                System.out.println("### 1. ALAM ARA ###");
                System.out.println("### 2. RAJA HARISHCHANDRA ###");
                System.out.println("### 3. KISHAN KAUHIYA ###");
                System.out.println("### 4. NONE OF THESE ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String t17= in.readLine();
                int h17= Integer.parseInt(t17);
                if(h17==1)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc1=sc1+20;
                    System.out.println(" YOUR SCORE IS = "+ sc1);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS = ALAM ARA ^^^^^^^^");
                    sc1=sc1-10;
                }
                System.out.println("*** FROM WHICH DID THE INDIAN GOVERNMENT SPONSER - THE NATIONAL FILM FESTIVAL??? ***");
                System.out.println("### 1. 1972 ###");
                System.out.println("### 2. 1973 ###");
                System.out.println("### 3. 1984 ###");
                System.out.println("### 4. 1980 ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String bET=in.readLine();
                int zIP=Integer.parseInt(bET);
                if(zIP==2)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK!!! ^^^^^^^^");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS ="+sc1);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCET ANSWER IS = 1973");
                    sc1=sc1-10;
                }
                System.out.println("*** WHAT IS THE INDIAN FILM INDUSTRY CALLED??? ***");
                System.out.println("### 1.BOLLYWOOD ###");
                System.out.println("### 2.TOLLYWOOD ###");
                System.out.println("### 3.HOLLYWOOD ###");
                System.out.println("### 4.INDIAWOOD ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String LLo=in.readLine();
                int g51=Integer.parseInt(LLo);
                if(g51==2)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK!!!^^^^^^^^");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS ="+sc1);
                }
                else
                {
                    System.out.println("^^^^^^^^SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = BOLLYWOOD");
                    sc1=sc1-10;
                }
                System.out.println("*** WHICH AMONG ALL THE OPTIONS IS AN INDIAN STRINGED INTRUMENT??? ***");
                System.out.println("### 1.SITAR ###");
                System.out.println("### 2.GUITAR ###");
                System.out.println("### 3.PIANO ###");
                System.out.println("### 4.VIOLIN ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String d80=in.readLine();
                int w0O=Integer.parseInt(d80);
                if(w0O==1)
                {
                    System.out.println("======== YOU ARE ON THE RIGHT TRACK ========");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS = "+sc1);
                }
                else
                {                                                                                                                                       		                        
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS= SITAR ^^^^^^^^");
                    sc1=sc1-10;
                }
                System.out.println("*** WHAT MATERIAL IS THE INDIAN FLUTE MADE OF ??? ***");
                System.out.println("### 1.PLASTIC ###");
                System.out.println("### 2.WOOD ###");
                System.out.println("### 3.STRING ###");
                System.out.println("### 4.METAL ###");
                System.out.println("^^^^^^^^ ENTER YOUR CHOICE ^^^^^^^^");
                String dID=in.readLine();
                int wAKE=Integer.parseInt(dID);
                if(wAKE==2)
                {
                    System.out.println("======== YOU ARE ON THE RIGHT TRACK ========");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS= "+sc1);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS = WOOD^^^^^^^^");
                    sc1=sc1-10;
                }
                System.out.println("*** RASHID KHAN IS A FAMOUS INDIAN CLASSICAL MUSICIAN! WHAT KIND OF A MUSICIAN IS HE??? ***");
                System.out.println("### 1.VIOLINIST ###");
                System.out.println("### 2.SINGER ###");
                System.out.println("### 3.GUITARIST ###");
                System.out.println("### 4.DANCER ###");
                System.out.println("========== ENTER YOUR CHOICE ==============");
                String katrina=in.readLine();
                int venom=Integer.parseInt(katrina);
                if(venom==2)
                {
                    System.out.println("=== YOU ARE ON THE RIGHT TRACK ===");
                    sc1=sc1+20;
                    System.out.println("=== YOUR SCORE IS="+sc1);
                }
                else
                {
                    System.out.println("^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS- SINGER ^^^");
                    sc1=sc1-10;
                }
                System.out.println("**** LAST FILM DIRECTED BY SATYAJIT RAY WAS - ________??? ****");
                System.out.println("### 1. AAGANTUK ###");
                System.out.println("### 2. BALA ###");
                System.out. println("### 3. PIKU ###");
                System.out.println("### 4. JANA ARANYA ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String sETFREE= in.readLine();
                int rANU= Integer.parseInt(sETFREE);
                if(rANU==1)
                {
                    System.out.println(nm+" YOU ARE ON THE RIGHT TRACK!!!");
                    sc1=sc1+20;
                    System.out.println("YOUR SCORE IS = "+sc1);
                }
                else
                {
                    System.out.println(nm+"^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS= AAGANTUK ");
                    sc1=sc1-10;
                }
                System.out.println("*** FIRST 3D FILM FROM INDIA WAS - _________??? ***");
                System.out.println("### 1. ROADSIDE ROMEO ###");
                System.out.println("### 2. GHAYAB AAYA  ###");
                System.out.println("### 3. HANUMAN ###");
                System.out.println("### 4. BAL GANESHA ###");
                System.out.println("======== ENTER YOUR CHOICE ========");
                String t1T= in.readLine();
                int h1EYA= Integer.parseInt(t1T);
                if(h1EYA==1)
                {
                    System.out.println("^^^^^^^^ YOU ARE ON THE RIGHT TRACK ^^^^^^^^");
                    sc1=sc1+20;
                    System.out.println(" YOUR SCORE IS = "+ sc1);
                }
                else
                {
                    System.out.println("^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS = ROADSIDE ROMEO ^^^^^^^^");
                    sc1=sc1-10;
                }
                System.out.println("*** AT THE END OF THIS ROUND YOU HAVE FINALLY SCORED"+sc1+"POINTS ***");
                if(sc1<200)
                    System.out.println("&&& I AM SORRY! NO PRIZE FOR YOU! TRY AGAIN! &&&");
                if(sc1>=200 && sc1<400)
                    System.out.println("&&& YOU HAVE WON A PRIZE! CONGRATULATIONS!");
                if(sc1>400 && sc1<=500)
                {
                    System.out.println("&&& YOU HAVE WON SOMETHING......");
                    System.out.println(" LETS SEE......");
                    System.out.println("CONGRATULATIONS !!!! AND TRIBULATIONS YOU HAVE WON A LIFE IN THIS QUIZ GAME!! ITS GONNA HELP YOU! LUCKY YOU! I ENVY YOU!!!");
                }
            }        
            else
                System.out.println("@@@@@ SORRY!WRONG CHOICE!!!!! @@@@@");
            A[i]=sc;
        }
        int max=A[0];
        for(i=0;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
                break;
            }
        }
        System.out.println("CONGRATULATIONS !!!! PLAYER "+(i+1)+" HAVE SCORED HIGHEST POINT"+max);
    }
}
/* 
VARIABLE                      DATA TYPE                      DESCRIPTION
 */