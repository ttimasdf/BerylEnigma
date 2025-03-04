package Main.View.Viewobj;

import Init.ViewInit;
import Kit.Utils.ViewUtils;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;

/**
 * @author: RyuZUSUNC
 * @create: 2021-03-12 13:48
 **/

public class ViewControllerObject {
    @FXML
    public JFXButton JBT_enCode;
    @FXML
    public JFXButton JBT_deCode;
    @FXML
    public JFXButton JBT_confirm;
    @FXML
    public JFXTextArea JTA_src;
    @FXML
    public JFXTextArea JTA_src1;
    @FXML
    public JFXTextArea JTA_src2;
    @FXML
    public JFXTextArea JTA_src3;
    @FXML
    public JFXTextArea JTA_src4;
    @FXML
    public JFXTextArea JTA_src5;
    @FXML
    public JFXTextArea JTA_dst;
    @FXML
    public JFXTextArea JTA_dst1;
    @FXML
    public JFXTextArea JTA_dst2;
    @FXML
    public JFXTextArea JTA_dst3;
    @FXML
    public JFXTextArea JTA_dst4;
    @FXML
    public JFXTextArea JTA_dst5;

    /**
     * 全局界面初始化
     */
    @FXML
    protected void initialize(){
        ViewInit.textAreaErrorInfoGeneral(JTA_dst);
        System.out.println("Father init");
    }

    /**
     * 全局加密按钮事件
     */
    @FXML
    public void ONClickEncode(){
        ViewUtils.textAreaValidateResrt(JTA_dst);
        System.out.println("Father JBT_enCode");
    }

    /**
     * 全局解密按钮事件
     */
    @FXML
    public void ONClickDecode(){
        ViewUtils.textAreaValidateResrt(JTA_dst);
        System.out.println("Father JBT_deCode");
    }


    /**
     * 全局确定按钮事件
     */
    @FXML
    public void ONClickConfirm(){
        ViewUtils.textAreaValidateResrt(JTA_dst);
        System.out.println("Father JBT_confirm");
    }


    /**
     * 全局输入与控件选取事件
     */
    @FXML
    public void ONReleasedOrSelected(){
        ViewUtils.textAreaValidateResrt(JTA_dst);
        System.out.println("Father InputSelect");
    }

}
