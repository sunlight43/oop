public class Book {

   private String name;
   private Author author [] = new Author [2];
   private double price;
   private int qty = 0;
   
   public Book(String name, Author authors [], double price, int qty) {
      this.name = name;
      authors [0] = new Author("Alfredo D. Formacil", "formacilalfredo43@gmail.com", 'm');
      authors [1] = new Author("Alfredo D. Formacil", "formacilalfredo434@gmail.com", 'm');
      this.price = price;
      this.qty = qty;
   }
   
   public String getName() {
      return name;
   }
   
   public Author getAuthor() {
      return authors[authors.length];
   }
   
   public double getPrice() {
      return price;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   public int getQty() {
      return qty;
   }
   
   public void setQty(int qty) {
      this.qty = qty;
   }
   
   public String toString() {
        return "Book [name = " + name + " authors = " + authors[0] + " email = " + authors[0].getEmail() + " price = " + price + " qty = " + qty + "]";
    }
    public String getAuthorNames() {
        return authors[].getName();
}

    public String getAuthorEmails() {
        return authors[].getEmail();
    }

    public char getAuthorGenders() {
        return authors[].getGender();
   }
}
