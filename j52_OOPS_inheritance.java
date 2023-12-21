class Animal{
    boolean care;
    String food;
    String sound;

    public boolean isCare() {
        return care;
    }

    public void setCare(boolean care) {
        this.care = care;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

class dog extends Animal{
    boolean cute;

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }
}


public class j52_OOPS_inheritance {
    public static void main(String[] args) {
        
        Animal myPet = new Animal();
        myPet.setCare(false);
        myPet.setFood("Shampoo ki tatti!!");
        myPet.setSound("Human Voice");
        dog Shampoo = new dog();
        Shampoo.setFood("Dog Food");
        Shampoo.setCute(true);
        Shampoo.setCare(true);
        Shampoo.setSound("Barking");

        System.out.println("My Husband name is Jahn Rathore. I have a dog Shampoo who eats " + Shampoo.getFood() + " and my husband eats " + myPet.getFood());

        
    }
}
