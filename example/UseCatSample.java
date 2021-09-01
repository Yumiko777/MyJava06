// javac example/UseCatSample.java
package example;

public class UseCatSample {
    public static void main(String[] args) {
        // 型（クラス名）　変数名 = new クラス名
        // Catクラス型のインスタンス生成
        Cat tama = new Cat();
        // nameフィールドにタマを代入
        tama.name = "タマ";
        tama.eat();
        tama.playToy("ひも");
        // メソッドの戻り値は変数などに入れる
        boolean h = tama.isHungry();
        if(h == true){
            System.out.println("お腹が空いてるにゃー!");
        } else{
            System.out.println("お腹は空いていないにゃー!");
        }
    }
    
}
