package example;

public class Cat {
    // フィールドの定義　クラスのブロック内で定義
    String name;
    int age;
    boolean hungry;

    // praivateなprintMessageメソッドを定義
    private void printMessage(String message) {
        System.out.println(name +  "> " + message);
    }

    // ご飯を食べるメソッドを定義
    public void eat() {
        printMessage("ご飯を食べるよ!おいしいにゃー");
        printMessage("お腹が一杯になったにゃー");  
        // hungryフィールドにfalseを代入
        hungry = false;     
    }

    // 空腹状態を教えるメソッドを定義　戻り値を持つメソッドの定義
    // boolean値を返すメソッドは状態を伝えるという意味を込めて「is○○」という名前を付ける慣習がある
    public boolean isHungry() {
        // hungryフィールドの値を返す
        return hungry;
    }

    public void playToy(String toy) {
        printMessage(toy + "で遊ぶよ。楽しいにゃー");
        printMessage("遊んでお腹が減ったにゃー");
        hungry = true;
    }
// nameフィールドのセッターを追加　セッターはフィールドに値を設定するメソッド
    public void setName(String catName) {
        name = catName;
    }

    // nameフィールドのゲッターを追加 ゲッターはフィールドの値を戻り値で返すメソッド
    public String getName() {
        return name;
    }

    public void setAge(int catAge) {
        age = catAge;
    }

    public int getAge() {
        return age;
    }

    public void introduceMyself() {
        // getNameメソッドを呼び出す
        String n = getName();
        int a = getAge();
        printMessage("名前は" + getName() + "です、" + getAge() + "歳です。");
    }
}