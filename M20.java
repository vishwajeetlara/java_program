enum A
{
	CON1,CON2,CON3,
	CON4
	{
		void test()
		{
           System.out.println("from CSCB.test");//constant specfic class body 


		}
	},
    CON5,CON6;
	void test()
	{
		System.out.println("from test()");//insid Enum no Inheritance we cant use Extends and impliment not possible
	}
}
class  M20
{
	public static void main(String[] args) 
	{
		A a1=A.CON1;//a particular class  a own specfic body if you want difine a genric method you shoude go for constant specific body
		a1.test();
		A a2=A.CON2;
		a2.test();
		A a3=A.CON3;
		a3.test();
		A a4=A.CON4;
		a4.test();
		A a5=A.CON5;
		a5.test();
		A a6=A.CON6;
		a6.test();
		System.out.println("done");//Enum  are mainly from encapsuleting Enum constant
	}
}


//lot of avelebile inside Jdk
//there is one Enum
//every enum dirived from one bilid enum
//java.lang.Enum

//every Enum making a classes pridifine Enum