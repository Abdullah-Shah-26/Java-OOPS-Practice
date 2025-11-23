{
  msg m;
  String name;
  OurThread(msg m, String name)
  {
    this.m = m;
    this.name = name;
  }
  public void run()
  {
    m.show(name);
  }
}
