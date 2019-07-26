import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

public class ServletController implements Servlet{
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Enumeration<String> configs = getServletConfig().getInitParameterNames();
        while (configs.hasMoreElements()){
            System.out.println(configs.nextElement()+".....................");
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
        Enumeration<String> configs = config.getInitParameterNames();
        while (configs.hasMoreElements()){
            System.out.println(configs.nextElement()+".....................");
        }
        System.out.println(config.getInitParameterNames());
        System.out.println("ServletController init..............."+new Date());
    }
}
