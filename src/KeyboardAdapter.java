class KeyboardAdapter implements USBKeyboard {
    private final PS2Keyboard ps2Keyboard;

    public KeyboardAdapter(PS2Keyboard ps2Keyboard) {
        this.ps2Keyboard = ps2Keyboard;
    }

    @Override
    public void plugInUSB() {
        // Адаптируем вызов к PS/2-клавиатуре
        ps2Keyboard.plugInPS2();
    }

    @Override
    public void typeUSB(String text) {
        // Адаптируем вызов к PS/2-клавиатуре
        ps2Keyboard.typePS2(text);
    }
}
