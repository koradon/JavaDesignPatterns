package abstractFactory.pinkTheme;

import abstractFactory.abstractFactoryInterfaces.ScrollBar;
import abstractFactory.abstractFactoryInterfaces.WidgetFactory;
import abstractFactory.abstractFactoryInterfaces.Window;

/**
 * Created by mics on 4/14/16.
 */
public class PinkThemeWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new PinkThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PinkThemeWindow();
    }
}
