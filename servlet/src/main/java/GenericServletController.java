import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

public class GenericServletController extends GenericServlet {
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

        Enumeration<String> initParameterNames= getInitParameterNames();
        int num = 1;
        while(initParameterNames.hasMoreElements()){
            String nextElement = initParameterNames.nextElement();
            System.out.println("第"+num+"个参数：key,"+nextElement+",value,"+
                    getServletConfig().getInitParameter((nextElement)));
            num++;
        }
        System.out.println("GenericServletController service..............."+new Date());
        req.setAttribute("servlet","GenericServletController....."+new Date());
        req.getRequestDispatcher("/servlet.jsp").forward(req,res);
    }
}
