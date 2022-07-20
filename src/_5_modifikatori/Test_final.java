package _5_modifikatori;

public class Test_final {
    final int value = 10;

    public static final int BOXWIDTH = 6;
    static  final String TITLE = "Менеджер";

    public void changeValue(){
        System.out.println(value);

        System.out.println(BOXWIDTH);

        System.out.println(TITLE);
    }

    public transient int linit = 55;  // не будет сохранится

    public int b;  // будет сохранится



    public static void main(String[] args) {
        Test_final test = new Test_final();
        test.changeValue();
    }


}
