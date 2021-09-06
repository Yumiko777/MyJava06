package example;

public class EncapsulationSample {
    public static void main(String[] args) {
        Cat tama = new Cat();
        tama.setName("タマ");
        System.out.println(tama.getName());
        // tama.name = "タマ";
        // System.out.println(tama.name);
    }
    
}
