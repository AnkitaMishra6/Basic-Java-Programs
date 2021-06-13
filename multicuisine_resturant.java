import java.util.*;
class multicuisine_resturant
{
    public static void main(String args[])
    {
        Scanner e=new Scanner (System.in);
        char ch,ni;
        int c1,it,m=0,np;
        double gst=0,bill=0,sbill=0;
        System.out.println("Welcome!");
        System.out.println("Please select an Option");
        System.out.println( "a.Starter ");
        System.out.println( "b.Main course ");
        System.out.println( "c.Dessert ");
        ch=e.next().charAt(0);
        switch (ch)
        {
            case 'a':
            System.out.println( "1.Veg ");
            System.out.println( "2.Non-veg ");
            c1=e.nextInt();
            if(c1==1)
            {
                System.out.println( "1.Gol gappa Rs.20 ");
                System.out.println( "2.Baby corn Rs.40 ");
                System.out.println( "3.panner pakoda Rs.30 ");
                System.out.println( "4.pyaaz pakoda Rs.10 ");
                System.out.println( "5.baegan pakoda RS.15 ");
                System.out.println( "6.ltti Rs.10 ");
                System.out.println( "7.Chowmin Rs.30 ");
                System.out.println( "8.Soup Rs.40 ");
                System.out.println( "9.Salad RS.15 ");
                System.out.println( "10.jal jeera Rs.10 ");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                   
                    if(it==1)
                    {
                        sbill=sbill+np*20;
                        System.out.println( "you ordered gol gappa "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered baby corn "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered paneer pakoda "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*10;
                        System.out.println( "you ordered pyaaz pakoda "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*15;
                        System.out.println( "you ordered baegan pakoda "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*10;
                        System.out.println( "you ordered litti "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered chowmin "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered Soup "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*15;
                        System.out.println( "you ordered salad "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*10;
                        System.out.println( "you ordered jal jeera "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }
            }
            else if(c1==2)
            {
                System.out.println( "1.hot dog Rs.20 ");
                System.out.println( "2.chicken 65 Rs.40 ");
                System.out.println( "3.chicken 95 Rs.30 ");
                System.out.println( "4.crispy chicken Rs.30 ");
                System.out.println( "5.chicken lollypop RS.40 ");
                System.out.println( "6.chicken tikka Rs.30 ");
                System.out.println( "7.fish buttter fry Rs.30 ");
                System.out.println( "8.chicken soup Rs.40 ");
                System.out.println( "9.fish finger RS.40 ");
                System.out.println( "10.chicken sukha Rs.30 ");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                   
                    if(it==1)
                    {
                        sbill=sbill+np*20;
                        System.out.println( "you ordered hot dog "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered chicken 65 "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered chicken 95 "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered crispy chicken "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered chicken lollypop "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered chicken tikka "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered fish buttter fry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered chicken soup "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered fish finger "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered chicken sukha "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }
            }
            break;
            case 'b':
            System.out.println( "1.Veg ");
            System.out.println( "2.Non-veg ");
            c1=e.nextInt();
            if(c1==1)
            {
                System.out.println( "1.rice Rs.20 ");
                System.out.println( "2.Rumali roti Rs.30 ");
                System.out.println( "3.Dal Rs.30 ");
                System.out.println( "4.paneer curry Rs.30 ");
                System.out.println( "5.cauliflower curry RS.30 ");
                System.out.println( "6.eggplant curry Rs.30 ");
                System.out.println( "7.mix curry Rs.30 ");
                System.out.println( "8.dosa Rs.30 ");
                System.out.println( "9.chola bhatura RS.50 ");
                System.out.println( "10. mashroom masala Rs.40");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                    
                    if(it==1)
                    {
                        sbill=sbill+np*20;
                        System.out.println( "you ordered rice "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Rumali roti "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Dal "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered paneer curry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered cauliflower curry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered eggplant curry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered mix curry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered dosa "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*50;
                        System.out.println( "you ordered chola bhatura "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);                        
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered mashroom masala "+np+ " plates ");
                        System.out.println("Current bill(excl.tax)= "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }                
            }
            else if(c1==2)
            {
                System.out.println( "1.rice Rs.20 ");
                System.out.println( "2.Rumali roti Rs.45 ");
                System.out.println( "3.Egg masala Rs.45 ");
                System.out.println( "4.chicken curry Rs.45 ");
                System.out.println( "5.chicken do pyaza RS.45 ");
                System.out.println( "6.chicken rezala Rs.45 ");
                System.out.println( "7.chicken dahiwala Rs.45 ");
                System.out.println( "8.chicken kadai Rs.45 ");
                System.out.println( "9.chicken makhanwala RS.50 ");
                System.out.println( "10. chicken handi Rs.40");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                    
                    if(it==1)
                    {
                        sbill=sbill+np*20;
                        System.out.println( "you ordered rice "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered Rumali roti "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered Egg masala "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered chicken curry "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered chicken do pyaza "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered chicken rezala "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered chicken dahiwala "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*45;
                        System.out.println( "you ordered chicken kadai "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*50;
                        System.out.println( "you ordered chicken makhanwala "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);                        
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered chicken handi "+np+ " plates ");
                        System.out.println("Current bill(excl.tax)= "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }                
            }          
            break;
            case 'c':
            System.out.println( "1.Veg ");
            System.out.println( "2.Non-veg ");
            c1=e.nextInt();
            if(c1==1)
            {
                System.out.println( "1.Snickerdoodles Rs.30 ");
                System.out.println( "2.Banana Pudding Rs.40 ");
                System.out.println( "3.Cashew Cheesecake Rs.30 ");
                System.out.println( "4.Oat Flour Chocolate-Chip Cookies Rs.35 ");
                System.out.println( "5.Cookies Tofu RS.15 ");
                System.out.println( "6.Glazed Chocolate-Avocado Cupcakes Rs.35 ");
                System.out.println( "7.Gluten-Free Blueberry Muffins Rs.30 ");
                System.out.println( "8.Chocolate-Crusted Pumpkin Pie Rs.40 ");
                System.out.println( "9.Blueberry Yogurt Cake with Lemon Glaze RS.15 ");
                System.out.println( "10.Blackberry Crumb Bars Rs.35 ");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                   
                    if(it==1)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Snickerdoodles "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered Banana Pudding "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Cashew Cheesecake "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*35;
                        System.out.println( "you ordered Oat Flour Chocolate-Chip Cookies "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*15;
                        System.out.println( "you ordered Cookies Tofu "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*35;
                        System.out.println( "you ordered Glazed Chocolate-Avocado Cupcakes "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Gluten-Free Blueberry Muffins "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered Chocolate-Crusted Pumpkin Pie "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*15;
                        System.out.println( "you ordered Blueberry Yogurt Cake with Lemon Glaze "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*35;
                        System.out.println( "you ordered Blackberry Crumb Bars "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }
            }
            else if(c1==2)
            {
                System.out.println( "1.Pepper egg roast Rs.20 ");
                System.out.println( "2.Bread omelette Rs.30 ");
                System.out.println( "3.Malabar thenga choru Rs.30 ");
                System.out.println( "4.chakka ularthiyath Rs.30 ");
                System.out.println( "5.sweet mattayapam RS.30 ");
                System.out.println( "6.Naadan mathi vattichathu Rs.30 ");
                System.out.println( "7.crispy bow cookies Rs.30 ");
                System.out.println( "8.date milk cake Rs.30 ");
                System.out.println( "9.muttayapam RS.50 ");
                System.out.println( "10. Banana milk cake Rs.40");
                while(m==0)
                {
                    System.out.println( "Enter your choice and number of  plates ");
                    it=e.nextInt();
                    np=e.nextInt();                    
                    if(it==1)
                    {
                        sbill=sbill+np*20;
                        System.out.println( "you ordered Pepper egg roast "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==2)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Bread omelette "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==3)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Malabar thenga choru "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==4)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered chakka ularthiyath "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==5)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered sweet matayapam "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==6)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered Naadan mathi vattichathu "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==7)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered crispy bow cookies "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==8)
                    {
                        sbill=sbill+np*30;
                        System.out.println( "you ordered date milk cake "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);
                    }
                    else if(it==9)
                    {
                        sbill=sbill+np*50;
                        System.out.println( "you ordered muttayapam "+np+ " plates ");
                        System.out.println( "Current bill(excl.tax)=  "+sbill);                        
                    }
                    else if(it==10)
                    {
                        sbill=sbill+np*40;
                        System.out.println( "you ordered banana milk cake "+np+ " plates ");
                        System.out.println("Current bill(excl.tax)= "+sbill);
                    }
                    System.out.println( "Do you want more items (press y for yes n for no) ");
                    ni=e.next().charAt(0);
                    if(ni=='y')
                    {
                        m=0;
                    }
                    else
                    {
                        m=1;
                    }
                }                
            }          
            break; 
            default:System.out.println("Invalid input");
            System.exit(0);
        }
        gst=18*sbill/100;
        bill=sbill+gst;      
        System.out.println("Your Bill is Rs "+bill+" incl.tax");
        System.out.println("Thank you! Please visit again");
    }
}
