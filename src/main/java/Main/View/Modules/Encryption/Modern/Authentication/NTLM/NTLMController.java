package Main.View.Modules.Encryption.Modern.Authentication.NTLM;

import Kit.Utils.ViewUtils;
import Main.Controller.Encryption.Modern.Authentication.NTLM.Authentication_NTLM;
import Main.View.Viewobj.ViewControllerObject;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import org.apache.commons.codec.binary.Hex;

public class NTLMController extends ViewControllerObject {
    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    public void ONClickConfirm() {
        super.ONClickConfirm();
        try {
            JTA_dst.setText(Hex.encodeHexString(Authentication_NTLM.encrypt(JTA_src.getText())));
        }catch (Exception e){
            ViewUtils.textAreaValidate(JTA_dst);
        }
    }
}
