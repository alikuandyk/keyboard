public class Main {
    public static void main(String[] args) {
        PS2Keyboard ps2Keyboard = new OldPS2Keyboard();
        USBKeyboard adapter = new KeyboardAdapter(ps2Keyboard);
        NewComputer computer = new NewComputer();

        computer.useKeyboard(adapter, "Hello, world!");
    }
}
