package Steps;

import Base.BaseUtil;
import Pages.TemplatePage;

public class TemplateSD extends BaseUtil {
    private BaseUtil base;
    TemplatePage page;

    public TemplateSD(BaseUtil base){
        page = new TemplatePage(base.Web_Driver);
        this.base = base;
    }
}
