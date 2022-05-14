public class Hello {
    public static void main(String[] args) {

        // 出力用の変数を作成
        String hello = "Hello";
        String world = "World!";

        // Hello World! をコンソールへ出力
        System.out.println(hello + world);
        System.out.println("------------------------");
        
        // Hello World! を10回出力
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "回目の" + hello + world);
        }
        System.out.println("------------------------");

        //　Hello World! を15回出力 ※11回目からはHelloのみ出力
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + "回目の");
            if (i < 10) {
                System.out.println(hello + world);
            } else {
                System.out.println(hello);
            }
        }
        System.out.println("------------------------");
    }
}
