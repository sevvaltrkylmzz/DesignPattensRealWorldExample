package project3;

public class Main {
    public static void main(String[] args) {
        Publisher lgPublisher = new Publisher(Brand.LG,2000,"Out Of Stock");
        Subscriber customer1=new Subscriber("Anna",lgPublisher);
        Subscriber customer2=new Subscriber("Tom",lgPublisher);
        Subscriber customer3=new Subscriber("Jan",lgPublisher);
        System.out.println("LG current state : "+ lgPublisher.getAvailability());
        lgPublisher.setAvailability("Available");
        Publisher applePublisher = new Publisher(Brand.APPLE,10000,"Out Of Stock");
        Subscriber customer4=new Subscriber("Sevval",applePublisher);
        System.out.println("Apple current state : "+ applePublisher.getAvailability());
        applePublisher.setAvailability("Available");
        System.out.println("");
    }
}
