class OldPS2Keyboard implements PS2Keyboard {
    @Override
    public void plugInPS2() {
        System.out.println("Connected via PS/2");
    }

    @Override
    public void typePS2(String text) {
        System.out.println("Typed: " + text + " (PS/2)");
    }
}

class NewComputer {
    public void useKeyboard(USBKeyboard keyboard, String text) {
        keyboard.plugInUSB();
        keyboard.typeUSB(text);
    }
}
