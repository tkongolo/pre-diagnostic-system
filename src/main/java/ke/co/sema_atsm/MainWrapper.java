package ke.co.sema_atsm;

import java.lang.reflect.Method;

public class MainWrapper {
    public static void main(String[] args)throws Exception{
        Class<?> app = Class.forName("ke.co.sema_atsm.App");
        Method main = app.getDeclaredMethod("main", String[].class);
        System.setProperty("com.sun.javafx.isEmbedded","true");
        System.setProperty("com.sun.javafx.virtualKeyboard","javafx");
        System.setProperty("com.sun.javafx.touch","true");
        Object[] arguments = new Object[]{args};
        main.invoke(null, arguments);
    }
}
