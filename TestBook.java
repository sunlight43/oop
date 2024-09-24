public class TestBook {
   public static void main(String[] args) {
      
      Author ahTeck = new Author("Alfredo Formacil", "formacilalfredo43@gmail.com", 'm');
      System.out.println(ahTeck);
      
      Book dummyBook = new Book ("Java for dummies", ahTeck, 9.99, 99);
      System.out.println(dummyBook);
      
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println("Name is: " + dummyBook.getName());
      
      System.out.println("price is: " + dummyBook.getPrice());
      
      System.out.println("Qty is: " + dummyBook.getQty());
      
      System.out.println("Author is: " + dummyBook.getAuthor());
      
      System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
      System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
      System.out.println("Author's gender is: " + dummyBook.getAuthor().getGender());
      
      Book moreDummyBook = new Book ("Jave for dummies",
         new Author ("Alfredo D. Formacil", "formacilalfredo43@gmail.com", 'm'),
         19.99,8);
      System.out.println(moreDummyBook);
      }
}
