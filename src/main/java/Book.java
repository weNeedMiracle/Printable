public class Book implements Printable{
    String name;
    @Override
    public void print() {
        System.out.println("Напечатать книгу");
    }
    public void printBooks(Printable[] pr){
        System.out.println(name);
    }
}
