class SportSystem{

  public static void main(String args[])
  {
      System.out.println("Players System");

      Player p1 = new Player(); // this is an object

      p1.name="Cristiano Ronaldo";
      p1.age=33;
      p1.nationality="Portugal";
      p1.position="CF";
      p1.salary=5678923.87;
      p1.team="Real Madrid";

      System.out.println("Player 1: " + p1.name + "," + p1.team);

      Player p2=new Player();

      p2.name="Lionel Messi";
      p2.age=31;
      p2.nationality="Argentina";
      p2.position="MF";
      p2.salary=7778888.99;
      p2.team="Barcelona";

      System.out.println("Player 2: " + p2.name + "," + p2.team);
  }

}