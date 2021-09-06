package example;

public class OverloadaSample {
    public static void main(String[] args) {
        Cat tama = new Cat();
        tama.setName("タマ");
        tama.setAge(3);

        System.out.println("--- tama.eat()を呼び出す ---");
        // Catクラスのeat()メソッドを呼び出す
        tama.eat();

        // System.out.println();
        // System.out.println("--- tama.eat(¥"贅沢なキャットフード¥")を呼び出す ---");
        // tama.eat("贅沢なキャットフード");

        // System.out.println();
        // System.out.println("--- tama.playTOy(¥"ボール¥")を呼び出す ---");
        // tama.playToy("ボール");

        System.out.println();
        System.out.println("--- tama.playTOy()を呼び出す ---");
        tama.playToy();
        
    }
    
}
