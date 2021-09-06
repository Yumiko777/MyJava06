package example;



public class ConstructorSample {
    public static void main(String[] args) {
        // System.out.println("--- new Cat()でインスタンスを生成する ---");
        // // インスタンスを生成、コンストラクターを呼び出す
        // Cat tama = new Cat();

        // System.out.println();
        // System.out.println("--- setNmae/setaaaaAgeする前に、自己紹介させる ---");
        // tama.introduceMyself();

        // tama.setName("タマ");
        // tama.setAge(3);

        // System.out.println();
        // System.out.println("--- setName/setAgeした後で、自己紹介させる");
        // tama.introduceMyself();

        // 引数があるコンストラクターを呼び出す
        // System.out.println("--- new Cat(¥"タマ¥")でインスタンスを生成する---");
        Cat tama = new Cat("タマ");

        System.out.println();
        System.out.println("--- インスタンス生成直後、自己紹介させる ---");
        tama.introduceMyself();
    }
    
}
