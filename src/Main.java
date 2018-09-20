public class Main {

    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("brown roll", "quorn", 4.00);
        hamburger.addAddition("avocado", 0.50);
        hamburger.addAddition("mayo", 0.20);
        hamburger.addAddition("tomato", 0.30);
        hamburger.addAddition("jalapenos", 3.00);

        System.out.println("Hamburger will cost: £" + hamburger.getPrice());
        System.out.println("Contents: ");
        System.out.println("  " + hamburger.getBreadType() + "bread roll");
        System.out.println("  " + hamburger.getMeatType() + "meat");

        for (int i = 0; i < hamburger.getAdditions().size(); i++){
            System.out.println("  " + hamburger.getAdditions().get(i));
        }
    }
}
