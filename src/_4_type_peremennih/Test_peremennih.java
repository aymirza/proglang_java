package _4_type_peremennih;

import _5_modifikatori.Test_final;

public class Test_peremennih {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Возаст щенка: " + age);
    }

    public static void main(String[] args) {
        Test_peremennih test_peremennih = new Test_peremennih();
        test_peremennih.pupAge();
    }
}
