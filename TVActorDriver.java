public class TVActorDriver {
  public static void main(String[] args) {
    TVActor a = new TVActor();
    a.name = "Thomas Middleditch";
    a.role = "Richard Hendricks";
    a.salary = 1000000000000000d;

    TVActor b = new TVActor();
    b.name = "Martin Starr";
    b.role = "Bertram Gilfoyle";
    b.salary = 2000000000000d;

    TVActor c = new TVActor();
    c.name = "Kumail Nanjiani";
    c.role = "Dinesh Chugtai";
    c.salary = 30000000000d;

    System.out.println(a.name + " played " + a.role + " and earned $" + a.salary);
    System.out.println(b.name + " played " + b.role + " and earned $" + b.salary);
    System.out.println(c.name + " played " + c.role + " and earned $" + c.salary);
  }
}

