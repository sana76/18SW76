class T7{
	public static void main(String args[]){
		String s1="sana,18,Software;hina,18,Software";
		String str[]=s1.split(";");
		String str1[]=str[0].split(",");
		String str2[]=str[1].split(",");
		System.out.println("Name:"+str1[0]);
		System.out.println("Age:"+str1[1]);
		System.out.println("Department:"+str1[2]);
		System.out.println("Name:"+str2[0]);
		System.out.println("Age:"+str2[1]);
		System.out.println("Department:"+str2[2]);
		}
}