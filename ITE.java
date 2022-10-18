public class ITE{
String name;
int empid;
ITE(String n,int id){
name=n;
empid=id;
}
ITE(String n,int id,int no){
name=name;
empid=id;
}
public static void main(String[]args)
{
ITE emo1=new ITE("ram",48);
ITE emp2=new ITE("raj",42,10);
System.out.println(emp2.name);
}
}
