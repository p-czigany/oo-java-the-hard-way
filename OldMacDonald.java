class Pig {
  public void oink() {
    System.out.println("Pig says oink.");
  }
}

class Duck {
  public void quack() {
    System.out.println("Duck says quack.");
  }
}

public class OldMacDonald {
  public static void main(String[] args) {

    Duck dagobert = new Duck();
    dagobert.quack();

    Cow maudine = new Cow();
    Cow pauline = new Cow();
    maudine.moo();
    pauline.moo();

    Pig snowball = new Pig();
    snowball.oink();
    snowball.oink();

    Duck ferdinand = new Duck();
    ferdinand.quack();
  }
}

/* it doesn't matter where I put this class, referenced in the public class of the file's name */
class Cow {
  public void moo() {
    System.out.println("Cow says moo.");
  }
}

