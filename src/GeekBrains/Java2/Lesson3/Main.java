package GeekBrains.Java2.Lesson3;


public class Main {

    public static void main(String[] args) {

        //task1
        String[] words = {"lemon", "banana","orange","pitch", "dog", "cat","dolphin", "gitara", "milk","coffee", "cake","tea","watter", "lemon", "banana","milk","java","java"};
        ArrayWords arrayWords = new ArrayWords(words);
        arrayWords.getCountUnique();
        arrayWords.countWords();

        //task2
        PhoneBook contacts = new PhoneBook();
        contacts.add("5N", "1234423432");
        contacts.add("5N", "55555432");
        contacts.add("5N", "888855432");
        contacts.add("5N", "888855432");
        System.out.println("Phone numbers for contact: " + contacts.getContact("5N"));
    }
}
