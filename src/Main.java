import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook programmingBook = new ProgrammingBook("MV1", "A dua", 90, "A dua", "tien em", "A Dua");
        ProgrammingBook programmingBook1 = new ProgrammingBook("MV1", "A dua", 90, "A dua", "tien em", "A Dua");
        ProgrammingBook programmingBook2 = new ProgrammingBook("MV1", "A dua", 90, "A dua", "tien em", "A Dua");
        ProgrammingBook programmingBook3 = new ProgrammingBook("MV1", "A dua", 90, "A dua", "tien em", "A Dua");
        ProgrammingBook programmingBook4 = new ProgrammingBook("MV1", "A dua", 90, "A dua", "tien em", "A Dua");
        ProgrammingBook programmingBook5 = new ProgrammingBook("MV1", "A dua", 90, "A dua", "java", "A Dua");
        FictionBook fictionBook=new FictionBook("11","meo con",190,"meo con","vinh tuong");
        FictionBook fictionBook1=new FictionBook("11","meo con",190,"meo con","vinh tuong");
        FictionBook fictionBook2=new FictionBook("11","meo con",190,"meo con","vinh tuong");
        FictionBook fictionBook3=new FictionBook("11","meo con",190,"meo con","vinh tuong");
        FictionBook fictionBook4=new FictionBook("11","meo con",90,"meo con","vinh tuong");
        List<Books> programmingBooksList = new ArrayList<>(List.of(programmingBook, programmingBook1,
                programmingBook2, programmingBook3, programmingBook4, programmingBook5,fictionBook,fictionBook1,
                fictionBook2,fictionBook3,fictionBook4));
        System.out.println(programmingBooksList+" ");
        double total=0;
        for (Books books : programmingBooksList) {
           total += books.getPrice();
        }
        System.out.println("Tong so tien sach"+" :" +total);
        List<FictionBook>fictionBooksList=new ArrayList<>();
        List<ProgrammingBook>programmingBookArrayList=new ArrayList<>();
        int count=0;
        for (Books book : programmingBooksList) {
            if (book instanceof FictionBook) {
                fictionBooksList.add((FictionBook) book);
                if (((FictionBook) book).getCategory().equals("vinh tuong")) {
                    count++;
                }
            }
        }
        int total1=0;
        for (Books book : programmingBooksList) {
            if (book instanceof FictionBook) {
                fictionBooksList.add((FictionBook) book);
                if (((FictionBook) book).getPrice()<100) {
                    total1++;

                }
            }
        }
        System.out.println("So sach co gia tien nho hon >100"+":"+total1);
        System.out.println("So sach co ten la vinh tuong"+": "+count);
        int check=0;
        for (Books books :programmingBooksList) {
            if(books instanceof ProgrammingBook){
                programmingBookArrayList.add((ProgrammingBook) books);
                if(((ProgrammingBook)books).getLanguage().equals("java")){
                    check++;
                }
            }
        }
        System.out.println("So sach co category JAVA la "+": "+ check);

    }
}
