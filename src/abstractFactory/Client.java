package abstractFactory;

import abstractFactory.abstractFactoryInterfaces.ScrollBar;
import abstractFactory.abstractFactoryInterfaces.WidgetFactory;
import abstractFactory.abstractFactoryInterfaces.Window;
import abstractFactory.pinkTheme.PinkThemeWidgetFactory;
import abstractFactory.yellowTheme.YellowThemeWidgetFactory;

/**
 * Created by mics on 4/14/16.
 */
public class Client {
    public static void initializeGUI(WidgetFactory factory){
        initializeGUI(factory.createScrollBar(), factory.createWindow());
    }

    public static void initializeGUI(ScrollBar scrollBar, Window window){
        System.out.println("Do initialize logic here with " + scrollBar.getClass().getName() + " and " +
                        window.getClass().getName());
    }

    public static void main(String[] args) {
        WidgetFactory widgetFactory = new PinkThemeWidgetFactory();
        initializeGUI(widgetFactory);

        widgetFactory = new YellowThemeWidgetFactory();
        initializeGUI(widgetFactory);
    }
}
