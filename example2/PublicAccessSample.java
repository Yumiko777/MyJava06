// カプセル化
package example2;

// Catクラスをインポート　別パッケージのクラスはインポートして使う　import パッケージ名.クラス名;
import example.Cat;

public class PublicAccessSample {
    public static void main(String[] args) {
        // Catクラスからtamaインスタンスを生成
        Cat tama = new Cat();
        // CatクラスのsetNameメソッドを呼び出す
        tama.setName("タマ");
        tama.setAge(3);

        tama.eat();
        tama.playToy("ボール");
        tama.introduceMyself();
        // // CatクラスのgetNameメソッドを呼び出す
        // System.out.println(tama.getName());
        // tama.setAge(3);
        // System.out.println(tama.getAge());

    }
}
