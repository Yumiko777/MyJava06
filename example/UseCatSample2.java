// javac example/UseCatSample.java
package example;

public class UseCatSample2 {
    public static void main(String[] args) {
        Cat tama = new Cat();
        Cat mike = new Cat();

// フィールドの名前と年齢を設定
        tama.setName("タマ");
        tama.setAge(3);
        mike.setName("みけ");
        mike.setAge(2);
        tama.introduceMyself();
        mike.introduceMyself();
    }
    
}
