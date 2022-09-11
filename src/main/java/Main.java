public class Main {
    public static void main(String[] args) {
    Book b1 = new Book();
    b1.name = "1922";
    Magazine m1 = new Magazine();
    m1.name = "Мурзилка";
    Printable[] pm = {b1, m1};

    for(int i = 0; i<pm.length; i++){
    pm[i].print();
        if(pm[i] instanceof Book){
        ((Book) pm[i]).printBooks(pm);
        }
        if(pm[i] instanceof Magazine){
        ((Magazine) pm[i]).printMagazines(pm);
        }
    }
    }
}
