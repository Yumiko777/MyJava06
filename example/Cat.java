package example;

public class Cat {
    // フィールドの定義　クラスのブロック内で定義
    String name;
    boolean hungry;

    // ご飯を食べるメソッドを定義
    void eat() {
        System.out.println(name + "> ご飯を食べるよ!おいしいにゃー");
        System.out.println(name + "> お腹が一杯になったにゃー");  
        // hungryフィールドにfalseを代入
        hungry = false;     
    }

    // 空腹状態を教えるメソッドを定義　戻り値を持つメソッドの定義
    // boolean値を返すメソッドは状態を伝えるという意味を込めて「is○○」という名前を付ける慣習がある
    boolean isHungry() {
        // hungryフィールドの値を返す
        return hungry;
    }

    void playToy(String toy) {
        System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃー");
        System.out.println(name + "> 遊んでお腹が減ったにゃー");
        hungry = true;
    }
}