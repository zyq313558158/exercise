import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

public class ServletController implements Servlet{

    ServletConfig config;
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Enumeration<String> contextConfigs = getServletConfig().getServletContext().getInitParameterNames();
        int i = 1;
        while(contextConfigs.hasMoreElements()){
            String nextElement = contextConfigs.nextElement();
            System.out.println("第"+i+"个参数：key,"+nextElement+",value,"+
                    getServletConfig().getServletContext().getInitParameter(nextElement));
            i++;
        }

        Enumeration<String> configs = getServletConfig().getInitParameterNames();
        int num = 1;
        while(configs.hasMoreElements()){
            String nextElement = configs.nextElement();
            System.out.println("第"+num+"个参数：key,"+nextElement+",value,"+
                    getServletConfig().getInitParameter((nextElement)));
            num++;
        }
        System.out.println("ServletController service..............."+new Date());
        req.setAttribute("servlet","ServletController....."+new Date());
        req.getRequestDispatcher("/servlet.jsp").forward(req,res);
    }

    @Override
    public void destroy() {
        System.out.println("ServletController destroy..............."+new Date());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        Enumeration<String> configs = config.getInitParameterNames();
        while (configs.hasMoreElements()){
            System.out.println(configs.nextElement()+".....................");
        }
        System.out.println(config.getInitParameterNames());
        getServletConfig();
        System.out.println("ServletController init..............."+new Date());
    }
}
