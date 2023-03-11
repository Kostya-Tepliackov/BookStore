package Models;

import java.util.ArrayList;
import java.util.List;

public class main {
  static List<Book>books = new ArrayList<>();
  static List<Customer>customers = new ArrayList<>();
  static List<Employee>employees = new ArrayList<>();
  static List<Order>orders = new ArrayList<>();

  public static void main(String[] args){
  initDate();
  int a = getCountOfSoldBooks();
  System.out.println("Кількість проданих книжок " + a);
  double b = getPriceOfAllOrders();
  System.out.println("Сумма з усіх проданих книжок " + b);

  }

    public static Book getBookById(long id){ //метод, що повертає книгу по її айді
        Book book = null;
        for(Book beBook : books){
            if (beBook.getId()==id){
                book = beBook;
                break;
            }
        }
        return book;
    }
    public static int getCountOfSoldBooks(){
        int count = 0;
        for (Order order : orders){
            count += order.getBookSellList().length;
        }
        return count;
    }
    public static double getPriceOfSoldBooksInOrder(Order order){
        double price = 0;
        for (long bookId : order.getBookSellList()){
            Book book = getBookById(bookId);
            if (book!=null){
                price=book.getPrice();
            }
        }
        return price;
    }
    public static double getPriceOfAllOrders(){
        double price = 0;
        for (Order orders : orders){
            if (orders!=null){
                price += getPriceOfSoldBooksInOrder(orders);
            }
        }
        return price;
    }



    public static void initDate(){
    employees.add(new Employee(1, "Vadym", 22));
    employees.add(new Employee(2, "Nikita", 34));
    employees.add(new Employee(3, "Olga", 18));

    customers.add(new Customer(1,"Kostya", 15));
    customers.add(new Customer(2,"Oleg",29));
    customers.add(new Customer(3,"Nastya",54));
    customers.add(new Customer(4,"Bob",84));
    customers.add(new Customer(5,"Lilya",42));

    books.add(new Book(1,"Classroom of elite", "Shōgo Kinugasa", 500, BookGenre.RANOBE));
    books.add(new Book(2,"METRO 2033", "Dmytro Hlukhovskyi", 450, BookGenre.ROMAN));
    books.add(new Book(3,"Robinson Crusoe", "Daniel Defoe", 108, BookGenre.ROMAN));
    books.add(new Book(4,"Kaidash family", "Ivan Semenovych Nechuy-Levytskyi", 100, BookGenre.POVIST));
    books.add(new Book(5,"Gulliver's Travels", "Jonathan Swift", 150, BookGenre.ROMAN));
    books.add(new Book(6,"The mind of a killer", "Mike Omer", 200, BookGenre.EPOS));
    books.add(new Book(7,"On the blade of the blade", "Joe Abercrombie", 250, BookGenre.EPOS));
    books.add(new Book(8,"Ivanhoe", "Walter Scott", 270, BookGenre.ROMAN));
    books.add(new Book(9,"Robin Hood", "", 250, BookGenre.EPOS));
    books.add(new Book(10,"Demos Highs School", "Ishibumi Ichiei", 450, BookGenre.ROMAN));

    orders.add(new Order(1,1,1, new long[]{7, 8, 9}));
    orders.add(new Order(2,1,3, new long[]{1}));
    orders.add(new Order(3,4,2, new long[]{1, 2, 3}));
    orders.add(new Order(4,5,3, new long[]{10, 3, 7, 12}));
    orders.add(new Order(5,6,4, new long[]{2, 5}));






}


}

