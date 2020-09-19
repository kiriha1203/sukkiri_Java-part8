package Practice;

public class Cleric {
  String name;
  final int MAX_HP = 50;
  int hp;
  final int MAX_MP = 10;
  int mp;

  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った");
    int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this,MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;


  }
}