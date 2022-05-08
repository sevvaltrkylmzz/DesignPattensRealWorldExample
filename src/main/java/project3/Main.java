package project3;

public class Main {
    public static void main(String[] args) {
        Publisher lgPublisher = new Publisher(Brand.LG,2000,"Out Of Stock");
        Subscriber customer1=new Subscriber("Anna",lgPublisher);
        Subscriber customer2=new Subscriber("Tom",lgPublisher);
        Subscriber customer3=new Subscriber("Jan",lgPublisher);
        System.out.println("LG current state : "+ lgPublisher.getAvailability());
        lgPublisher.setAvailability("Available");
        System.out.println("-----------------------------------------");
        Publisher applePublisher = new Publisher(Brand.APPLE,10000,"Out Of Stock");
        Subscriber customer4=new Subscriber("Sevval",applePublisher);
        System.out.println("Apple current state : "+ applePublisher.getAvailability());
        applePublisher.setAvailability("Available");
        System.out.println("-----------------------------------------");
        Publisher samsungPusblisher = new Publisher(Brand.SAMSUNG, 5000, "Out of Stock");
        Subscriber customer5 = new Subscriber("Sevcan", samsungPusblisher);
        Subscriber customer6 = new Subscriber("Yağmur", samsungPusblisher);
        Subscriber customer7 = new Subscriber("Can", samsungPusblisher);
        System.out.println("Samsung current state: "+ samsungPusblisher.getAvailability());
        samsungPusblisher.setAvailability("Available");
    }
}
