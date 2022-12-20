package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Author alex = new Author("Александр", "Пушкин");
        Book dubrovski = new Book("Дубровский", 1841, alex);
        System.out.println("Название книги " + dubrovski.getNameBook());
        System.out.println("Год публикации " + dubrovski.getYearPublication());
        System.out.println("Автор " + alex.getName() + " " + alex.getSurName());
        Author nikolai = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мёртвые души", 1842, nikolai);
        System.out.println("Название книги " + deadSouls.getNameBook());
        System.out.println("Год публикации " + deadSouls.getYearPublication());
        System.out.println("Автор " + nikolai.getName() + " " + nikolai.getSurName());
        deadSouls.setYearPublication(1843);
        System.out.println("Год публикации " + deadSouls.getYearPublication());
    }
}