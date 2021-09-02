package example;

public class Cat {
    // フィールドの定義　クラスのブロック内で定義
    String name;
    int age;
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
// nameフィールドのセッターを追加　セッターはフィールドに値を設定するメソッド
    void setName(String catName) {
        name = catName;
    }

    // nameフィールドのゲッターを追加 ゲッターはフィールドの値を戻り値で返すメソッド
    String getName() {
        return name;
    }

    void setAge(int catAge) {
        age = catAge;
    }

    int getAge() {
        return age;
    }

    void introduceMyself() {
        // getNameメソッドを呼び出す
        String n = getName();
        int a = getAge();
        System.out.println("名前は" + n + "です、" + a + "歳です。");
    }
}