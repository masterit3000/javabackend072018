/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlassvodanh.event;

/**
 *
 * @author Admin
 */
public class TextBox {

    private ITypingText typingText;

    public void setTypingText(ITypingText typingText) {
        this.typingText = typingText;
    }

    public ITypingText getTypingText() {
        return typingText;
    }

    public void goPhim(String content) {
        typingText.typing(content);
    }

}
