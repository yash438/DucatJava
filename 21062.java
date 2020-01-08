class test
{
int x=10;

{
System.out.println("init block"+x);
}
test()
{
System.out.println("def const");
}
public static void main(String...s)
{ 
new test();
new test();
}
}