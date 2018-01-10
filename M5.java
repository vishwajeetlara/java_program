public class M6
{
   public static void main(String[] args)
   {
	 String s1="abc hello radha radha rama rama abc dca dca";
	 String words[]=s1.split(" ");
	 for(int i=0;i<words.length;i++)
	 {
		 if(words[i]!=null)
		 {
			 for(int j=i+1;j<words.length;j++)
			 {
				 if(words[i].equals(words[j]))
				 {
					 words[j]=null;
				 }
			 }
		 }
	 }
	 for(int i=0;i<words.length;i++)
	 {
		 if(words[i]!=null)
		 {
			 System.out.println(words[i]);
		 }
	 }
   }
}
