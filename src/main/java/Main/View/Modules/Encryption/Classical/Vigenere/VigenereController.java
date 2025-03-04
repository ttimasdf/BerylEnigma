package Main.View.Modules.Encryption.Classical.Vigenere;


import Kit.Utils.ViewUtils;
import Main.Controller.Encryption.Classical.Vigenere.Classical_Vigenere;
import Main.View.Viewobj.ViewControllerObject;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;

public class VigenereController extends ViewControllerObject {

    @FXML private JFXTextArea JTA_key;

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    public void ONClickEncode() {
        super.ONClickEncode();
        try {
            JTA_dst.setText(Classical_Vigenere.encrypt(JTA_src.getText(),JTA_key.getText()));
        }catch (Exception e){
            ViewUtils.textAreaValidate(JTA_dst);
        }
    }

    @Override
    public void ONClickDecode() {
        super.ONClickDecode();
        try {
            JTA_dst.setText(Classical_Vigenere.decrypt(JTA_src.getText(),JTA_key.getText()));
        }catch (Exception e){
            ViewUtils.textAreaValidate(JTA_dst);
        }
    }
}
