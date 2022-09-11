public class Magazine implements Printable{
    String name;
    @Override
    public void print() {
        System.out.println("Напечать газету");
    }
    public void printMagazines(Printable[] pr){
        System.out.println(name);
    }
}
