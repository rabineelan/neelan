class college{
String departmentname;
int mynumber;
float time;
boolean present;
public college(String dn,int mn,float t,boolean p){
departmentname=dn;
mynumber=mn;
time=t;
present=p;
System.out.println("department name is"+departmentname+"\n"+"mynumber"+mynumber+"\n"+"time="+time+"\n"+"present");
}
public static void main(String[]args){
college r1=new college("loyola",33,10.30f,true);
}
}
