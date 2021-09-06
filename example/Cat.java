package example;

public class Cat {
    // フィールドの定義　クラスのブロック内で定義
    // フィールド定義のアクセス修飾子としてprivateを付けるとクラス外からフィールドにアクセスできなくなる。
    private String name;
    private int age;
    private boolean hungry;

    // コンストラクターを定義 メソッド名は必ずクラス名と同じにする
    public Cat() {
        System.out.println("コンストラクター:Cat()が呼び出された");
        // nameフィールドに代入
        this.name = "まだない";
        this.age = 0;
    }

    // 引数のあるコンストラクターを定義
    public Cat(String name, int age) {
        System.out.println("コンストラクター:Cat(String name, int age) が呼び出された");
        // 引数nameをnameフィールドに代入
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        // this()を使ってオーバーロードした別のコンストラクターを呼び出せる
        this(name, 0);
        System.out.println("コンストラクター:Cat(String name)が呼び出された");
    }

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

    public void eat(String food) {
        printMessage(food + "を食べるよ！おいしいにゃー");
        printMessage("お腹が一杯になったにゃー");
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

    public void playToy() {
        printMessage("おもちゃで遊ぶよ。楽しいにゃー");
        printMessage("遊んでお腹が減ったにゃー");
        hungry = true;
    }
// nameフィールドのセッターを追加　セッターはフィールドに値を設定するメソッド
    public void setName(String catName) {
        name = catName;
    }

    // nameフィールドのゲッターを追加 ゲッターはフィールドの値を戻り値で返すメソッド（フィールドの値を取得するためのメソッド）
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