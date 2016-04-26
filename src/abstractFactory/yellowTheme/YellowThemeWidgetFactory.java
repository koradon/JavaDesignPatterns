package abstractFactory.yellowTheme;

import abstractFactory.abstractFactoryInterfaces.ScrollBar;
import abstractFactory.abstractFactoryInterfaces.WidgetFactory;
import abstractFactory.abstractFactoryInterfaces.Window;

/**
 * Created by mics on 4/14/16.
 */
public class YellowThemeWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new YellowThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new YellowThemeWindow();
    }
}
