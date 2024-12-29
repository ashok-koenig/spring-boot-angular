class Animal{
    private String name;
    final private String type= "animal";
    void setName(String name){
        this.name=name;
    }
   final void showMe(){
        System.out.println(this.name + " is a "+ type);
    }
}

final class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }

    // Not possible to override final method
//    void showMe(){
//        System.out.println(this.name + " is a "+ type);
//    }

}

// Cat class cann't be extended since its a final class.
//class Tiger extends Cat{
//
//}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.setName("Monkey");
        obj.showMe();
    }
}
