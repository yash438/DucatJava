class ArrayList
{ 
  public static void main(String...s)
  {
    ArrayList d=new ArrayList();
    d.add(1);
    d.add(2);
    System.out.println(d.size());
    ArrayList name=new ArrayList();
    name.add("Yash");
    name.add("Ram");
    d.addAll(name);
    System.out.println(d);
    System.out.println(d.size());
  }
}