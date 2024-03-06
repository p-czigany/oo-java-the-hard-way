/* compiling this with javac compiles all its dependencies as well */
public class OldMacDriver {
  public static void main(String[] args) {
    OldMacCow maudine = new OldMacCow();
    OldMacCow pauline = new OldMacCow();
    maudine.moo();
    pauline.moo();

    OldMacDuck ferdinand = new OldMacDuck();
    ferdinand.quack();
  }
}

